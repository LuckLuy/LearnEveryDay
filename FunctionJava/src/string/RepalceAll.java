package string;

/**
 * @Description： matches  正则的格式匹配
 * 在字符串匹配给定的正则表达式时，返回 true。
 * @author 鲁先生
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
