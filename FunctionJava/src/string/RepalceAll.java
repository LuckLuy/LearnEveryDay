package string;

/**
 * @Description�� matches  ����ĸ�ʽƥ��
 * ���ַ���ƥ�������������ʽʱ������ true��
 * @author ³����
 * @date 2022/5/12 14:20
 */
public class RepalceAll {
  public static void main(String[] args) {

    String  str = "start_99999";
    String endStr = str.startsWith("start_") ? str.replaceAll("start_", "") : "";
    System.out.println(endStr);
    String  str1 = "start_99999";
    System.out.println(str1.matches("start(.*)"));
    System.out.println(str1.contains("9"));


  }
}
