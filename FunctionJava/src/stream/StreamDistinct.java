package stream;

import java.util.stream.IntStream;

/**
 * @author ³����
 * @Description��ȥ��
 * @date 2021/6/2 15:10
 */
public class StreamDistinct {
  public static void main(String[] args) {
   //�����ȥ�ء�����ȥ�ز�����Ҫ��ȡ������Ԫ�ص�ֵ���Ƚ�֮���֪���Ƿ��ظ����������������״̬���������£�
    IntStream.of(2,3,4,5,2,3,5,6,7,8,9).distinct().forEach(System.out::println);


  }

}
