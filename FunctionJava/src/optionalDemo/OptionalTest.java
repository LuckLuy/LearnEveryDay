package optionalDemo;

import java.util.Optional;

/**
 * @author ³����
 * @Description��null ����
 * @date 2021/6/23 18:06
 */
public class OptionalTest {
  public static void main(String args[]){

    OptionalTest java8Tester = new OptionalTest();
    Integer value1 = null;
    Integer value2 = new Integer(10);

    // Optional.ofNullable - ������Ϊ null ����
    Optional<Integer> a = Optional.ofNullable(value1);
    System.out.println(a.orElse(0));

    // Optional.of - ������ݵĲ����� null���׳��쳣 NullPointerException
    Optional<Integer> b = Optional.of(value2);
    System.out.println(b);
    //System.out.println(java8Tester.sum(a,b));
  }

  public Integer sum(Optional<Integer> a, Optional<Integer> b){

    // Optional.isPresent - �ж�ֵ�Ƿ����

    System.out.println("��һ������ֵ����: " + a.isPresent());
    System.out.println("�ڶ�������ֵ����: " + b.isPresent());

    // Optional.orElse - ���ֵ���ڣ������������򷵻�Ĭ��ֵ
    Integer value1 = a.orElse(new Integer(0));

    //Optional.get - ��ȡֵ��ֵ��Ҫ����
    Integer value2 = b.get();
    return value1 + value2;
  }

}
