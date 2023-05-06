package string;

/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围内的内容
 * 注：在java API当中通常使用两个数字表示范围时，都是“含头不含尾”的
 * @author soft01
 *
 */
public class Substring {
  public static void main(String[] args) {


    String str = "www.tedu.cn";
    //截取一段长度之内的

    String str1 =str.substring(0,3);
    System.out.println(str1);

    //从指定位置截取到末尾
    str=str.substring(0);
    System.out.println(str);
  }
}
