package twenty_three_DesignPatterns.singleton;

/**
 *  最完美版
 *  静态内部类方式
 *  jvm 保证单例。
 *  加载外部类时，不会加载内部类，这样可以实现懒加载，而且只有一次。
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
