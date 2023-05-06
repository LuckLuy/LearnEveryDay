package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Description���� �ص�һ��Ԫ��
 * @author ³����
 * @date 2022/4/19 11:31
 */
public class FindFirst {
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

    Optional<PersonBO> personBOStream = personBOList.stream().sorted((a1, a2) ->
        -Integer.compare(a1.getAge(), a2.getAge()) ).findFirst();
    System.out.println(personBOStream.get());
  }
}
