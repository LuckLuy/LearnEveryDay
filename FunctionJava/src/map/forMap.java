package map;

import org.assertj.core.util.Sets;

import java.util.*;
import java.util.function.BiConsumer;
/**
 * ����map
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

    // �����ȡmap�ļ�ֵ
    //System.out.println(map.get("Tom"));

    // ѭ�� 1��
    // �½�һ�� map ��entry  ʵ������õ�һ��
    Set<Map.Entry<String,String>> entries = map.entrySet();
    /**
     * ��Map�������ʵ�塣
     * Map.Entry��Map�ӿ�bai��du��һ���ڲ��ӿڣ�����ӿڵĶ����а�����K��V��
     * ��ȡK�ķ�daoʽ��Map.Entry������.getKey()����ȡV�ķ�ʽ��Map.Entry������.getValue();
     * ͨ��Map��ȡMap.Entry�ķ�ʽ��map.entrySet()
     */
    System.out.println("��1�ַ���");
    for(Map.Entry<String ,String> entry :entries ){

      System.out.println(entry.getKey() +":"+entry.getValue());
    }


    System.out.println("********************************");

    // �ڶ��ַ���
    System.out.println("�ڶ��ַ���");
    Iterator<Map.Entry<String,String>> iterator =map.entrySet().iterator();
   /* for (iterator.hasNext()){
      Map.Entry<String,String> next =iterator.next();
      System.out.println(next.getKey()+"--"+next.getValue());
    }*/

    System.out.println("********************************");


    // �����ַ���  ����key
    // ������ key ������key ��ȡvalue
    System.out.println("�����ַ���");
    Set<String> keySet = map.keySet();
    for(String str : keySet){
      System.out.println(str +"=="+map.get(str));
    }
    System.out.println("********************************");

    System.out.println("********  �����ַ���  ************************");
     // �����ַ���
    System.out.println("�����ַ���");
    map.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String s, String s2) {

        System.out.println(s+"=>"+s2);
      }
    });

    //  �����ַ���
    System.out.println("********************************");
    System.out.println("�����ַ���");
    map.forEach((s1,s2)-> System.out.println(s1+"<=>"+s2));

    //  �����ַ���  //ͨ��Map.values()�������е�value�������ܱ���key
    System.out.println("********************************");
    System.out.println("�����ַ���");

    for(Object ob :map.values()){
      System.out.println(ob);
    }
    System.out.println("********************************");

    //  ͨ��value ��ȡkey
    System.out.println("*******77777*************************");

    // ���淵��һ��key
    System.out.println(getKey(map,"2"));


    System.out.println("*******88888*************************");
    Set<String> arry12 = null;
    // ����һ��map
    for(Map.Entry<String ,String> entry :map.entrySet() ){
      arry12=getKeyAll(map,entry.getValue());
      System.out.println(arry12);

    }


  }


  //  1������value ��ȡkey
  private static String getKey(Map<String,String> map,String value){
    String key ="";
    for(Map.Entry<String,String> entry :map.entrySet()){
      if(value.equals(entry.getValue())) {
        key = entry.getKey();
      }
    }
    return key;
  }

  // 2,����key ��ȡvalue ������ȡkey

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