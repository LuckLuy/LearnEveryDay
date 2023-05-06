package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author 鲁先生
 * @Description：map 方法
 * @date 2021/6/2 10:01
 */
public class StreamMap {

  public static void main(String[] args) {


   // map 方法用于映射每个元素到对应的结果，以下代码片段使用 map 输出了元素对应的平方数：
    List<Integer> numbers= Arrays.asList(2,3,4,5,2,7,5);
    // 获取对应的平方数，去除重复并将数据收集到一个新的list 中。
    List<Integer> collect = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
    collect.forEach(System.out::println);

    //Stream.map() 是 Stream 中最常用的一个转换方法，
    // 可以把一个 Stream 对象转为另外一个 Stream 对象。
    // map 方法所接收的参数就是一个 Function 对象，
    // 松哥在前面文章中和大家介绍过 Function 对象了，
    // 就是有输入有输出（参见WebFlux 前置知识（一）），了解了 map 的参数，
    // 那么 map 的功能就很明白了，就是对数据进行二次加工。

    String [] arr ={"1","2","3"};
    Stream<String> st1= Arrays.stream(arr);
    // 将字符串转换成数字
    Stream<Integer> st2 =st1.map(i->Integer.valueOf(i));
    st2.forEach(System.out::println);

    //也可以直接将元素转为 Double 、Long 、Obj 等类型，如：
    String [] arr1 ={"1","2","3"};
    Stream<String> sl= Arrays.stream(arr);
    System.out.println("转换Long：");
    LongStream longStream = sl.mapToLong(m -> Long.parseLong(m));
    longStream.forEach(System.out::println);



    // flatMap : 可以把 Stream 中的每个元素都映射为一个 Stream，
    //          然后再把这多个 Stream 合并为一个 Stream。
    Stream<Integer[]> ss= Stream.of(new Integer[]{1,2,3},new Integer[]{4,5,6},new Integer[]{7,8,9});
    System.out.println(ss);
    Stream<Integer> sss= Stream.of(new Integer[]{1,2,3},new Integer[]{4,5,6},new Integer[]{7,8,9}).flatMap(i -> Arrays.stream(i));
    System.out.println(sss);
    sss.forEach(System.out::println);

  }
}
