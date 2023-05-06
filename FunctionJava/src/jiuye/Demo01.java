package jiuye;

/**
 * 鸡兔同笼
 */
public class Demo01 {
  public static void main(String[] args) {
    System.out.println(chen(4));

    jttl();

    for (int j = 0, t = 35; j <= 35; j++, t--) {
      if (j * 2 + t * 4 == 94) {
        System.err.println("鸡：" + j + ".兔：" + t);
      }
    }


  }

  public static void jttl() {
    //鸡0到35，兔35到0
    for (int j = 0, t = 35; j <= 35; j++, t--) {
      //j只鸡和t只兔，脚的数量一共是94只
      if (j * 2 + t * 4 == 94) {
        System.out.println(
            j + "只鸡， " + t + "只兔");
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
