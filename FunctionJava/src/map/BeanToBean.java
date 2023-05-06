package map;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import jsonArrayToList.JsonArrayToList;
import testBO.ParamBO;
import testBO.Param_BO;
import testBO.TBO;
import testBO.Test_BO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Description：
 * @author 鲁先生
 * @date 2022/6/9 8:56
 */
public class BeanToBean {

  public static void main(String[] args) {

    Test_BO   tbo = new Test_BO();
    tbo.setID(11);
    tbo.setSTR_SSS(18);
    tbo.setUSER_NAME("哈哈");
    tbo.setUSER_CID(123123);
    List<String> stringList = new ArrayList<>();
    stringList.add("a");
    stringList.add("b");
    stringList.add("c");
    stringList.add("d");
    tbo.setStringList(stringList);
    // bean 转map 驼峰转下划线
    Map<String, Object> map= BeanUtil.beanToMap(tbo,true,false);
    System.out.println(map);


    // map 转 bean  下划线 转驼峰 不区分大小写
    TBO person = BeanUtil.fillBeanWithMapIgnoreCase(map, new TBO(), false);
    System.out.println(person);

    //  bean  转json
    String json =   JSON.toJSONString(person);
    System.out.println(json );
    //  bean  转json
    String jsonMap =   JSONUtil.toJsonStr(map);
    String[] strArray = Convert.toStrArray(map);

    System.out.println("jsonMap "+jsonMap );
    System.out.println("strArray "+ Arrays.toString(strArray) );
    /* TestBO testBO = new TestBO();
    person.getStringList().forEach(param ->{
      System.out.println(param);
      CglibUtil.copy(person,testBO);
      System.out.println(testBO);
    });*/

    JSONObject jsonObject = JSON.parseObject(jsonMap);
    String str_sss = jsonObject.getString("STR_SSS");
    System.out.println(jsonObject.toJSONString());
    System.out.println(str_sss);


    Param_BO param_bo = new Param_BO();
    param_bo.setUU_ID(1);
    param_bo.setUSER_NAME("2");
    param_bo.setUSER_AGE("3");
    param_bo.setUSER_ADREE("qd");
    Param_BO param_bo1 = new Param_BO();
    param_bo1.setUU_ID(11);
    param_bo1.setUSER_NAME("22");
    param_bo1.setUSER_AGE("33");
    param_bo1.setUSER_ADREE("qd");
    Param_BO param_bo2 = new Param_BO();
    param_bo2.setUU_ID(111);
    param_bo2.setUSER_NAME("222");
    param_bo2.setUSER_AGE("333");
    param_bo2.setUSER_ADREE("qd");
    List<Param_BO> boList = new ArrayList<>();
    boList.add(param_bo);
    boList.add(param_bo1);
    boList.add(param_bo2);
    JSONArray objects = JSONUtil.parseArray(boList, true);
    System.out.println(objects.toString());
    System.out.println("见证奇迹的时刻");
    // 解决 JSONArray  转成bean 对象赋值为空的问题
    List<ParamBO> paramBOList = JSONUtil.toList(objects,ParamBO.class);
    System.out.println(paramBOList);
  }
}
