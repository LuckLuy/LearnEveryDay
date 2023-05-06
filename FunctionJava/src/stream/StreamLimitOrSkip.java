package stream;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 鲁先生
 * @Description：指定数量的流
 * @date 2021/6/2 13:34
 */
public class StreamLimitOrSkip {
  public static void main(String[] args) {

    //limit 方法用于获取指定数量的流。 以下代码片段使用 limit 方法打印出 10 条数据：
    Random random = new Random();
    random.ints().limit(10).forEach(System.out::println);

    //limit 和 skip 配合操作有点像数据库中的分页，
    // skip 表示跳过 n 个元素，limit 表示取出 n 个元素。例如下面这个例子：
    Arrays.asList("a","b","c","d","e","f").stream().skip(2).limit(3).forEach(System.out::println);
  }

}
