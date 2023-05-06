package stream;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/**
 * @author 鲁先生
 * @Description：遍历
 * @date 2021/6/2 9:58
 */
public class ForEach {
  public static void main(String[] args) {

    //Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。以下代码片段使用 forEach 输出了10个随机数：
    SecureRandom random = new SecureRandom();
    random.ints().limit(10).forEach(System.out::println);


    //forEach 和 forEachOrdered 都是接收一个 Consumer 类型的参数，
    // 完成对参数的消费，不同的是，在并行流中，forEachOrdered 会保证执行顺序。
    int [] arr ={1,2,3,4,5,6,7,8,9};
    Arrays.stream(arr).parallel().forEach(System.out::println);
    Arrays.stream(arr).parallel().forEachOrdered(System.out::println);

    String[] str = {"A", "B", "F", "D", "E", "C"};
    Arrays.stream(str).parallel().forEachOrdered(System.out::println);

  }
}
