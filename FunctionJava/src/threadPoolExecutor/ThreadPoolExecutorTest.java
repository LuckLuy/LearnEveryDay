package threadPoolExecutor;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 *  �̳߳صĻ���ʹ��
 */
public class ThreadPoolExecutorTest {


  /**
   *  ����һ���̳߳أ�������Σ���
   *  �����߳���Ϊ 5 ��corePoolSize��
   *  ����߳���Ϊ 10 (maximumPoolSize)
   *  ���ʱ��Ϊ 60����(keepAliveTime)
   *  ��������ΪLinkedBlockingQueue (workQueue)
   *  �̹߳���ΪĬ�ϵ�DefaultThreadFactory (threadFactory)
   *  ���Ͳ��ԣ��ܾ����ԣ�ΪAbortPolicy: �׳��쳣(handler)
   */
  private static ExecutorService THREAD_POOL = new ThreadPoolExecutor(5,10,60, TimeUnit.MINUTES,
      new LinkedBlockingDeque<Runnable>(), Executors.defaultThreadFactory(),
      new ThreadPoolExecutor.AbortPolicy()
      );


  /**
   * ֻ��һ���̵߳��̳߳أ� û�г�ʱʱ�䣬��������ʹ���޽�� LinkedBlockingQueue
   */
  private  static ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();


  /**
   *  �й̶����̳߳� (�� corePoolSize = maximumPoolSize) û�г�ʱʱ��
   *  ��������ʹ���޽��LinkedBlockingQueue
   */
  private static ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);


  /**
   *  ��С���޵��̳߳� �����߳���Ϊ0 ������߳���Ϊ Intege.Max_value,���ʱ��Ϊ 60 �룬���̳߳ؿ���������չ��
   *  ���ҵ����󽵵�ʱ���Զ���������������ʹ��ͬ���ƽ� SynchronousQueue��
   */
  private static ExecutorService cachedThreadPool =Executors.newCachedThreadPool();

  /**
   * �������ӳ�֮���������񣬻��߶���ִ��������̳߳ء�
   */
  private static ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);


  public static void main(String[] args) throws ExecutionException, InterruptedException {
    /**
     *  ����1��û�з��ؽ�����첽����
     */
    THREAD_POOL.submit(new Runnable() {
      @Override
      public void run() {
        System.out.println("û�з��ؽ�����첽���񣡣�!");
      }
    });

    /**
     *  ���� 2�� �з��ؽ�����첽����
     */
    Future<List<String>> future = THREAD_POOL.submit(new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        List<String> result = new ArrayList<>();
        result.add("JoonWhee");
        return result;
      }
    });
    List<String> rsl = future.get();// ��ȡ���ؽ��
    System.out.println("�з��ؽ�����첽����"+rsl);



    /**
     *  ����3��
     *  ���ӳٵģ�������ִ���첽����
     *  ������Ϊ���ӳ� 1�룬ÿ 2�� ִ��һ�Ρ�
     */
     scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
        @Override
        public void run() {
          System.out.println("this is " + Thread.currentThread().getName());
        }
     }, 1, 2, TimeUnit.SECONDS);

    /**
     *  ����4��FutureTask ��ʹ��
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


