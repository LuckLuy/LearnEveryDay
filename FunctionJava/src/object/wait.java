package object;

/**
 * wait()的作用：让当前线程进入等待状态，同时，
 * wait()也会让当前线程释放它所持有的锁。“直到其他线程调用此对象的
 * notify() 方法或 notifyAll() 方法”，当前线程被唤醒并进入“就绪状态”。
 *
 *
 * wait(long timeout)的作用：让当前线程处于“等待(阻塞)状态”，
 * “直到其他线程调用此对象的notify()方法或 notifyAll() 方法，
 * 或者超过指定的时间量”，当前线程被唤醒并进入“就绪状态”。
 *
 */


/**
 * 调用wait()方法后当前线程就进入睡眠状态，直到以下事件发生。
 *
 * （1）其他线程调用了该对象的notify方法。
 *
 * （2）其他线程调用了该对象的notifyAll方法。
 *
 * （3）其他线程调用了interrupt中断该线程。
 *
 * （4）时间间隔到了。
 */

 class ThreadA extends  Thread{
  public ThreadA(String name){
    super(name);
  }

  public  void run(){
    synchronized (this){
      try {
        // 当前线程阻塞1s，确保主程序的 t1.wait(); 执行之后再执行 notify()
        Thread.sleep(1000);
        System.out.println("111");
      }catch (Exception e){
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName()+"call notify()");
      // 唤醒当前的wait线程
      this.notify();
    }
  }
}

public class wait{
  public static  void main(String[] args) {

    ThreadA threadA = new ThreadA("threadA");

    synchronized (threadA){
      try {
        //启动线程threadA
        System.out.println(Thread.currentThread().getName()+" start t1");
        threadA.start();
        //主线程等待threadA 通过notify唤醒
        System.out.println(Thread.currentThread().getName()+" wait()");
        //不是threadA 线程等待，而是当前执行wait 的线程等待
        threadA.wait();
        System.out.println(Thread.currentThread().getName()+"  continue");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}