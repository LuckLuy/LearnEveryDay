package stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author 鲁先生
 * @Description：聚合方法
 * @date 2021/6/2 15:50
 */
public class StreamReduce {
  public static void main(String[] args) {
    //reduce 是 Stream 的一个聚合方法，它可以把一个 Stream 的所有元素按照聚合函数聚合成一个结果。reduce 方法传入的对象是BinaryOperator 接口，
    // 它定义了一个apply 方法，负责把上次累加的结果和本次的元素进行运算，并返回累加的结果。
    //举个简单的例子，数组求和，当然可以直接调用 sum 计算，我们这里也可以调用 reduce 来实现，如下
    Optional<Integer> optional = Stream.of(1,2,3,4).reduce((i,j) ->i+j);
    System.out.println(optional.orElse(-1));



  //reduce 的参数是 BinaryOperator，这个接收两个参数，第一个参数是之前计算的结果，第二个参数是本次参与计算的元素，两者累加求和。
    //再比如给一段话中间加上.，方式如下：
   Optional<String> s= Stream.of("wwwjasdjkasldj".split("")).reduce((i,j) ->i+"."+j);
    System.out.println(s.orElse(""));


  }
}

