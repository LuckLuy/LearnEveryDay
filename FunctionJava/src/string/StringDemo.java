package string;

import java.util.Arrays;

public class StringDemo {
  public static void main(String[] args) {
/*    String[] array = new String[]{"1", "2", "3", "4", "5"};
    String[] array1 = {"1", "2", "3", "4", "5"};


    System.out.println(Arrays.toString(array1));*/

    String str=  " 阿斯顿将垃圾速度快 收到啊\n asldkjalsjd"+
        "\r"+
        "阿斯顿就拉开就\\n";
   // str.trim();
    //System.out.println(str);
    String flge = str.replaceAll("[\r\n]", "");
    System.out.println(flge);

    String i = flge.replace("\\n","");
    System.out.println(i);
  }
}
