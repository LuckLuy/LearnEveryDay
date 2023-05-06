package string;

import java.util.ArrayList;
import java.util.List;

/**
 *  替换字符中的字符
 */
public class Replace {
  public static void main(String[] args) {

    String str="abc123def456ghi111";

    // 全部替换字符串中的1 为9
    str = str.replaceAll("1","9");
    System.out.println(str);


    str= str.replace("9","O");
    System.out.println(str);

    // 适合正则的替换
    str =str.replaceAll("[0-9a-z]","hello");
    System.out.println(str);
    System.out.println("***************************************");

    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("tree");

    for(int i=0;i<list.size();i++){
      String s = list.get(i);
      System.out.println(s + ":" + list.get(i) + " : " +list.get(i).replace("\"",""));

      }
  }
}
