package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @Description：返回流中最大值
 * @author 鲁先生
 * @date 2022/4/19 13:49
 */
public class Max {
  public static void main(String[] args) {
    List<PersonBO> personList = Arrays.asList(
        new PersonBO("5", "小六", 16),
        new PersonBO("2", "小舞", 17),
        new PersonBO("1", "小三", 18),
        new PersonBO("3", "小胖", 18),
        new PersonBO("4", "小雅", 16),
        new PersonBO("6", "小六", 16),
        new PersonBO("7", "小六", 16)
    );
    // 老写法
    Optional<PersonBO> max = personList.stream().max((n1, n2) -> Integer.compare(n1.getAge(), n2.getAge()));
    //  新写法
    //   Optional<PersonBO> max = personList.stream().max(Comparator.comparingInt(PersonBO::getAge));
    System.out.println(max.get());
  }
}
