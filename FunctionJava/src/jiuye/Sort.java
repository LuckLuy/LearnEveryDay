package jiuye;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
  public static void main(String[] args) {
    /**
     * reverse() ���ַ������е�������
     */
    String str = "asdd1223";
    System.out.println("����ǰ��" + str);
    //StringBuilder �ɱ���ַ�����
    StringBuilder s = new StringBuilder(str);
    s.reverse();
    System.out.println("�����" + s);


    int[] s1 = {1, 4, 3, 2, 3, 5, 4, 6};
    for (int i = 0; i < s1.length - 1; i++) {
      for (int j = 0; j < s1.length - 1 - i; j++) {
        if (s1[j] > s1[j + 1]) {
          int t = s1[j];
          s1[j] = s1[j + 1];
          s1[j + 1] = t;
        }
      }
    }
	System.out.println(Arrays.toString(s1));
    for (int x = 0; x < s1.length; x++) {
      System.out.println(s1[x]);
    }
  }
}
