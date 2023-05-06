package object;

/**
 * wait()�����ã��õ�ǰ�߳̽���ȴ�״̬��ͬʱ��
 * wait()Ҳ���õ�ǰ�߳��ͷ��������е�������ֱ�������̵߳��ô˶����
 * notify() ������ notifyAll() ����������ǰ�̱߳����Ѳ����롰����״̬����
 *
 *
 * wait(long timeout)�����ã��õ�ǰ�̴߳��ڡ��ȴ�(����)״̬����
 * ��ֱ�������̵߳��ô˶����notify()������ notifyAll() ������
 * ���߳���ָ����ʱ����������ǰ�̱߳����Ѳ����롰����״̬����
 *
 */


/**
 * ����wait()������ǰ�߳̾ͽ���˯��״̬��ֱ�������¼�������
 *
 * ��1�������̵߳����˸ö����notify������
 *
 * ��2�������̵߳����˸ö����notifyAll������
 *
 * ��3�������̵߳�����interrupt�жϸ��̡߳�
 *
 * ��4��ʱ�������ˡ�
 */

 class ThreadA extends  Thread{
  public ThreadA(String name){
    super(name);
  }

  public  void run(){
    synchronized (this){
      try {
        // ��ǰ�߳�����1s��ȷ��������� t1.wait(); ִ��֮����ִ�� notify()
        Thread.sleep(1000);
        System.out.println("111");
      }catch (Exception e){
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName()+"call notify()");
      // ���ѵ�ǰ��wait�߳�
      this.notify();
    }
  }
}

public class wait{
  public static  void main(String[] args) {

    ThreadA threadA = new ThreadA("threadA");

    synchronized (threadA){
      try {
        //�����߳�threadA
        System.out.println(Thread.currentThread().getName()+" start t1");
        threadA.start();
        //���̵߳ȴ�threadA ͨ��notify����
        System.out.println(Thread.currentThread().getName()+" wait()");
        //����threadA �̵߳ȴ������ǵ�ǰִ��wait ���̵߳ȴ�
        threadA.wait();
        System.out.println(Thread.currentThread().getName()+"  continue");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}