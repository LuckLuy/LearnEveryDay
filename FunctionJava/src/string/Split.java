package string;

import java.util.Arrays;

/**
 *  split ����ַ���
 */
public class Split {
  public static void main(String[] args) {
    String str = "abc123def456ghi";
    // �����ֽ��зָ�
    String[] arry= str.split("[0-9]+");
    System.out.println(arry.length); //�ָ�ɼ�����


    arry=str.split("3");
    System.out.println(arry.length);//�ָ�ɼ�����

    // Arrays.toString ����������ת��Ϊ�ַ���
    System.out.println(Arrays.toString(arry));


    /**
     *  �ڲ��ʱ������ƥ�䵽������ݣ���֮����ֳ�һ�����ַ�����
     *  �������ַ���ĩβ����ƥ��Ļ�����ֵĿ��ַ�����ȫ�����ԡ�
     */
    String st1="........1.2.3.4.5.6.7.8";
    String st2="1.2.3.4.........5.6.7.8";
    String st3="1.2.3.4.5.6.7.8........";

    String[] arry1= st1.split("\\.");
    String[] arry2= st2.split("\\.");
    String[] arry3= st3.split("\\.");

    System.out.println(Arrays.toString(arry1));
    System.out.println(Arrays.toString(arry2));
    System.out.println(Arrays.toString(arry3));

    String str123 ="03";
    String split = str123.replace("0","");
    System.out.println(split);

  }
}
