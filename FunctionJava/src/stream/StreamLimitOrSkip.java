package stream;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ³����
 * @Description��ָ����������
 * @date 2021/6/2 13:34
 */
public class StreamLimitOrSkip {
  public static void main(String[] args) {

    //limit �������ڻ�ȡָ������������ ���´���Ƭ��ʹ�� limit ������ӡ�� 10 �����ݣ�
    Random random = new Random();
    random.ints().limit(10).forEach(System.out::println);

    //limit �� skip ��ϲ����е������ݿ��еķ�ҳ��
    // skip ��ʾ���� n ��Ԫ�أ�limit ��ʾȡ�� n ��Ԫ�ء���������������ӣ�
    Arrays.asList("a","b","c","d","e","f").stream().skip(2).limit(3).forEach(System.out::println);
  }

}
