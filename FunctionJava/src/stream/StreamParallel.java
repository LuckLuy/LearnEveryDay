package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author ³����
 * @Description�����д���
 * @date 2021/6/2 13:47
 */
public class StreamParallel {

  /**
   * @description �� parallelStream �������д������Ĵ��淽����
   *      ����ʵ������ʹ�� parallelStream ��������ַ�����������
   * @author ³����
   * @date 2021/6/2 13:47
   * @param 
   * @return 
   */
  public static void main(String[] args) {

    List<String> strings = Arrays.asList("java","c","c#","","vue");
    //��ȡ���ַ���
    long count = strings.parallelStream().filter(str -> str.isEmpty()).count();
    System.out.println(count);


    //ͨ������£��� Stream ��Ԫ�ؽ��д����ǵ��̵߳ģ���һ��һ��Ԫ�ؽ��д���
    // ��ʱ������ϣ�����Բ��д��� Stream Ԫ�أ���Ϊ��Ԫ�������ǳ������������д�����Դ��ӿ촦���ٶȡ�
    //��һ����ͨ Stream ת��Ϊ���Բ��д���� Stream �ǳ��򵥣�ֻ��Ҫ�� parallel ��������ת����
    //���������ں�̨���ǲ��д�ӡ�ġ�
    new Random().ints().limit(10).parallel().forEach(i->{
      System.out.println(Thread.currentThread().getName()+"--->" + i);
    });

  }


}
