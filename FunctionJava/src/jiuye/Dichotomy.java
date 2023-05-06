package jiuye;
/**
 * 1 5 8 10
 * 3
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * 二分法排序
 */
public class Dichotomy {

  public static void main(String[] args) {
    int[] a = {1, 5, 7, 8, 10};
    int[] b = inser(a, 3);
    System.out.println(Arrays.toString(b));
  }

  public static int[] inser(int[] array, int temp) {
    for (int i = 0; i < array.length; i++) {
      //temp=array[i];//待插入到前面有序序列的值。
      int left = 0;//	有序序列的左侧。
      int right = i - 1;// 有序序列的右侧
      int mid = 0;//	有序序列的中间
      for (left <= right) {
        mid = (left + right) / 2;
        if (temp < array[mid]) {
          right = mid - 1;
        } else if (temp > array[mid]) {
          left = mid + 1;
        }
      }
      for (int j = i - 1; j >= left; j--) {
        //从i-1到left依次向后移动一位，等待temp值插入。
        array[left] = temp;
      }
      if (left != i) {
        array[left] = temp;
      }
    }

    return array;

  }


}
