package list;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSortList {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("tom");
    list.add("jerry");
    list.add("JACK");
    list.add("TOMAS");
    list.add("MIKE");
    list.add("bill");
    list.add("jackson");
    list.add("micjell");
    System.out.println(list);
    /*
     * 字符串比较大小的规则是按照首字符的unicode编码比较。
     * 若第一个字符一样则看第二个，依次类推。
     */
    Collections.sort(list);

    System.out.println(list);
  }
}
