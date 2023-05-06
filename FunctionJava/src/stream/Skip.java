package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description������Ԫ�أ�����һ���ӵ�ǰn��Ԫ�ص����������в���n�����򷵻�һ������
 * @author ³����
 * @date 2022/4/19 10:29
 */
public class Skip {
  public static void main(String[] args) {
    List<PersonBO> personBOList = Arrays.asList(
        new PersonBO("1", "С��", 18),
        new PersonBO("2", "С��", 17),
        new PersonBO("3", "С��", 18),
        new PersonBO("4", "С��", 16),
        new PersonBO("5", "С��", 16),
        new PersonBO("5", "С��", 16),
        new PersonBO("5", "С��", 16)
    );

    Stream<PersonBO> stream = personBOList.stream();
    // �������еĶ���
    //stream.forEach(System.out::println);
    System.out.println("���˴���16 ������ ");

    // ���˴���16 ������
    //stream.filter(e -> e.getAge() > 16).forEach(System.out::println);
    System.out.println("���˴���16 ������ ȡ��2��");
    // ���˴���16 ������ ȡ��2��
   // stream.filter(e -> e.getAge() > 16).skip(2).forEach(System.out::println);

    System.out.println("���˴���18 ������ ȡ��2��");
    // ���˴���18 ������ ȡ��
    stream.filter(e -> e.getAge() > 18).skip(2).forEach(System.out::println);
  }
}
