package string;

/**
 * ���ַ������Դ�Сд���бȽ�
 */
public class equalsIgnoreCase {

  private static final String  STR_DATE = "2020-02";

  public static void main(String[] args) {
    String str = "helloworld";
    boolean f =str.equalsIgnoreCase("Helloworld");
    System.out.println(f);
    String strDate = "2020-02";

    System.out.println(STR_DATE.equals(strDate));
    System.out.println(STR_DATE.equalsIgnoreCase(strDate));
    System.out.println(STR_DATE.contains(strDate));
  }
}
