package twenty_three_DesignPatterns.singleton;

/**
 *  ��������
 *  ��̬�ڲ��෽ʽ
 *  jvm ��֤������
 *  �����ⲿ��ʱ����������ڲ��࣬��������ʵ�������أ�����ֻ��һ�Ρ�
 *
 */
public class Singleton4 {

  private Singleton4(){};

  private  static class Singleton4Holder{
    private final static Singleton4 INSTANCE = new Singleton4();
  }
  public static Singleton4 getInstance(){
    return  Singleton4Holder.INSTANCE;
  }

  public static void main(String[] args) {
    for (int i=0;i<10;i++){
      new Thread(()->{
        System.out.println(Singleton4.getInstance().hashCode());
      }).start();
    }
  }


}
