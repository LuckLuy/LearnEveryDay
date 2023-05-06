package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @description ： 数组
 * @author 鲁先生
 * @date 2021/6/2 9:44
 * @param
 * @return
 */
public class StreamArrays {
  public static void main(String[] args) {

    IntStream stream = Arrays.stream(new int[]{11,22,33,44,55,66});
    stream.forEach(System.out::println);

    //collect/toArray
    //这两个都是收集器，可以将执行结果转为一个 List 集合或者一个数组：

    List<Integer> list = Stream.of(1,2,3,4).filter(p->p>2).collect(Collectors.toList());
    System.out.println(list);


  }


}
