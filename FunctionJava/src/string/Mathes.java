package string;
/**
 * String ֧��������ʽ�ķ���һ��
 * boolean matches(String regex)
 * ʹ�ø�����������ʽ��֤��ǰ�ַ����Ƿ������ʽҪ��
 * �����򷵻�true,�������򷵻�false��
 *
 * ��Ҫע�⣡��������
 * ������������ʽ�������Ƕ�����˱߽�ƥ�����^����$)
 * ������ȫƥ����֤��
 *
 */
public class Mathes {
  public static void main(String[] args) {
    String mail = "fancq@tedu.cn";
    String regex="[a-zA-z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)";

    boolean flag = mail.matches(regex);
    if(flag){
      System.out.println("������ȷ��");
      return;
    }
      System.out.println("������д���󣡣���");
  }
}
