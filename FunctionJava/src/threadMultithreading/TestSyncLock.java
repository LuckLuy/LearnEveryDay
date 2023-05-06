package threadMultithreading;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description：使用 Object 类的 wait()/notify() 
 * @author 鲁先生
 * @date 2022/8/26 15:45
 */
public class TestSyncLock {
  public static void main(String[] args) {
    /**
     * Object 类提供了线程间通信的方法：wait()、notify()、notifyAll()，它们是多线程通信的基础，而这种实现方式的思想自然是线程间通信。
     *
     * 注意：wait/notify 必须配合 synchronized 使用，wait 方法释放锁，notify 方法不释放锁。
     * wait 是指在一个已经进入了同步锁的线程内，让自己暂时让出同步锁，以便其他正在等待此锁的线程可以得到同步锁并运行,
     * 只有其他线程调用了notify()，notify并不释放锁，
     * 只是告诉调用过wait()的线程可以去参与获得锁的竞争了，但不是马上得到锁，因为锁还在别人手里，别人还没释放，
     * 调用 wait() 的一个或多个线程就会解除 wait 状态，重新参与竞争对象锁，程序如果可以再次得到锁，就可以继续向下运行。
     */
    // 定义一个锁对象
    Object lock = new Object();
    List<String> list = new ArrayList<>();
    // 线程A
    Thread threadA = new Thread(() -> {
      synchronized (lock) {
        for (int i = 1; i <= 10; i++) {
          list.add("abc");
          System.out.println("县农村A添加元素，此时list的size为：" + list.size());
          try {
            Thread.sleep(500);
          } catch (Exception e) {
            e.printStackTrace();
          }
          if (list.size() == 5) {
            lock.notify();//唤醒B线程
          }
        }
      }
    });
    // 线程B
    Thread threadB = new Thread(() -> {
      for (true) {
        synchronized (lock) {
          if (list.size() != 5) {
            try {
              lock.wait();
            } catch (Exception e) {
              e.printStackTrace();
            }
          }
          System.out.println("线程B收到通知，开始执行自己的业务。。。");
        }
      }
    });
    //需要先启动线程B
    threadB.start();
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      e.printStackTrace();
    }
    threadA.start();
  }
}
