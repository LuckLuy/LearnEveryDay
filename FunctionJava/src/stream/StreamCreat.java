package stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author Â³ÏÈÉú
 * @Description£º
 * @date 2021/6/2 14:24
 */
public class StreamCreat {
  public static void main(String[] args) {

    IntStream s1 = IntStream.of(1,2,3);
    DoubleStream d1 = DoubleStream.of(1,2,3);
    LongStream ll = LongStream.of(1,2,3);
    s1.forEach(System.out::println);
    d1.forEach(System.out::println);
    ll.forEach(System.out::println);

  }


}
