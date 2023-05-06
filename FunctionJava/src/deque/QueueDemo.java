package deque;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.queue接口
 * Queue是队列，其继承自Collection.
 * 队列可以保存一组元素，但是存取元素必须遵循先进先出原则，
 * 常用实现类：java.util.LinkedList.
 */
 public class QueueDemo {
  public static void main(String[] args) {


    Queue<String> queue = new LinkedList<>();
    //		 * offer方法，入对操作，将给定元素添加到队列末尾。

    queue.offer("one");
    queue.offer("two");
    queue.offer("three");
    queue.offer("four");
    System.out.println(queue);

    /*
     * poll方法：出队操作。
     * 获取并从队列中删除队列首元素。
     */
    String str = queue.poll();
    System.out.println(str);
    System.out.println(queue);

    /*
     * peek:引用队首元素。
     * 与poll的区别在于获取后并不会将其从队列中删除。
     */
    String str1 = queue.peek();
    System.out.println(str1);
    System.out.println(queue);

    /*
     * 由于队列也是集合，所以可以使用迭代器来遍历，
     * 并且这种遍历不会影响队列中的元素。
     */
    for (String sss : queue) {
      System.out.println(sss);
    }
    System.out.println("=================");
    /*
     * 自定义循环，利用Poll方法遍历队列。
     *  注意： 这个方法 只能取队列的元素，只能使用 poll。
     *      如果使用peek，会造成死循环，
     */
    for (queue.size() > 0) {
      String ss = queue.poll();
      System.out.println(ss);
    }

  }
  }
