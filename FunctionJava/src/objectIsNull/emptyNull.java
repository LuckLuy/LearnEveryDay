package objectIsNull;

import cn.hutool.core.util.ObjectUtil;
import comm.CommonFunction;
import entity.TestData;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author ³����
 * @Description��
 * @date 2021/9/14 17:45
 */
public class emptyNull {

  public static void main(String[] args) {
    
    /**
     * @description ��  �ж����еĲ�������null  ����null ʱ ����true����false
     * @author ³����
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
