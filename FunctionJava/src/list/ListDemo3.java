package list;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ṩ��ȡ�Ӽ��Ĳ�����List subList(int start,int end)
 * ��ȡָ����Χ�ڵ��Ӽ���
 */
public class ListDemo3 {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    for(int i=0;i<10;i++){
      list.add(i);
    }

    //��ȡָ��λ�õ�Ԫ��3-8����ͷ����β�������3.4.5.6.7.
    List<Integer> ll=list.subList(0,3);
    System.out.println(ll);

    /*
     * ���Ӽ�Ԫ�ظ�����10����
     * ��30��40��50��60��70��
     */
    for(int i=0;i<ll.size();i++){
      int num =ll.get(i);
      num*=10;
      ll.set(i,num);
    }
    System.out.println(ll);

    System.out.println(list);

    // ��list ������6-8ɾ��
    list.subList(6,8).clear();
    System.out.println(list);

    list.add(2);
    System.out.println(list);
  }

}
