package thread_demo;


/**
 *   消费者
 */

public class RunableDemo {
  private static Runnable runnable = new Runnable() {
    @Override
    public void run() {
      try {
        String runnableName = Thread.currentThread().getName();
        System.out.println(runnableName+" start ......");
        System.in.read();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  };
  public static void main(String[] args) {
    // 所有中间件技术都是基于tcp/ip  协议基础之上 构建新型的协议规范，只不过rabbitmq  遵循的是amqp。

    // 启动三个线程去执行。
    new Thread(runnable ,"queue1").start();
    new Thread(runnable ,"queue2").start();
    new Thread(runnable ,"queue3").start();

    }

}
