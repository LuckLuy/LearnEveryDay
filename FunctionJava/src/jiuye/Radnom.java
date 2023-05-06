package jiuye;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author lyy
 */
public class Radnom {
public static void main(String[] args) {
	
	List<Integer>  a=new ArrayList<Integer>();
	List<Integer>  b=new ArrayList<Integer>();
	List<Integer>  c=new ArrayList<Integer>();	
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);	
	b.add(3);
	b.add(4);
	b.add(5);
	a.removeAll(b);//删除和b集合里相同的元素
	a.addAll(b);  //把b集合全部元素添加到 a集合里
	c.addAll(a);  //把a集合全部元素添加到 c集合里
	System.out.println(c);
	//第二种方法 遍历出来 再添加到c集合里
	/*for (int i = 0; i <a.size(); i++) {
		Integer ss=a.get(i);
		c.add(ss);
	}
	System.out.println(c);*/


	System.out.println("   SecureRandom   ");
	for (int i = 0; i <10; i++) {
		SecureRandom getNumber = new SecureRandom();
		System.out.println(getNumber.nextInt());
	}
	System.out.println("   Random   ");
	for (int i = 0; i <10; i++) {
		Random getNumber = new Random();
		System.out.println(getNumber.nextInt());
	}

}
}
