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
     * �ַ����Ƚϴ�С�Ĺ����ǰ������ַ���unicode����Ƚϡ�
     * ����һ���ַ�һ���򿴵ڶ������������ơ�
     */
    Collections.sort(list);

    System.out.println(list);
  }
}
