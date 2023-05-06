package object;

/**
 * 作用：返回字符串的哈希码值，用于判断两个对象的地址是不是同一个。注意与上面equals()方法的区别哈。
 */
public class hashCode {
  public static void main(String args[]) {
    String str = new String("https://zhuanlan.zhihu.com/p/93556076/edit");
    System.out.println("字符串的哈希码为 :" + str.hashCode() );
  }
}
