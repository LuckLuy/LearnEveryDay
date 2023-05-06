package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.List;

/**
 * @Description������Ƿ�ƥ������Ԫ��
 * @author ³����
 * @date 2022/4/19 11:12
 */
public class AllMatch {
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
    //
    boolean allMatch = personBOList.stream().allMatch(e -> e.getAge().equals(17));
    System.out.println(allMatch);

  }
}
