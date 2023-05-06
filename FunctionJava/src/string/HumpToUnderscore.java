package string;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONNull;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import netscape.javascript.JSUtil;
import testBO.HumpParam;
import testBO.HumpParamTwo;
import testBO.Hump_Param;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.alibaba.fastjson.JSONValidator.Type.Array;

/**
 * @Description���շ�ת�»���
 * @author ³����
 * @date 2022/6/16 17:58
 */
public class HumpToUnderscore {
  public static void main(String[] args) {

    HumpParam humpParam = new HumpParam();
    humpParam.setUserId(1);
    humpParam.setUserName("����");
    humpParam.setUserAge("18");
    humpParam.setUserAdree("qd");

    // �շ�ת�»���
    Hump_Param hump_param = JSON.parseObject(JSONUtil.toJsonStr(humpParam),Hump_Param.class);
    System.out.println(hump_param);
    System.out.println("*********************");


    // �»���ת�շ�
    Hump_Param param = new Hump_Param();
    param.setUSER_ID(2);
    param.setUSER_NAME("С��");
    param.setUSER_AGE("18");
    Hump_Param param2 = new Hump_Param();
    param2.setUSER_ID(3);
    param2.setUSER_NAME("С��");
    param2.setUSER_AGE("18");
    param2.setUSER_ADREE("bj");

    Hump_Param param3 = new Hump_Param();
    param3.setUSER_ID(3);
    param3.setUSER_NAME("С��");
    param3.setUSER_AGE("18");
    param3.setUSER_ADREE("bj");

    List<Hump_Param> list = new ArrayList<>();
    list.add(param);
    list.add(param2);
    list.add(param3);

    // list ת������
    JSONArray objects = JSONUtil.parseArray(JSONUtil.toJsonStr(list));
    System.out.println(objects);

    // ���� ת��list
    // �»���ת���շ�������ʽ
    List<HumpParamTwo> humpParamList = JSONUtil.toList(objects,HumpParamTwo.class);
    System.out.println(humpParamList);



  }
}
