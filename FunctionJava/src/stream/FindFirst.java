package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Description：返 回第一个元素
 * @author 鲁先生
 * @date 2022/4/19 11:31
 */
public class FindFirst {
  public static void main(String[] args) {
    List<PersonBO> personBOList = Arrays.asList(
        new PersonBO("1", "小三", 18),
        new PersonBO("2", "小舞", 17),
        new PersonBO("3", "小胖", 18),
        new PersonBO("4", "小雅", 16),
        new PersonBO("5", "小六", 16),
        new PersonBO("5", "小六", 16),
        new PersonBO("5", "小六", 16)
    );

    Optional<PersonBO> personBOStream = personBOList.stream().sorted((a1, a2) ->
        -Integer.compare(a1.getAge(), a2.getAge()) ).findFirst();
    System.out.println(personBOStream.get());
  }
}
