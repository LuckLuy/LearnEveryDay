package stream;

import cn.hutool.db.PageResult;
import entity.PersonBO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author ³����
 * @Description������
 * @date 2021/6/2 15:12
 */
public class StreamSorted {
  public static void main(String[] args) {
    List<PersonBO> personBOList = Arrays.asList(
        new PersonBO("1", "С��", 18),
        new PersonBO("2", "С��", 17),
        new PersonBO("3", "С��", 18),
        new PersonBO("4", "С��", 16),
        new PersonBO("5", "С��", 16),
        new PersonBO("5", "С��", 16),
        new PersonBO("5", "С��", 16)
    );

    //sorted ��������ΪҲ��Ҫ֪������Ԫ�ص�ֵ��
    // Ȼ�����ȥ�أ��������Ҳ����״̬���������£�
    //IntStream.of(2,3,4,6,7,8,3,5,1,9).distinct().sorted().forEach(System.out::println);


    Stream<PersonBO> stream = personBOList.stream();
    // �������еĶ���
    //stream.forEach(System.out::println);
    System.out.println("���˴���16 ������ ");

    // ���˴���16 ������
    //stream.filter(e -> e.getAge() > 16).forEach(System.out::println);
    System.out.println("���˴���16 ������ ȡ��2��");
    // ���˴���16 ������ ȡ��2��
    stream.filter(e -> e.getAge() > 16).limit(2).forEach(System.out::println);



    // ȥ��
    //stream.distinct().forEach(System.out::println);

  }

}
