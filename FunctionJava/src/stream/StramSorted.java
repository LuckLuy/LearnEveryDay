package stream;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author 鲁先生
 * @Description：对流进行排序
 * @date 2021/6/2 13:41
 */
public class StramSorted {
  public static void main(String[] args) {
    //sorted
    //sorted 方法用于对流进行排序。以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序：
    SecureRandom random = new SecureRandom();
    random.ints().limit(10).sorted().forEach(System.out::println);

  }
}
