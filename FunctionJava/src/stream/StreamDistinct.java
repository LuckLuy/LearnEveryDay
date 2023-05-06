package stream;

import java.util.stream.IntStream;

/**
 * @author 鲁先生
 * @Description：去重
 * @date 2021/6/2 15:10
 */
public class StreamDistinct {
  public static void main(String[] args) {
   //这个是去重。由于去重操作需要获取到其他元素的值（比较之后才知道是否重复），所以这个是有状态操作。如下：
    IntStream.of(2,3,4,5,2,3,5,6,7,8,9).distinct().forEach(System.out::println);


  }

}
