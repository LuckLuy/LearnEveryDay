package stream;

import java.util.stream.Stream;

/**
 * @author ³����
 * @Description���ж�����
 * @date 2021/6/2 16:21
 */
public class StreamMatch {

  public static void main(String[] args) {
    //allMatch��anyMatch��noneMatch �����ж�����Ԫ�ء�����Ԫ�ػ���û��Ԫ����������������������������Ĳ�������һ�� Predicate �ӿں�����

    // ����Ԫ�ض��������� ���� true
    boolean b = Stream.of(1,2,3,4).allMatch(i-> i>1);
    System.out.println("b = "+ b);


    //anyMatch��ʾ���жϵ����������������true
    boolean b2 = Stream.of(1,2,3,4).anyMatch(i-> i>4);
    System.out.println("b = "+ b2);

    // �ж����������� ����true
    boolean b3 = Stream.of(1,2,3,4).noneMatch(i-> i>5);
    System.out.println("b = "+ b3);

  }

}
