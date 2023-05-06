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
public class emptyNull {

  public static void main(String[] args) {
    
    /**
     * @description ：  判断所有的参数都是null  都是null 时 返回true否则false
     * @author 鲁先生
     * @date 2021/9/15 11:03
     * @param [args]
     * @return void
     */
    TestData  testData = new TestData();
    //testData.setName("");
    System.out.println(testData);
    System.out.println(testData ==null );
    System.out.println(ObjectUtil.isEmpty(testData));
    System.out.println(CommonFunction.objCheckIsNull(testData));


  }
}
