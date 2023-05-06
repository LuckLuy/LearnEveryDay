package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author 鲁先生
 * @Description：并行处理
 * @date 2021/6/2 13:47
 */
public class StreamParallel {

  /**
   * @description ： parallelStream 是流并行处理程序的代替方法。
   *      以下实例我们使用 parallelStream 来输出空字符串的数量：
   * @author 鲁先生
   * @date 2021/6/2 13:47
   * @param 
   * @return 
   */
  public static void main(String[] args) {

    List<String> strings = Arrays.asList("java","c","c#","","vue");
    //获取空字符串
    long count = strings.parallelStream().filter(str -> str.isEmpty()).count();
    System.out.println(count);


    //通常情况下，对 Stream 的元素进行处理是单线程的，即一个一个元素进行处理。
    // 有时候我们希望可以并行处理 Stream 元素，因为在元素数量非常大的情况，并行处理可以大大加快处理速度。
    //把一个普通 Stream 转换为可以并行处理的 Stream 非常简单，只需要用 parallel 方法进行转换：
    //这样数据在后台就是并行打印的。
    new Random().ints().limit(10).parallel().forEach(i->{
      System.out.println(Thread.currentThread().getName()+"--->" + i);
    });

  }


}
