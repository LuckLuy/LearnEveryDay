package stream;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/**
 * @author ³����
 * @Description������
 * @date 2021/6/2 9:58
 */
public class ForEach {
  public static void main(String[] args) {

    //Stream �ṩ���µķ��� 'forEach' ���������е�ÿ�����ݡ����´���Ƭ��ʹ�� forEach �����10���������
    SecureRandom random = new SecureRandom();
    random.ints().limit(10).forEach(System.out::println);


    //forEach �� forEachOrdered ���ǽ���һ�� Consumer ���͵Ĳ�����
    // ��ɶԲ��������ѣ���ͬ���ǣ��ڲ������У�forEachOrdered �ᱣִ֤��˳��
    int [] arr ={1,2,3,4,5,6,7,8,9};
    Arrays.stream(arr).parallel().forEach(System.out::println);
    Arrays.stream(arr).parallel().forEachOrdered(System.out::println);

    String[] str = {"A", "B", "F", "D", "E", "C"};
    Arrays.stream(str).parallel().forEachOrdered(System.out::println);

  }
}
