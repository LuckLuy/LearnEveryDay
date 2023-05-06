package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description：跳过元素，返回一个扔掉前n个元素的流，若流中不足n个，则返回一个空流
 * @author 鲁先生
 * @date 2022/4/19 10:29
 */
public class Skip {
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

    Stream<PersonBO> stream = personBOList.stream();
    // 遍历所有的对象
    //stream.forEach(System.out::println);
    System.out.println("过滤大于16 的数据 ");

    // 过滤大于16 的数据
    //stream.filter(e -> e.getAge() > 16).forEach(System.out::println);
    System.out.println("过滤大于16 的数据 取出2个");
    // 过滤大于16 的数据 取出2个
   // stream.filter(e -> e.getAge() > 16).skip(2).forEach(System.out::println);

    System.out.println("过滤大于18 的数据 取出2个");
    // 过滤大于18 的数据 取出
    stream.filter(e -> e.getAge() > 18).skip(2).forEach(System.out::println);
  }
}
