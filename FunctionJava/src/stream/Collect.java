package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description���ɱ��Լ����
 * @author ³����
 * @date 2022/4/21 17:22
 */
public class Collect {
  public static void main(String[] args) {
    /*
      collect�������������������ǣ�
      supplier: a function that creates a new mutable result container. For the parallel execution, this function may be called multiple times and it must return a fresh value each time.
      Supplier ��һ�������µĿɱ��������ĺ����� ���ڲ���ִ�У����Զ�ε��ô˺���������ÿ�α��뷵��һ����ֵ��
      accumulator is a stateless function that must fold an element into a result container.
      �ۼ�����һ����״̬���������뽫Ԫ���۵�����������С�
      combiner is a stateless function that accepts two partial result containers and merges them, which must be compatible with the accumulator function.
      �������һ����״̬�������������������ֽ������������ϲ�����Щ�����������ۼ������ܼ��ݡ�
    */


    List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

    // 1.�����ַ����б� (1. Concatenating List of Strings)
    // sequential stream - nothing to combine
    StringBuilder result = vowels.stream().collect(StringBuilder::new, (x, y) -> x.append(y),
        (a, b) -> a.append(",").append(b));
    System.out.println(result.toString());

    // 2.�����ַ����б�
    // parallel stream - combiner is combining partial results
    StringBuilder result1 = vowels.parallelStream().collect(StringBuilder::new, (x, y) -> x.append(y),
        (a, b) -> a.append(",").append(b));
    System.out.println(result1.toString());

    // 2.1 �����ַ����б�
    String resultTwo = vowels.parallelStream()
        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
        .toString();
    System.out.println(resultTwo);


    //  2.ʹ��collectors�ཫcollect���������䵽�б� (2. Stream collect() to List using Collectors Class)
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    System.out.println(evenNumbers);



   // 3.��collect����������
    // ���ǿ���ʹ��Collectors.toMap������������Ԫ���ռ���Map�� �� �˷���������������ӳ����Ĳ�����Map�еĶ�Ӧֵ��
    List<Integer> listNuber = Arrays.asList(1, 2, 3, 4, 5, 6);
    Map<Integer, String> mapOddNumbers = listNuber.parallelStream().filter(x -> x % 2 != 0)
        .collect(Collectors.toMap(Function.identity(), x -> String.valueOf(x)));
    System.out.println(mapOddNumbers);

    // 4.�ռ���join����ʾ��
    // ���ǿ���ʹ��Collectors join������������ȡCollector����Collector������˳��������CharSequenceԪ�ش�����һ��
    // ���ǿ���ʹ�����������ַ������� StringBuffer��StringBuilder
    String value = Stream.of("a", "b", "c").collect(Collectors.joining());
    System.out.println(value);

    String valueCSV = Stream.of("a", "b", "c").collect(Collectors.joining(","));
    System.out.println(valueCSV);


    String valueCSVLikeArray = Stream.of("a", "b", "c").collect(Collectors.joining(",", "{", "}"));
    System.out.println(valueCSVLikeArray);

    String valueObject = Stream.of("1", new StringBuffer("2"), new StringBuilder("3")).collect(Collectors.joining());
    System.out.println(valueObject);


  }

}
