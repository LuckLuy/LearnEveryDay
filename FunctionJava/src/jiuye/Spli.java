package jiuye;

import java.util.Arrays;

public class Spli {
  public static void main(String[] args) {

    String str = "abc123def456ghi";
    //按照数字部分拆分
    String[] array = str.split("[0-9]+");
    System.out.println(array.length);
    System.out.println(Arrays.toString(array));

    /*
     * 在拆分时若连续匹配到拆分内容，则中间会拆分
     * 出一个空字符串。但是在字符串末尾连续匹配的
     * 话拆分的空字符串会全部忽略
     */
//	str = "........1.2.3.4.5.6.7.8";
//	str = "1.2.3.4.........5.6.7.8";
    str = "1.2.3.4.5.6.7.8........";
    array = str.split("\\.");
    System.out.println(array.length);
    System.out.println(Arrays.toString(array));

    /*
     * 图片重命名
     * 1.jpg
     */
/*	String image = "1.jpg";
	array = image.split("\\.");
	image = System.currentTimeMillis()+"."+array[1];
	System.out.println(image);
*/
  }

}
