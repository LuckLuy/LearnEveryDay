package list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {

    //创建集合
    List<String> list = new ArrayList<String>();
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");

    //输出集合内的所有元素
    System.out.println(list);
    System.out.println("===================");
    //输出集合内指定下标的元素。
    String str = list.get(1);
    System.out.println(str);

    System.out.println("----------");
    for (String ll : list) {
      System.out.println(ll);
    }

    System.out.println("+++++++++++++++++=");
    //遍历的集合元素的时候，集合内的长度用size 来表达。
    for (int i = 0; i < list.size(); i++) {
      String ss = list.get(i);
      System.out.println(ss);
    }
    System.out.println("+++++++++++++++++=");
    //删除集合内指定下标的元素。
    String s2=  list.remove(0);
    System.out.println(s2);
    System.out.println(list);

    System.out.println("+++++++将给定元素 “two”，设置到指定位置 1.（相当于替换）++++++++++=");
    //将给定元素 “two”，设置到指定位置 1.（相当于替换）
    String s3 = list.set(1,"tree");
    System.out.println(s3);
    System.out.println(list);

    // 清空集合
    list.removeAll(list);
    System.out.println(list);

    list.clear();
  }
}
