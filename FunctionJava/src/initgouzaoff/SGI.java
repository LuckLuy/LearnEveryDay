package initgouzaoff;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 构造方法：
 * set方法：
 * 
 * @author lyy
 *
 */
class Point{
	private int x;
	private int y;
	
	public Point() {
		super();
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

public class SGI {
	/**
	 * 无参构造
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	static Object newInstance01(Class<?> cls) throws Exception{
		//1,获取类对象对应的构造方法对象。
		Constructor<?> con=cls.getDeclaredConstructor();
		//2,设置构造方法可访问。
		con.setAccessible(true);
		//3,基于构造方法对象构造类的对象。
		
		return con.newInstance();
	}
	/**
	 * 有参构造
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	static Object newInstance02(Class<?> cls) throws Exception{
		//1,获取类对象对应的构造方法对象。
		Constructor<?> con=cls.getDeclaredConstructor(int.class,int.class);
		//2,设置构造方法可访问。
		con.setAccessible(true);
		//3,基于构造方法对象构造类的对象。
		
		return con.newInstance(10,20);
	}
	
	static Object doSetDi(Class<?> cls) throws Exception{
		//1,构造对象
		Object obj=newInstance01(cls);
		//2，调用对象set方法
		String name="X";
		int xValue=10;
		/*
		Method setX=cls.getDeclaredMethod("set"+name,int.class);
		setX.invoke(obj, xValue);*/
		
		Method[] ms=cls.getDeclaredMethods();
		for(Method m:ms) {
			if(m.getName().equals("set"+name)) {
				m.invoke(obj, xValue);
			}
		}
		
		return obj; 
	}
	
	public static void main(String[] args) throws Exception{
		Class<?> cls=Class.forName("initgouzaoff.Point");
		Object o1=newInstance01(cls);
		System.out.println(o1);
	
		Object o2=newInstance02(cls);
		System.out.println(o2);
		
		//set
		Object o3 = doSetDi(cls);
		System.out.println(o3);
	}
}
