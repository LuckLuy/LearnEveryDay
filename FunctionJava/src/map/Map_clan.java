package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Map_clan {
  public static void main(String[] args) {

    // ����map  û��˳��
    Map<String,Integer> mp =new HashMap<>();
    mp.put("С��",19);
    mp.put("С��",18);
    mp.put("С��",22);
    mp.put("С��",26);
    mp.put("С��",23);
    mp.put("С��",null);
    mp.put(null,null);

    System.out.println(mp);
    System.out.println("************************");
    //�滻value������
    Integer age = mp.put("С��",21);
    System.out.println(mp.get("С��"));
    System.out.println("************************");

    //* ���ݸ�����key��ȡ��Ӧ��value����������key�����ڣ��򷵻�ֵnull��
    Integer name= mp.get("Сer");
    System.out.println(name);

    //  HashMap ����������null �ļ�ֵ��value��ֻ����һ��
    Integer name2= mp.get("С��");
    System.out.println(name2);

    /**
     * V remove(Object key)
     * ��������key����Ӧ�ļ�ֵ��ɾ����ɾ����Ὣ��key��Ӧ��value���ء�
     */

    name2= mp.remove("С��");
    System.out.println(name2);
    System.out.println(mp);

    System.out.println("************************");

    // map �ж��ٸ�
    System.out.println(mp.size());
    System.out.println("************************");

    // �ж��Ƿ����ָ����key��value��
    // 1,����key �����жϡ���������true������false
    boolean flag = mp.containsKey("С��");
    System.out.println(flag);
    // 2,���� value �����жϡ���������true������false
    boolean va = mp.containsValue(27);
    System.out.println(va);

    System.out.println("************************");

    TreeMap<String,Integer> tree = new TreeMap<>();
    tree.put("С��",19);
    tree.put("С��",18);
    tree.put("С��",22);
    tree.put("С��",26);
    tree.put("С��",23);
    tree.forEach((s1,s2)-> System.out.println(s1+"=="+s2));


    Map<String ,Integer> tb =new Hashtable<>();

  }
}
