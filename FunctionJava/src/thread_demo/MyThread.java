package thread_demo;

public class MyThread extends Thread {

  public  MyThread(){};

  public  MyThread(String name ){
    super(name);
    /*���߳����ƴ��ݸ����࣬�ø��ࣨThread) �����߳���һ�����֣�
     */
  }

  @Override
  public void run() {
    System.out.println(getName());
  }
}
