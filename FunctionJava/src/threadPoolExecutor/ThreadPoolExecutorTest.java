package threadPoolExecutor;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 *  线程池的基本使用
 */
public class ThreadPoolExecutorTest {


  /**
   *  创建一个线程池（完整入参）：
   *  核心线程数为 5 （corePoolSize）
   *  最大线程数为 10 (maximumPoolSize)
   *  存活时间为 60分钟(keepAliveTime)
   *  工作队列为LinkedBlockingQueue (workQueue)
   *  线程工厂为默认的DefaultThreadFactory (threadFactory)
   *  饱和策略（拒绝策略）为AbortPolicy: 抛出异常(handler)
   */
  private static ExecutorService THREAD_POOL = new ThreadPoolExecutor(5,10,60, TimeUnit.MINUTES,
      new LinkedBlockingDeque<Runnable>(), Executors.defaultThreadFactory(),
      new ThreadPoolExecutor.AbortPolicy()
      );


  /**
   * 只有一个线程的线程池， 没有超时时间，工作队列使用无界的 LinkedBlockingQueue
   */
  private  static ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();


  /**
   *  有固定的线程池 (即 corePoolSize = maximumPoolSize) 没有超时时间
   *  工作队列使用无界的LinkedBlockingQueue
   */
  private static ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);


  /**
   *  大小不限的线程池 核心线程数为0 ，最大线程数为 Intege.Max_value,存活时间为 60 秒，该线程池可以无限扩展，
   *  并且当需求降低时会自动收缩，工作队列使用同步移交 SynchronousQueue。
   */
  private static ExecutorService cachedThreadPool =Executors.newCachedThreadPool();

  /**
   * 给定的延迟之后运行任务，或者定期执行任务的线程池。
   */
  private static ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);


  public static void main(String[] args) throws ExecutionException, InterruptedException {
    /**
     *  例子1：没有返回结果的异步任务
     */
    THREAD_POOL.submit(new Runnable() {
      @Override
      public void run() {
        System.out.println("没有返回结果的异步任务！！!");
      }
    });

    /**
     *  例子 2： 有返回结果的异步任务。
     */
    Future<List<String>> future = THREAD_POOL.submit(new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        List<String> result = new ArrayList<>();
        result.add("JoonWhee");
        return result;
      }
    });
    List<String> rsl = future.get();// 获取返回结果
    System.out.println("有返回结果的异步任务："+rsl);



    /**
     *  例子3：
     *  有延迟的，周期性执行异步任务。
     *  本例子为：延迟 1秒，每 2秒 执行一次。
     */
     scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
        @Override
        public void run() {
          System.out.println("this is " + Thread.currentThread().getName());
        }
     }, 1, 2, TimeUnit.SECONDS);

    /**
     *  例子4：FutureTask 的使用
     */
    Callable<String> task = new Callable<String>() {
      @Override
      public String call() throws Exception {
        return "Why?";
      }
    };
    FutureTask<String> futureTo = new FutureTask<String>(task);
    THREAD_POOL.submit(futureTo);
    System.out.println(futureTo.get());







    }





}


