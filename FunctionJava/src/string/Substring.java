package string;

/**
 * String substring(int start,int end)
 * ��ȡ��ǰ�ַ�����ָ����Χ�ڵ�����
 * ע����java API����ͨ��ʹ���������ֱ�ʾ��Χʱ�����ǡ���ͷ����β����
 * @author soft01
 *
 */
public class Substring {
  public static void main(String[] args) {


    String str = "www.tedu.cn";
    //��ȡһ�γ���֮�ڵ�

    String str1 =str.substring(0,3);
    System.out.println(str1);

    //��ָ��λ�ý�ȡ��ĩβ
    str=str.substring(0);
    System.out.println(str);
  }
}
