package jiuye;
/**
 * 1 5 8 10
 * 3
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * ���ַ�����
 */
public class Dichotomy {

  public static void main(String[] args) {
    int[] a = {1, 5, 7, 8, 10};
    int[] b = inser(a, 3);
    System.out.println(Arrays.toString(b));
  }

  public static int[] inser(int[] array, int temp) {
    for (int i = 0; i < array.length; i++) {
      //temp=array[i];//�����뵽ǰ���������е�ֵ��
      int left = 0;//	�������е���ࡣ
      int right = i - 1;// �������е��Ҳ�
      int mid = 0;//	�������е��м�
      for (left <= right) {
        mid = (left + right) / 2;
        if (temp < array[mid]) {
          right = mid - 1;
        } else if (temp > array[mid]) {
          left = mid + 1;
        }
      }
      for (int j = i - 1; j >= left; j--) {
        //��i-1��left��������ƶ�һλ���ȴ�tempֵ���롣
        array[left] = temp;
      }
      if (left != i) {
        array[left] = temp;
      }
    }

    return array;

  }


}
