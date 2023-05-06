package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author ³����
 * @Description�� filter ��������ͨ�����õ��������й���
 * @date 2021/6/2 10:07
 */
public class StreamFilter {

  public static void main(String[] args) {

    //ilter ��������ͨ�����õ��������˳�Ԫ�ء����´���Ƭ��ʹ�� filter �������˳����ַ�����
    List<String> strings = Arrays.asList("java","","c","c#","Vue");
    // ��ȡ�ַ���������
    long count = strings.size();
    System.out.println(count);
    // ��ȡ���ַ���������
    long count1 = strings.stream().filter(str-> str.isEmpty()).count();
    System.out.println(count1);
    long count12 = strings.stream().filter(str-> !str.isEmpty()).count();
    System.out.println(count12);


    System.out.println("**********");
    //����Ҫ�ҵ����������д��� 3 ��Ԫ�أ����£�
    IntStream.of(2,3,4,5,6,7).filter(i-> i>3).forEach(System.out::println);


    //peek
    //peek ������� Consumer��û�з���ֵ����˵�����Ҫ��Ԫ���ڲ����д���ʱ��ʹ�� peek �ǱȽϺ��ʵģ����ʱ����Բ��� map��map ������� Function�������з���ֵ�ģ���peek �����������������������Զ����ݼ������д���
    //�ٸ��򵥵�����ת�������Ӱɣ����շ��ص����ݲ����ᱻת������
    IntStream.of(2, 3, 4, 5, 6, 7).filter(i -> i > 3).peek(String::valueOf).forEach(i-> System.out.println(i));
  }

}
