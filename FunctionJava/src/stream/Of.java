package stream;

import java.util.stream.Stream;

/**
 * @Description：
 * @author 鲁先生
 * @date 2022/3/31 10:01
 */
public class Of {
  /**
   * @description ：
   * @author 鲁先生
   * @date 2022/3/31 10:02
   * @param
   * @return
   */
  public static void main(String[] args) {
    // 获取每个参数的长度 并遍历
    Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
        //转成单词的长度 int
        .map(String::length)
        .forEach(System.out::println);

    // 分割 遍历
    System.out.println("*********** two **************");
    Stream.of("a-b-c-d","e-f-i-g-h")
        .flatMap(e->Stream.of(e.split("-")))
        .forEach(e->System.out.println(e));


    System.out.println("*********** tree **************");
    Stream.of(1,7,2,3,4,5,6)
        //限制三个
        .limit(3)
        //将输出 前三个 1，2，3
        .forEach(e->System.out.println(e));







  }
}
