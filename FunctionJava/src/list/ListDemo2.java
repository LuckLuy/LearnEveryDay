package list;

import cn.hutool.core.text.CharSequenceUtil;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("java");
    list.add("web");
    list.add("vue");
    list.add("mysql");

    //��ָ����λ�ò������Ԫ��
    list.add(0,"Orecle");
    System.out.println(list);


    // ɾ��������ָ��λ�ö�Ӧ��Ԫ��
/*    String old = list.remove(0);
    System.out.println(old);
    System.out.println(list);*/

    String replace = CharSequenceUtil.replace("SssS", "ss", "123");
    System.out.println(replace);

  }
}
