package stream;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author ³����
 * @Description��������������
 * @date 2021/6/2 13:41
 */
public class StramSorted {
  public static void main(String[] args) {
    //sorted
    //sorted �������ڶ��������������´���Ƭ��ʹ�� sorted ����������� 10 ���������������
    SecureRandom random = new SecureRandom();
    random.ints().limit(10).sorted().forEach(System.out::println);

  }
}
