package twenty_three_DesignPatterns.singleton;

/**
 * ����ʽ
 *
 *  ���Ǵ�����ʽ�������Կ���������ʵ�����ӳټ��أ���ֻ��������ʹ�õ�ʱ��Ż�ʵ����һ�����󲢽����Լ������á�
 *
 * ����д������Lazy Loading��Ч��������ֻ���ڵ��߳���ʹ�á�����ڶ��߳��£�һ���߳̽�����if (singleton == null)�ж����飬
 * ��δ���ü�����ִ�У���һ���߳�Ҳͨ��������ж���䣬��ʱ���������ʵ���������ڶ��̻߳����²���ʹ�����ַ�ʽ��
 */
public class Singleton2 {
  // ָ���Լ�ʵ����˽�о�̬���á�
  private  static Singleton2 singleton2;

  // ˽�еĹ��췽��
  private Singleton2(){};

  // �Լ�ʵ��Ϊ����ֵ�ľ�̬�Ĺ��з�������̬����������
  public static Singleton2 getSingleton2(){
    // ������������������Ҫʹ��ʱ��ȥ������
    if(singleton2 == null){
      singleton2 = new Singleton2();
    }
    return singleton2;
  }
}
