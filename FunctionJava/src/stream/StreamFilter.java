package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author 鲁先生
 * @Description： filter 方法用于通过设置的条件进行过滤
 * @date 2021/6/2 10:07
 */
public class StreamFilter {

  public static void main(String[] args) {

    //ilter 方法用于通过设置的条件过滤出元素。以下代码片段使用 filter 方法过滤出空字符串：
    List<String> strings = Arrays.asList("java","","c","c#","Vue");
    // 获取字符串的数量
    long count = strings.size();
    System.out.println(count);
    // 获取空字符串的数量
    long count1 = strings.stream().filter(str-> str.isEmpty()).count();
    System.out.println(count1);
    long count12 = strings.stream().filter(str-> !str.isEmpty()).count();
    System.out.println(count12);


    System.out.println("**********");
    //例如要找到数组中所有大于 3 的元素，如下：
    IntStream.of(2,3,4,5,6,7).filter(i-> i>3).forEach(System.out::println);


    //peek
    //peek 的入参是 Consumer，没有返回值，因此当我们要对元素内部进行处理时，使用 peek 是比较合适的，这个时候可以不用 map（map 的入参是 Function，它是有返回值的）。peek 方法本身会继续返回流，可以对数据继续进行处理。
    //举个简单的数据转换的例子吧（最终返回的数据并不会被转换）：
    IntStream.of(2, 3, 4, 5, 6, 7).filter(i -> i > 3).peek(String::valueOf).forEach(i-> System.out.println(i));
  }

}
