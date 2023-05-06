package deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;

/**
 * 双端队列 java.util.Deque
 * 它继承自Queue,是两端都可以进出队的队列。
 * 常用实现类：java.util.LinkedList
 */
public class DequeDemo {
  public static void main(String[] args) {
    Deque<String> deque =new LinkedList<>();
    deque.offer("one");
    deque.offer("two");
    deque.offer("three");
    deque.offer("four");
    System.out.println(deque);

    //在队列的最前面加一个元素。
    deque.offerFirst("开始：");
    System.out.println(deque);

    //在队列的最后加一个元素。
    deque.offerLast("结束添加");
    System.out.println(deque);

    System.out.println("===============");


    //获取队列第一个元素
    String df = deque.getFirst();
    System.out.println(df);

    //提取队列第一个元素
    String df1=deque.poll();
    System.out.println(df1);
    System.out.println(deque);

    String df2 = deque.pollFirst();
    System.out.println(df2);
    System.out.println(deque);


    String df3 = deque.pollLast();
    System.out.println(df3);
    System.out.println(deque);
  }
}
