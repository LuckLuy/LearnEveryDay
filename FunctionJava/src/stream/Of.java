package stream;

import java.util.stream.Stream;

/**
 * @Description��
 * @author ³����
 * @date 2022/3/31 10:01
 */
public class Of {
  /**
   * @description ��
   * @author ³����
   * @date 2022/3/31 10:02
   * @param
   * @return
   */
  public static void main(String[] args) {
    // ��ȡÿ�������ĳ��� ������
    Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
        //ת�ɵ��ʵĳ��� int
        .map(String::length)
        .forEach(System.out::println);

    // �ָ� ����
    System.out.println("*********** two **************");
    Stream.of("a-b-c-d","e-f-i-g-h")
        .flatMap(e->Stream.of(e.split("-")))
        .forEach(e->System.out.println(e));


    System.out.println("*********** tree **************");
    Stream.of(1,7,2,3,4,5,6)
        //��������
        .limit(3)
        //����� ǰ���� 1��2��3
        .forEach(e->System.out.println(e));







  }
}
