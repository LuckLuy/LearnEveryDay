package stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author 鲁先生
 * @Description：查找返回
 * @date 2021/6/2 16:11
 */
public class StreamFind {
  public static void main(String[] args) {

    // findFirst/findAny  这两个就是返回流中的第一个、任意一个元素，
    // findAny 要在并行流中测试才有效果，举个栗子：

    for(int i=0;i<10;i++){
      Optional<Integer> first = Stream.of(1,2,3,4,5,6).parallel().findFirst();
      System.out.println("first.get() ="+first.get());
    }
    System.out.println("===========");

    for (int i=0;i<10;i++){
      Optional<Integer> findAny = Stream.of(1,2,3,4,5,6).parallel().findAny();
      System.out.println("findAny.get()= "+findAny.get());
    }

  }
}
