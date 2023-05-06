package stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author ³����
 * @Description��ͳ��
 * @date 2021/6/2 14:15
 */
public class StreamCount {
  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(2,3,5,7,9,1,3,4,6,2,3);

    IntSummaryStatistics stats = numbers.stream().mapToInt((x)->x).summaryStatistics();
    System.out.println("�б����������� "+ stats.getMax());
    System.out.println("�б�����С������ "+stats.getMin());
    System.out.println("�б���������֮�ͣ�"+stats.getSum());
    System.out.println("ƽ������"+stats.getAverage());


    Stream<Integer> s = Stream.of(1,2,3,4);
    long cout = s.count();
    System.out.println(cout);
    Stream<Integer> s1 = Stream.of(10,20,30,40);
    Optional<Integer> min =s1.min(Comparator.comparingInt(i->i));
    System.out.println("min.get():"+min.get());



  }
}
