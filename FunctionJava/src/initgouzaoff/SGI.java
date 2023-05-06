package initgouzaoff;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * ���췽����
 * set������
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
	 * �޲ι���
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	static Object newInstance01(Class<?> cls) throws Exception{
		//1,��ȡ������Ӧ�Ĺ��췽������
		Constructor<?> con=cls.getDeclaredConstructor();
		//2,���ù��췽���ɷ��ʡ�
		con.setAccessible(true);
		//3,���ڹ��췽����������Ķ���
		
		return con.newInstance();
	}
	/**
	 * �вι���
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	static Object newInstance02(Class<?> cls) throws Exception{
		//1,��ȡ������Ӧ�Ĺ��췽������
		Constructor<?> con=cls.getDeclaredConstructor(int.class,int.class);
		//2,���ù��췽���ɷ��ʡ�
		con.setAccessible(true);
		//3,���ڹ��췽����������Ķ���
		
		return con.newInstance(10,20);
	}
	
	static Object doSetDi(Class<?> cls) throws Exception{
		//1,�������
		Object obj=newInstance01(cls);
		//2�����ö���set����
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
