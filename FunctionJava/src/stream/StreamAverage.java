package stream;

import java.io.InputStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 *  平均数 和 求和
 */
public class StreamAverage {
  public static void main(String[] args) {

    int[] arr ={1,2,3,4,5,6};

    // 1，数组求平均数
    double asDouble = IntStream.of(arr).average().getAsDouble();
    System.out.println("获取平均数：");
    System.out.println(asDouble);

    // 2，求和
    int sum = IntStream.of(arr).sum();
    System.out.println("获取合：");
    System.out.println(sum);


    // 3，在流中对数据进行二次加工，例如给数组中的每个元素先求平方再求和：
    double[] dou_arr ={1,2,3,4,5,6};
    double sum1 = DoubleStream.of(dou_arr).map(i -> Math.pow(i, 2)).sum();
    System.out.println(sum1);








  }

}
