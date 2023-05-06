package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Description：返回当 前流中的任意元素
 * @author 鲁先生
 * @date 2022/4/19 11:55
 */
public class FindAny {
  public static void main(String[] args) {
    List<PersonBO> personList = Arrays.asList(
        new PersonBO("1", "小三", 18),
        new PersonBO("2", "小舞", 17),
        new PersonBO("3", "小胖", 18),
        new PersonBO("4", "小雅", 16),
        new PersonBO("5", "小六", 16),
        new PersonBO("6", "小六", 16),
        new PersonBO("7", "小六", 16)
    );

    Optional<PersonBO> getName = personList.stream().filter(e ->  e.getName().equals("小六")).findAny();
    System.out.println(getName);
  }
}
