package stream;

import java.util.stream.Stream;

/**
 * @author 鲁先生
 * @Description：判断条件
 * @date 2021/6/2 16:21
 */
public class StreamMatch {

  public static void main(String[] args) {
    //allMatch、anyMatch、noneMatch 用来判断所有元素、任意元素或者没有元素满足给定的条件。这三个方法的参数都是一个 Predicate 接口函数。

    // 所有元素都大于条件 返回 true
    boolean b = Stream.of(1,2,3,4).allMatch(i-> i>1);
    System.out.println("b = "+ b);


    //anyMatch表示，判断的条件里，成立，返回true
    boolean b2 = Stream.of(1,2,3,4).anyMatch(i-> i>4);
    System.out.println("b = "+ b2);

    // 判断条件不成立 返回true
    boolean b3 = Stream.of(1,2,3,4).noneMatch(i-> i>5);
    System.out.println("b = "+ b3);

  }

}
