package string;

import java.util.HashMap;
import java.util.Map;

/**
 *  查找字符串中出现的位置
 */
public class IndexOf {
  public static void main(String[] args) {

    String str = "sadadsdsfsfsf asd inniin java";
    //查找给定字符串第一次出现的位置
    int index =str.indexOf("s");
    System.out.println(index);
    // 从指定位置开始查找第一次出现给定的位置
    int indexStart= str.indexOf("sf",3);
    System.out.println(indexStart);
    // 查找最后一次出现给定字符的位置
    int indexEnd = str.lastIndexOf("d");
    System.out.println(indexEnd);

    //  获取 sadasda
    String ss = "ou=sadasda,cn=131313131";
    String[] split = ss.split(",");
    Map<String,String> map = new HashMap<>();
    for( String name : split){
      map.put(name.substring(0,name.indexOf("=")),name.substring(name.indexOf("=")+1,name.length()));
    }
    System.out.println(map.get("ou"));



  }
}
