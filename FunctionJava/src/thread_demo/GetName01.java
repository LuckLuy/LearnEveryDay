package thread_demo;

public class GetName01 {
  public static void main(String[] args) {

    MyThread mt = new MyThread();
    mt.start();

    new MyThread().start();
    new MyThread().start();


  }
}

