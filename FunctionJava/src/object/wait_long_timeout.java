package object;

/**
 * �ô���֤��һ��wait(long timeout)�õ�ǰ�̳߳�ʱ�ͱ�����
 */
public class wait_long_timeout {
  public static void main(String[] args) {
    ThreadB tb = new ThreadB("tb");
    synchronized (tb){
      try {
       //�����߳�tb
        System.out.println(Thread.currentThread().getName()+ " strat +tb");
        tb.start();

        //���̵߳ȴ�tb ͨ��notify() ���ѻ�notifyAll() ���ѣ��򳬹�3s��Ȼ��Żᱻ���ѡ�
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

    //������ѭ������������
   /* while (true){
      System.out.println(1);
    }*/
  }
}