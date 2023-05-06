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
public class ObjectIsNull {

  public static void main(String[] args) {
  /**
   * @description ��  �ж����еĲ�������null  ����null ʱ ����true����false
   * @author ³����
   * @date 2021/9/15 11:03
   * @param
   * @return void
   */
    //TestData user = new TestData();
    TestData user = new TestData("123","����","18");
    System.out.println(user);
    //ʹ�û����ķ��乤����
    System.out.println( CommonFunction.objCheckIsNull(user));
    //���ж����޳� value Ϊ���Ե�����
    System.out.println( CommonFunction.objCheckIsNull(user,null, Collections.singletonList("����")));
    System.out.println( CommonFunction.objCheckIsNull(user,null, Collections.singletonList("123")));

    System.out.println( CommonFunction.objCheckIsNull(user,Collections.singletonList("123"), null));
    //���ж����޳� ������ Ϊ sex,childSex ������
    System.out.println( CommonFunction.objCheckIsNull(user, Arrays.asList("name","age"),null));
    System.out.println( CommonFunction.objCheckIsNull(user, Arrays.asList("id","sex","name"),null));

  }
}
