package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description：可变归约运算
 * @author 鲁先生
 * @date 2022/4/21 17:22
 */
public class Collect {
  public static void main(String[] args) {
    /*
      collect（）函数的三个参数是：
      supplier: a function that creates a new mutable result container. For the parallel execution, this function may be called multiple times and it must return a fresh value each time.
      Supplier ：一个创建新的可变结果容器的函数。 对于并行执行，可以多次调用此函数，并且每次必须返回一个新值。
      accumulator is a stateless function that must fold an element into a result container.
      累加器是一种无状态函数，必须将元素折叠到结果容器中。
      combiner is a stateless function that accepts two partial result containers and merges them, which must be compatible with the accumulator function.
      组合器是一个无状态函数，它接受两个部分结果容器并将其合并，这些容器必须与累加器功能兼容。
    */


    List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

    // 1.串联字符串列表 (1. Concatenating List of Strings)
    // sequential stream - nothing to combine
    StringBuilder result = vowels.stream().collect(StringBuilder::new, (x, y) -> x.append(y),
        (a, b) -> a.append(",").append(b));
    System.out.println(result.toString());

    // 2.并联字符串列表
    // parallel stream - combiner is combining partial results
    StringBuilder result1 = vowels.parallelStream().collect(StringBuilder::new, (x, y) -> x.append(y),
        (a, b) -> a.append(",").append(b));
    System.out.println(result1.toString());

    // 2.1 并联字符串列表
    String resultTwo = vowels.parallelStream()
        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
        .toString();
    System.out.println(resultTwo);


    //  2.使用collectors类将collect（）流传输到列表 (2. Stream collect() to List using Collectors Class)
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    System.out.println(evenNumbers);



   // 3.流collect（）到集合
    // 我们可以使用Collectors.toMap（）函数将流元素收集到Map中 。 此方法接受两个用于映射键的参数和Map中的对应值。
    List<Integer> listNuber = Arrays.asList(1, 2, 3, 4, 5, 6);
    Map<Integer, String> mapOddNumbers = listNuber.parallelStream().filter(x -> x % 2 != 0)
        .collect(Collectors.toMap(Function.identity(), x -> String.valueOf(x)));
    System.out.println(mapOddNumbers);

    // 4.收集器join（）示例
    // 我们可以使用Collectors join（）方法来获取Collector，该Collector以遭遇顺序将输入流CharSequence元素串联在一起。
    // 我们可以使用它来连接字符串流， StringBuffer或StringBuilder
    String value = Stream.of("a", "b", "c").collect(Collectors.joining());
    System.out.println(value);

    String valueCSV = Stream.of("a", "b", "c").collect(Collectors.joining(","));
    System.out.println(valueCSV);


    String valueCSVLikeArray = Stream.of("a", "b", "c").collect(Collectors.joining(",", "{", "}"));
    System.out.println(valueCSVLikeArray);

    String valueObject = Stream.of("1", new StringBuffer("2"), new StringBuilder("3")).collect(Collectors.joining());
    System.out.println(valueObject);


  }

}
