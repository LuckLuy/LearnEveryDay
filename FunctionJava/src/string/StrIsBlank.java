package string;

import cn.hutool.core.util.StrUtil;

/**
 * @author Â³ÏÈÉú
 * @Description£º¶Ô×Ö·û´®ÅÐ¿Õ
 * @date 2021/7/7 9:14
 */
public class StrIsBlank {
  public static void main(String[] args) {
    String str ="";
    boolean blank = StrUtil.isBlank(str);
    System.out.println(blank);

    String str1 =" ";
    boolean blank1 = StrUtil.isBlank(str);
    System.out.println(blank1);

    String str2 =null;
    boolean blank2 = StrUtil.isBlank(str);
    System.out.println(blank2);


    String str3 = "2";
    System.out.println( str3 = StrUtil.isBlank(str3) ? "123" :"456");






  }
}
