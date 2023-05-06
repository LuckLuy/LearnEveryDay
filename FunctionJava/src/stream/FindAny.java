package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Description�����ص� ǰ���е�����Ԫ��
 * @author ³����
 * @date 2022/4/19 11:55
 */
public class FindAny {
  public static void main(String[] args) {
    List<PersonBO> personList = Arrays.asList(
        new PersonBO("1", "С��", 18),
        new PersonBO("2", "С��", 17),
        new PersonBO("3", "С��", 18),
        new PersonBO("4", "С��", 16),
        new PersonBO("5", "С��", 16),
        new PersonBO("6", "С��", 16),
        new PersonBO("7", "С��", 16)
    );

    Optional<PersonBO> getName = personList.stream().filter(e ->  e.getName().equals("С��")).findAny();
    System.out.println(getName);
  }
}
