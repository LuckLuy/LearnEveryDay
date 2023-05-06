package jiuye;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		final ArrayList<String> list =new ArrayList<String>();
		list.add("Tom");
		list.add("jarry");
		list.add("wang");
		
		Thread t=new Thread() {
			public void run() {
				Iterator<String> i=list.iterator();
				for(i.hasNext()) {

				}
			}
		};
	
	}
}
