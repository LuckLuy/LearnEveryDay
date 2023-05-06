package map;

import org.assertj.core.util.Sets;

import java.util.*;
import java.util.function.BiConsumer;
/**
 * 遍历map
 */
public class forMap {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("Tom", "1");
    map.put("Jarry", "2");
    map.put("Hello", "3");
    map.put("Soall", "4");
    map.put("Lui", "5");
    map.put("LILI", "6");
    map.put("MIMI", "7");
    map.put("Opaer", "8");
    map.put("KIm", "9");
    map.put("WANG", "10");
    map.put("Max", "11");
    map.put("MIn", "12");
    map.put("Haha", "13");

    // 常规获取map的键值
    //System.out.println(map.get("Tom"));

    // 循环 1，
    // 新建一个 map 的entry  实际中最常用的一个
    Set<Map.Entry<String,String>> entries = map.entrySet();
    /**
     * 是Map集合里的实体。
     * Map.Entry是Map接口bai中du的一个内部接口，这个接口的对象中包含了K和V；
     * 获取K的方dao式是Map.Entry对象名.getKey()，获取V的方式是Map.Entry对象名.getValue();
     * 通过Map获取Map.Entry的方式是map.entrySet()
     */
    System.out.println("第1种方法");
    for(Map.Entry<String ,String> entry :entries ){

      System.out.println(entry.getKey() +":"+entry.getValue());
    }


    System.out.println("********************************");

    // 第二种方法
    System.out.println("第二种方法");
    Iterator<Map.Entry<String,String>> iterator =map.entrySet().iterator();
   /* for (iterator.hasNext()){
      Map.Entry<String,String> next =iterator.next();
      System.out.println(next.getKey()+"--"+next.getValue());
    }*/

    System.out.println("********************************");


    // 第三种方法  遍历key
    // 先设置 key ，根据key 获取value
    System.out.println("第三种方法");
    Set<String> keySet = map.keySet();
    for(String str : keySet){
      System.out.println(str +"=="+map.get(str));
    }
    System.out.println("********************************");

    System.out.println("********  第四种方法  ************************");
     // 第四种方法
    System.out.println("第四种方法");
    map.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String s, String s2) {

        System.out.println(s+"=>"+s2);
      }
    });

    //  第五种方法
    System.out.println("********************************");
    System.out.println("第五种方法");
    map.forEach((s1,s2)-> System.out.println(s1+"<=>"+s2));

    //  第六种方法  //通过Map.values()遍历所有的value，但不能遍历key
    System.out.println("********************************");
    System.out.println("第六种方法");

    for(Object ob :map.values()){
      System.out.println(ob);
    }
    System.out.println("********************************");

    //  通过value 获取key
    System.out.println("*******77777*************************");

    // 常规返回一个key
    System.out.println(getKey(map,"2"));


    System.out.println("*******88888*************************");
    Set<String> arry12 = null;
    // 返回一个map
    for(Map.Entry<String ,String> entry :map.entrySet() ){
      arry12=getKeyAll(map,entry.getValue());
      System.out.println(arry12);

    }


  }


  //  1，根据value 获取key
  private static String getKey(Map<String,String> map,String value){
    String key ="";
    for(Map.Entry<String,String> entry :map.entrySet()){
      if(value.equals(entry.getValue())) {
        key = entry.getKey();
      }
    }
    return key;
  }

  // 2,根据key 获取value 批量获取key

  private static <K,V> Set<K> getKeyAll(Map<K, V> map, V value){
    Set<K> set = Sets.newHashSet();
    for(Map.Entry<K, V> entry :map.entrySet()){
      if(Objects.equals(entry.getValue(),value)){
        set.add(entry.getKey());
      }
    }
    return  set;
  }


}