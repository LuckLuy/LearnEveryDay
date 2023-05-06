package stream;

import java.io.InputStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 *  ƽ���� �� ���
 */
public class StreamAverage {
  public static void main(String[] args) {

    int[] arr ={1,2,3,4,5,6};

    // 1��������ƽ����
    double asDouble = IntStream.of(arr).average().getAsDouble();
    System.out.println("��ȡƽ������");
    System.out.println(asDouble);

    // 2�����
    int sum = IntStream.of(arr).sum();
    System.out.println("��ȡ�ϣ�");
    System.out.println(sum);


    // 3�������ж����ݽ��ж��μӹ�������������е�ÿ��Ԫ������ƽ������ͣ�
    double[] dou_arr ={1,2,3,4,5,6};
    double sum1 = DoubleStream.of(dou_arr).map(i -> Math.pow(i, 2)).sum();
    System.out.println(sum1);








  }

}
