package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @Description�������������ֵ
 * @author ³����
 * @date 2022/4/19 13:49
 */
public class Max {
  public static void main(String[] args) {
    List<PersonBO> personList = Arrays.asList(
        new PersonBO("5", "С��", 16),
        new PersonBO("2", "С��", 17),
        new PersonBO("1", "С��", 18),
        new PersonBO("3", "С��", 18),
        new PersonBO("4", "С��", 16),
        new PersonBO("6", "С��", 16),
        new PersonBO("7", "С��", 16)
    );
    // ��д��
    Optional<PersonBO> max = personList.stream().max((n1, n2) -> Integer.compare(n1.getAge(), n2.getAge()));
    //  ��д��
    //   Optional<PersonBO> max = personList.stream().max(Comparator.comparingInt(PersonBO::getAge));
    System.out.println(max.get());
  }
}
