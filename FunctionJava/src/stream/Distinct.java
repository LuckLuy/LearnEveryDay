package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description��ɸѡ��ͨ����������Ԫ�ص�hashcode()��equals()ȥ���ظ�Ԫ��
 * @author ³����
 * @date 2022/4/19 10:33
 */
public class Distinct {
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

    long count = personBOList.stream().distinct().count();

    System.out.println("QZ  "+count);
    System.out.println("�����ظ� ������");
    personBOList.stream().filter(e -> e.getAge() > 15).distinct().forEach(System.out::println);
  }
}
