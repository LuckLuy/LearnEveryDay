package stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author ³����
 * @Description���ۺϷ���
 * @date 2021/6/2 15:50
 */
public class StreamReduce {
  public static void main(String[] args) {
    //reduce �� Stream ��һ���ۺϷ����������԰�һ�� Stream ������Ԫ�ذ��վۺϺ����ۺϳ�һ�������reduce ��������Ķ�����BinaryOperator �ӿڣ�
    // ��������һ��apply ������������ϴ��ۼӵĽ���ͱ��ε�Ԫ�ؽ������㣬�������ۼӵĽ����
    //�ٸ��򵥵����ӣ�������ͣ���Ȼ����ֱ�ӵ��� sum ���㣬��������Ҳ���Ե��� reduce ��ʵ�֣�����
    Optional<Integer> optional = Stream.of(1,2,3,4).reduce((i,j) ->i+j);
    System.out.println(optional.orElse(-1));



  //reduce �Ĳ����� BinaryOperator���������������������һ��������֮ǰ����Ľ�����ڶ��������Ǳ��β�������Ԫ�أ������ۼ���͡�
    //�ٱ����һ�λ��м����.����ʽ���£�
   Optional<String> s= Stream.of("wwwjasdjkasldj".split("")).reduce((i,j) ->i+"."+j);
    System.out.println(s.orElse(""));


  }
}

