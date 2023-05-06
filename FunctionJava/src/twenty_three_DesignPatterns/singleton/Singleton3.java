package twenty_three_DesignPatterns.singleton;

import org.assertj.core.internal.bytebuddy.asm.Advice;

import java.util.concurrent.locks.Lock;

/**
 * 双重加锁机制
 */
public class Singleton3 {

  private static Singleton3 singleton3;

  private  Singleton3 (){};

  public static Singleton3 getSingleton3(){
    if(singleton3 == null){
      // 双重检查
      synchronized (Singleton3.class){
        if (singleton3==null){
          singleton3 = new Singleton3();
        }
      }
    }
    return singleton3;
  }

  public static void main(String[] args) {
    for (int i=0; i<10; i++){
      new Thread( ()->{
        System.out.println(Singleton3.getSingleton3().hashCode());
      }).start();
    }
  }
}
