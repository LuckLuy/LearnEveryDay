package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Description：返回流中最小值
 * @author 鲁先生
 * @date 2022/4/19 13:49
 */
public class Min {
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
    Optional<Integer> min = personList.stream().map(PersonBO::getAge).min(Integer::compare);
    //  新写法
    //   Optional<PersonBO> max = personList.stream().max(Comparator.comparingInt(PersonBO::getAge));
    System.out.println(min.get());
  }
}
