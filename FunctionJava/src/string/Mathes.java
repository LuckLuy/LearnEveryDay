package string;
/**
 * String 支持正则表达式的方法一：
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否满足各式要求
 * 满足则返回true,不满足则返回false。
 *
 * 需要注意！！！！！
 * 给定的正则表达式，无论是都添加了边界匹配符（^……$)
 * 都是做全匹配验证。
 *
 */
public class Mathes {
  public static void main(String[] args) {
    String mail = "fancq@tedu.cn";
    String regex="[a-zA-z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)";

    boolean flag = mail.matches(regex);
    if(flag){
      System.out.println("邮箱正确。");
      return;
    }
      System.out.println("邮箱书写错误！！！");
  }
}
