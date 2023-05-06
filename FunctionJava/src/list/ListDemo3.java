package list;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供获取子集的操作：List subList(int start,int end)
 * 获取指定范围内的子集。
 */
public class ListDemo3 {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    for(int i=0;i<10;i++){
      list.add(i);
    }

    //截取指定位置的元素3-8，含头不含尾，结果是3.4.5.6.7.
    List<Integer> ll=list.subList(0,3);
    System.out.println(ll);

    /*
     * 将子集元素各扩大10倍。
     * 【30，40，50，60，70】
     */
    for(int i=0;i<ll.size();i++){
      int num =ll.get(i);
      num*=10;
      ll.set(i,num);
    }
    System.out.println(ll);

    System.out.println(list);

    // 将list 集合中6-8删除
    list.subList(6,8).clear();
    System.out.println(list);

    list.add(2);
    System.out.println(list);
  }

}
