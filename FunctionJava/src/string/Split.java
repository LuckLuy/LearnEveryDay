package string;

import java.util.Arrays;

/**
 *  split 拆分字符串
 */
public class Split {
  public static void main(String[] args) {
    String str = "abc123def456ghi";
    // 以数字进行分割
    String[] arry= str.split("[0-9]+");
    System.out.println(arry.length); //分割成几部分


    arry=str.split("3");
    System.out.println(arry.length);//分割成几部分

    // Arrays.toString 方法将它们转换为字符串
    System.out.println(Arrays.toString(arry));


    /**
     *  在拆分时若连续匹配到拆分内容，则之间会拆分出一个空字符串。
     *  但是在字符串末尾连续匹配的话，拆分的空字符串会全部忽略。
     */
    String st1="........1.2.3.4.5.6.7.8";
    String st2="1.2.3.4.........5.6.7.8";
    String st3="1.2.3.4.5.6.7.8........";

    String[] arry1= st1.split("\\.");
    String[] arry2= st2.split("\\.");
    String[] arry3= st3.split("\\.");

    System.out.println(Arrays.toString(arry1));
    System.out.println(Arrays.toString(arry2));
    System.out.println(Arrays.toString(arry3));

    String str123 ="03";
    String split = str123.replace("0","");
    System.out.println(split);

  }
}
