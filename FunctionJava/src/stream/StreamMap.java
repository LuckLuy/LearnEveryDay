package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author ³����
 * @Description��map ����
 * @date 2021/6/2 10:01
 */
public class StreamMap {

  public static void main(String[] args) {


   // map ��������ӳ��ÿ��Ԫ�ص���Ӧ�Ľ�������´���Ƭ��ʹ�� map �����Ԫ�ض�Ӧ��ƽ������
    List<Integer> numbers= Arrays.asList(2,3,4,5,2,7,5);
    // ��ȡ��Ӧ��ƽ������ȥ���ظ����������ռ���һ���µ�list �С�
    List<Integer> collect = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
    collect.forEach(System.out::println);

    //Stream.map() �� Stream ����õ�һ��ת��������
    // ���԰�һ�� Stream ����תΪ����һ�� Stream ����
    // map ���������յĲ�������һ�� Function ����
    // �ɸ���ǰ�������кʹ�ҽ��ܹ� Function �����ˣ�
    // ������������������μ�WebFlux ǰ��֪ʶ��һ�������˽��� map �Ĳ�����
    // ��ô map �Ĺ��ܾͺ������ˣ����Ƕ����ݽ��ж��μӹ���

    String [] arr ={"1","2","3"};
    Stream<String> st1= Arrays.stream(arr);
    // ���ַ���ת��������
    Stream<Integer> st2 =st1.map(i->Integer.valueOf(i));
    st2.forEach(System.out::println);

    //Ҳ����ֱ�ӽ�Ԫ��תΪ Double ��Long ��Obj �����ͣ��磺
    String [] arr1 ={"1","2","3"};
    Stream<String> sl= Arrays.stream(arr);
    System.out.println("ת��Long��");
    LongStream longStream = sl.mapToLong(m -> Long.parseLong(m));
    longStream.forEach(System.out::println);



    // flatMap : ���԰� Stream �е�ÿ��Ԫ�ض�ӳ��Ϊһ�� Stream��
    //          Ȼ���ٰ����� Stream �ϲ�Ϊһ�� Stream��
    Stream<Integer[]> ss= Stream.of(new Integer[]{1,2,3},new Integer[]{4,5,6},new Integer[]{7,8,9});
    System.out.println(ss);
    Stream<Integer> sss= Stream.of(new Integer[]{1,2,3},new Integer[]{4,5,6},new Integer[]{7,8,9}).flatMap(i -> Arrays.stream(i));
    System.out.println(sss);
    sss.forEach(System.out::println);

  }
}
