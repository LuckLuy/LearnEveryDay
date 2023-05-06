package stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author ³����
 * @Description�����ҷ���
 * @date 2021/6/2 16:11
 */
public class StreamFind {
  public static void main(String[] args) {

    // findFirst/findAny  ���������Ƿ������еĵ�һ��������һ��Ԫ�أ�
    // findAny Ҫ�ڲ������в��Բ���Ч�����ٸ����ӣ�

    for(int i=0;i<10;i++){
      Optional<Integer> first = Stream.of(1,2,3,4,5,6).parallel().findFirst();
      System.out.println("first.get() ="+first.get());
    }
    System.out.println("===========");

    for (int i=0;i<10;i++){
      Optional<Integer> findAny = Stream.of(1,2,3,4,5,6).parallel().findAny();
      System.out.println("findAny.get()= "+findAny.get());
    }

  }
}
