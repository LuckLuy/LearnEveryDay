package threadMultithreading;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description��ʹ�� Object ��� wait()/notify() 
 * @author ³����
 * @date 2022/8/26 15:45
 */
public class TestSyncLock {
  public static void main(String[] args) {
    /**
     * Object ���ṩ���̼߳�ͨ�ŵķ�����wait()��notify()��notifyAll()�������Ƕ��߳�ͨ�ŵĻ�����������ʵ�ַ�ʽ��˼����Ȼ���̼߳�ͨ�š�
     *
     * ע�⣺wait/notify ������� synchronized ʹ�ã�wait �����ͷ�����notify �������ͷ�����
     * wait ��ָ��һ���Ѿ�������ͬ�������߳��ڣ����Լ���ʱ�ó�ͬ�������Ա��������ڵȴ��������߳̿��Եõ�ͬ����������,
     * ֻ�������̵߳�����notify()��notify�����ͷ�����
     * ֻ�Ǹ��ߵ��ù�wait()���߳̿���ȥ���������ľ����ˣ����������ϵõ�������Ϊ�����ڱ���������˻�û�ͷţ�
     * ���� wait() ��һ�������߳̾ͻ��� wait ״̬�����²��뾺����������������������ٴεõ������Ϳ��Լ����������С�
     */
    // ����һ��������
    Object lock = new Object();
    List<String> list = new ArrayList<>();
    // �߳�A
    Thread threadA = new Thread(() -> {
      synchronized (lock) {
        for (int i = 1; i <= 10; i++) {
          list.add("abc");
          System.out.println("��ũ��A���Ԫ�أ���ʱlist��sizeΪ��" + list.size());
          try {
            Thread.sleep(500);
          } catch (Exception e) {
            e.printStackTrace();
          }
          if (list.size() == 5) {
            lock.notify();//����B�߳�
          }
        }
      }
    });
    // �߳�B
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
          System.out.println("�߳�B�յ�֪ͨ����ʼִ���Լ���ҵ�񡣡���");
        }
      }
    });
    //��Ҫ�������߳�B
    threadB.start();
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      e.printStackTrace();
    }
    threadA.start();
  }
}
