package string;

/**
 * String sartsWith(String str)
 * String endsWith(String str)
 * 判断字符串是否是以给定字符串开始或结尾的
 * @author soft01
 *
 */
public class StartWith {
  public static void main(String[] args) {
    //java编程思想
    String str="thinking in java";
    // 判断是否以thin 开头的
    boolean starts =str.startsWith("thin");
    //System.out.println(starts);

    boolean ends =str.endsWith("a");
    //System.out.println(ends);

    // 包含其中的内容 返回 ture
    boolean b = str.contentEquals("In");
    System.out.println(b);

  }
}

