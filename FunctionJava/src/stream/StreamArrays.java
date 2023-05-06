package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @description �� ����
 * @author ³����
 * @date 2021/6/2 9:44
 * @param
 * @return
 */
public class StreamArrays {
  public static void main(String[] args) {

    IntStream stream = Arrays.stream(new int[]{11,22,33,44,55,66});
    stream.forEach(System.out::println);

    //collect/toArray
    //�����������ռ��������Խ�ִ�н��תΪһ�� List ���ϻ���һ�����飺

    List<Integer> list = Stream.of(1,2,3,4).filter(p->p>2).collect(Collectors.toList());
    System.out.println(list);


  }


}
