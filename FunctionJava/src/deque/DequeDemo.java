package deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;

/**
 * ˫�˶��� java.util.Deque
 * ���̳���Queue,�����˶����Խ����ӵĶ��С�
 * ����ʵ���ࣺjava.util.LinkedList
 */
public class DequeDemo {
  public static void main(String[] args) {
    Deque<String> deque =new LinkedList<>();
    deque.offer("one");
    deque.offer("two");
    deque.offer("three");
    deque.offer("four");
    System.out.println(deque);

    //�ڶ��е���ǰ���һ��Ԫ�ء�
    deque.offerFirst("��ʼ��");
    System.out.println(deque);

    //�ڶ��е�����һ��Ԫ�ء�
    deque.offerLast("�������");
    System.out.println(deque);

    System.out.println("===============");


    //��ȡ���е�һ��Ԫ��
    String df = deque.getFirst();
    System.out.println(df);

    //��ȡ���е�һ��Ԫ��
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
