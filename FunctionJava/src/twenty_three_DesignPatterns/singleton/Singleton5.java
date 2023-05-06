package twenty_three_DesignPatterns.singleton;

/**
 *  不仅可以解决线程同步，还可以防止反序列化。
    枚举 写法，大牛写法。
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
