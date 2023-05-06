package thread_demo;

public class SetName02 {
  public static void main(String[] args) {

    MyThread md = new MyThread();
    md.setName("小钱");
    md.start();

    //new MyThread("小三").start();

  }
}
