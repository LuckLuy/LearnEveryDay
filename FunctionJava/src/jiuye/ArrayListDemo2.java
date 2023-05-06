package jiuye;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class ArrayListDemo2 {
	public static void main(String[] args) throws Exception {
		//如果只使用ArrayList，如何解决线程安全问题？
		//使用代理模式。
		/**
		 * 重写一个类继承List集合，并在实体类里添加方法，在方法里添加	synchronized;
		 * 这样就避免了，并解决了线程安全的文题。
		 */
		
		
	}
}
