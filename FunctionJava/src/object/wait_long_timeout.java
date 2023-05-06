package object;

/**
 * 用代码证明一下wait(long timeout)让当前线程超时就被唤醒
 */
public class wait_long_timeout {
  public static void main(String[] args) {
    ThreadB tb = new ThreadB("tb");
    synchronized (tb){
      try {
       //启动线程tb
        System.out.println(Thread.currentThread().getName()+ " strat +tb");
        tb.start();

        //主线程等待tb 通过notify() 唤醒或notifyAll() 唤醒，或超过3s，然后才会被唤醒。
        System.out.println(Thread.currentThread().getName()+" call wait ");
        tb.wait(3000);

        //
        System.out.println(Thread.currentThread().getName()+ " continue ");
        tb.stop();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

}
class ThreadB extends  Thread{
  public ThreadB(String name){
    super(name);
  }
  public void run(){
    System.out.println(Thread.currentThread().getName()+" run ");

    //创建死循环，不断运行
   /* while (true){
      System.out.println(1);
    }*/
  }
}