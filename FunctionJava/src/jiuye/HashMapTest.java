package jiuye;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<String,String>();
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
		/**
		 * 根据散列值，依据code值 依次查找。
		 */
		System.out.println(map.get("Tom"));
		for(int i=0;i<map.size() ; i++){
			System.out.println(map);

		}
	}
}
