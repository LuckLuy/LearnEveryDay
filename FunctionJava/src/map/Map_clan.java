package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Map_clan {
  public static void main(String[] args) {

    // 创建map  没有顺序
    Map<String,Integer> mp =new HashMap<>();
    mp.put("小三",19);
    mp.put("小五",18);
    mp.put("小六",22);
    mp.put("小七",26);
    mp.put("小九",23);
    mp.put("小八",null);
    mp.put(null,null);

    System.out.println(mp);
    System.out.println("************************");
    //替换value操作。
    Integer age = mp.put("小七",21);
    System.out.println(mp.get("小七"));
    System.out.println("************************");

    //* 根据给定的key获取对应的value，若给定的key不存在，则返回值null。
    Integer name= mp.get("小er");
    System.out.println(name);

    //  HashMap 可以允许有null 的键值和value。只能有一条
    Integer name2= mp.get("小八");
    System.out.println(name2);

    /**
     * V remove(Object key)
     * 将给定的key所对应的键值对删除，删除后会将该key对应的value返回。
     */

    name2= mp.remove("小八");
    System.out.println(name2);
    System.out.println(mp);

    System.out.println("************************");

    // map 有多少个
    System.out.println(mp.size());
    System.out.println("************************");

    // 判断是否包含指定的key和value。
    // 1,根据key 进行判断。包含返回true，否则false
    boolean flag = mp.containsKey("小九");
    System.out.println(flag);
    // 2,根据 value 进行判断。包含返回true，否则false
    boolean va = mp.containsValue(27);
    System.out.println(va);

    System.out.println("************************");

    TreeMap<String,Integer> tree = new TreeMap<>();
    tree.put("小三",19);
    tree.put("小五",18);
    tree.put("小六",22);
    tree.put("小七",26);
    tree.put("小九",23);
    tree.forEach((s1,s2)-> System.out.println(s1+"=="+s2));


    Map<String ,Integer> tb =new Hashtable<>();

  }
}
