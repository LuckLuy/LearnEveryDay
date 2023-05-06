package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description：筛选，通过流所生成元素的hashcode()和equals()去除重复元素
 * @author 鲁先生
 * @date 2022/4/19 10:33
 */
public class Distinct {
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

    long count = personBOList.stream().distinct().count();

    System.out.println("QZ  "+count);
    System.out.println("过滤重复 的数据");
    personBOList.stream().filter(e -> e.getAge() > 15).distinct().forEach(System.out::println);
  }
}
