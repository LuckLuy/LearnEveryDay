package jiuye;

/**
 * ����ͬ��
 */
public class Demo01 {
  public static void main(String[] args) {
    System.out.println(chen(4));

    jttl();

    for (int j = 0, t = 35; j <= 35; j++, t--) {
      if (j * 2 + t * 4 == 94) {
        System.err.println("����" + j + ".�ã�" + t);
      }
    }


  }

  public static void jttl() {
    //��0��35����35��0
    for (int j = 0, t = 35; j <= 35; j++, t--) {
      //jֻ����tֻ�ã��ŵ�����һ����94ֻ
      if (j * 2 + t * 4 == 94) {
        System.out.println(
            j + "ֻ���� " + t + "ֻ��");
      }
    }
  }

  public static int chen(int num) {
    int sum = 0;
    int a = 1;
    for (int i = 1; i <= num; i++) {
      a = 1;
      for (int j = 1; j <= i; j++) {
        a = a * j;
      }
      sum += a;
    }
    return sum;
  }
}
