package twenty_three_DesignPatterns.singleton;

/**
 *  �������Խ���߳�ͬ���������Է�ֹ�����л���
    ö�� д������ţд����
 */
public enum Singleton5 {

  INSTANCE;

  public void  m(){};

  public  static  void main(String[] args){
    for (int i=0;i<10;i++){
      new Thread(()->{
        System.out.println(Singleton4.getInstance().hashCode());
      }).start();
    }
  }
}
