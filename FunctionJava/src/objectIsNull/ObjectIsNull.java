package objectIsNull;

import cn.hutool.core.util.ObjectUtil;
import comm.CommonFunction;
import entity.TestData;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author 鲁先生
 * @Description：
 * @date 2021/9/14 17:45
 */
public class ObjectIsNull {

  public static void main(String[] args) {
  /**
   * @description ：  判断所有的参数都是null  都是null 时 返回true否则false
   * @author 鲁先生
   * @date 2021/9/15 11:03
   * @param
   * @return void
   */
    //TestData user = new TestData();
    TestData user = new TestData("123","男性","18");
    System.out.println(user);
    //使用基础的反射工具类
    System.out.println( CommonFunction.objCheckIsNull(user));
    //在判断中剔除 value 为男性的属性
    System.out.println( CommonFunction.objCheckIsNull(user,null, Collections.singletonList("男性")));
    System.out.println( CommonFunction.objCheckIsNull(user,null, Collections.singletonList("123")));

    System.out.println( CommonFunction.objCheckIsNull(user,Collections.singletonList("123"), null));
    //在判断中剔除 属性名 为 sex,childSex 的属性
    System.out.println( CommonFunction.objCheckIsNull(user, Arrays.asList("name","age"),null));
    System.out.println( CommonFunction.objCheckIsNull(user, Arrays.asList("id","sex","name"),null));

  }
}
