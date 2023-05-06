package jiuye;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashMapDemo {
public static void main(String[] args) {
	
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	ArrayList<String> list=new ArrayList<String>();
	
	for(int i=0;i<1000000;i++) {
		String key=UUID.randomUUID().toString()+i;
		list.add(key);
		map.put(key, 1);
	}
	String key =list.get(list.size()-1);
	//��ѯlist
	long t1=System.nanoTime();
	int index=list.indexOf(key);
	long t2=map.get(key);
	int i=map.get(key);
	long t3=System.nanoTime();
	System.out.println((t2-t1)+","+(t3-t2));
	
	
	
	ConcurrentHashMap<String,Integer> hashMap=new ConcurrentHashMap<String,Integer>(); 
	hashMap.put("СĪ",1);
	hashMap.put("С��", 2);
	hashMap.put("С��", 3);
	System.out.println(hashMap);
	
	CopyOnWriteArrayList<String> list1 =new CopyOnWriteArrayList<String>();
	list1.add("tom");
	list1.add("jarry");
	System.out.println(list1);
	
	
	
	
	
	
}
}
