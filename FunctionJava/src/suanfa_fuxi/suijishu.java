package suanfa_fuxi;

import java.util.HashSet;
import java.util.Set;

/**
 *    1~ 100 之间的数
 */
public class suijishu {
public static void main(String[] args) {
	Set<Integer> s=new HashSet();
	//如果这里定义 写成一个数值 比如说100，
	 //如果随机值是100，循环就会终止，随机生成的数量无法保证。
	for(int i=0;;i++) {
		s.add(1+(int)(Math.random()*100));
		if(s.size() ==100) {
			break;
		}
	}
	for(Integer i:s) {
		System.out.print(i+",");
	}
	System.out.println();
	System.out.println("随机数一共："+ s.size());
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
