package threadMultithreading;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：多线程 :使用 volatile 关键字
 * @author 鲁先生
 * @date 2022/8/26 14:16
 */
public class TestSync {
  //定义共享变量来实现通信，它需要volatile 修饰，否则线程不能及时感知
  static volatile boolean notice = false;

  public static void main(String[] args) {
    /* 基于 volatile 关键字来实现线程间相互通信是使用共享内存的思想。
    大致意思就是多个线程同时监听一个变量，当这个变量发生变化的时候 ，
    线程能够感知并执行相应的业务。这也是最简单的一种实现方式
     */
    // 1.使用 volatile 关键字
    List<String> list = new ArrayList<>();
    //线程A
    Thread threadA = new Thread(() -> {
      for (int i = 1; i <= 10; i++) {
        list.add("adc");
        System.out.println("线程A添加元素，此时list 的seze 为： " + list.size());
        try {
          Thread.sleep(500);
        } catch (Exception e) {
          e.printStackTrace();
        }
        if (list.size() == 5) {
          System.out.println(list);
          notice = true;
        }
      }
    });
   // 线程B
    Thread threadB = new Thread(()->{
      for (true){
        if(notice){
          System.out.println("线程B 收到通知，开始执行自己的业务 。。。");
          break;
        }
      }
    });
    threadB.start();
    try{
      Thread.sleep(1000);
    }catch (Exception e){
       e.printStackTrace();
    }
    threadA.start();
  }
}
