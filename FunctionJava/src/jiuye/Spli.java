package jiuye;

import java.util.Arrays;

public class Spli {
  public static void main(String[] args) {

    String str = "abc123def456ghi";
    //�������ֲ��ֲ��
    String[] array = str.split("[0-9]+");
    System.out.println(array.length);
    System.out.println(Arrays.toString(array));

    /*
     * �ڲ��ʱ������ƥ�䵽������ݣ����м����
     * ��һ�����ַ������������ַ���ĩβ����ƥ���
     * ����ֵĿ��ַ�����ȫ������
     */
//	str = "........1.2.3.4.5.6.7.8";
//	str = "1.2.3.4.........5.6.7.8";
    str = "1.2.3.4.5.6.7.8........";
    array = str.split("\\.");
    System.out.println(array.length);
    System.out.println(Arrays.toString(array));

    /*
     * ͼƬ������
     * 1.jpg
     */
/*	String image = "1.jpg";
	array = image.split("\\.");
	image = System.currentTimeMillis()+"."+array[1];
	System.out.println(image);
*/
  }

}
