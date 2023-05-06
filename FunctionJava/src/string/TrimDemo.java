package string;
/**
 * String trim()
 * 去除当前字符串两边的空白字符
 *
 */
public class TrimDemo {

  public static void main(String[] args) {
    String str = "   he    llo			";
    // 去除字符串中所有空格
    String str1 = str.trim();
    System.out.println(str1);

    String reg = "(?:(?!(^\\s+|\\s+$))\\s)/g";
    System.out.println(str.replace("\\s",""));

  }
}
