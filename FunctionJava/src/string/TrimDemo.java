package string;
/**
 * String trim()
 * ȥ����ǰ�ַ������ߵĿհ��ַ�
 *
 */
public class TrimDemo {

  public static void main(String[] args) {
    String str = "   he    llo			";
    // ȥ���ַ��������пո�
    String str1 = str.trim();
    System.out.println(str1);

    String reg = "(?:(?!(^\\s+|\\s+$))\\s)/g";
    System.out.println(str.replace("\\s",""));

  }
}
