package list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {

    //��������
    List<String> list = new ArrayList<String>();
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");

    //��������ڵ�����Ԫ��
    System.out.println(list);
    System.out.println("===================");
    //���������ָ���±��Ԫ�ء�
    String str = list.get(1);
    System.out.println(str);

    System.out.println("----------");
    for (String ll : list) {
      System.out.println(ll);
    }

    System.out.println("+++++++++++++++++=");
    //�����ļ���Ԫ�ص�ʱ�򣬼����ڵĳ�����size ����
    for (int i = 0; i < list.size(); i++) {
      String ss = list.get(i);
      System.out.println(ss);
    }
    System.out.println("+++++++++++++++++=");
    //ɾ��������ָ���±��Ԫ�ء�
    String s2=  list.remove(0);
    System.out.println(s2);
    System.out.println(list);

    System.out.println("+++++++������Ԫ�� ��two�������õ�ָ��λ�� 1.���൱���滻��++++++++++=");
    //������Ԫ�� ��two�������õ�ָ��λ�� 1.���൱���滻��
    String s3 = list.set(1,"tree");
    System.out.println(s3);
    System.out.println(list);

    // ��ռ���
    list.removeAll(list);
    System.out.println(list);

    list.clear();
  }
}
