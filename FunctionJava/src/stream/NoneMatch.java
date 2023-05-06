package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.List;

/**
 * @Description����� �Ƿ�û��ƥ������Ԫ�� ���]�з���true 
 * @author ³����
 * @date 2022/4/19 11:22
 */
public class NoneMatch {
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
    boolean match = personBOList.stream().noneMatch(e -> e.getName().equals(" "));
    System.out.println(match);
  }
}
