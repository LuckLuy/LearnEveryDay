package object;

/**
 * ���ã������ַ����Ĺ�ϣ��ֵ�������ж���������ĵ�ַ�ǲ���ͬһ����ע��������equals()�������������
 */
public class hashCode {
  public static void main(String args[]) {
    String str = new String("https://zhuanlan.zhihu.com/p/93556076/edit");
    System.out.println("�ַ����Ĺ�ϣ��Ϊ :" + str.hashCode() );
  }
}
