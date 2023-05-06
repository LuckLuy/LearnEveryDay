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
 * @Description：驼峰转下划线
 * @author 鲁先生
 * @date 2022/6/16 17:58
 */
public class HumpToUnderscore {
  public static void main(String[] args) {

    HumpParam humpParam = new HumpParam();
    humpParam.setUserId(1);
    humpParam.setUserName("三儿");
    humpParam.setUserAge("18");
    humpParam.setUserAdree("qd");

    // 驼峰转下划线
    Hump_Param hump_param = JSON.parseObject(JSONUtil.toJsonStr(humpParam),Hump_Param.class);
    System.out.println(hump_param);
    System.out.println("*********************");


    // 下划线转驼峰
    Hump_Param param = new Hump_Param();
    param.setUSER_ID(2);
    param.setUSER_NAME("小五");
    param.setUSER_AGE("18");
    Hump_Param param2 = new Hump_Param();
    param2.setUSER_ID(3);
    param2.setUSER_NAME("小六");
    param2.setUSER_AGE("18");
    param2.setUSER_ADREE("bj");

    Hump_Param param3 = new Hump_Param();
    param3.setUSER_ID(3);
    param3.setUSER_NAME("小六");
    param3.setUSER_AGE("18");
    param3.setUSER_ADREE("bj");

    List<Hump_Param> list = new ArrayList<>();
    list.add(param);
    list.add(param2);
    list.add(param3);

    // list 转换数组
    JSONArray objects = JSONUtil.parseArray(JSONUtil.toJsonStr(list));
    System.out.println(objects);

    // 数组 转换list
    // 下划线转换驼峰命名格式
    List<HumpParamTwo> humpParamList = JSONUtil.toList(objects,HumpParamTwo.class);
    System.out.println(humpParamList);



  }
}
