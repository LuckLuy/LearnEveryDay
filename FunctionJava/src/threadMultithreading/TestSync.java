package threadMultithreading;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description�����߳� :ʹ�� volatile �ؼ���
 * @author ³����
 * @date 2022/8/26 14:16
 */
public class TestSync {
  //���干�������ʵ��ͨ�ţ�����Ҫvolatile ���Σ������̲߳��ܼ�ʱ��֪
  static volatile boolean notice = false;

  public static void main(String[] args) {
    /* ���� volatile �ؼ�����ʵ���̼߳��໥ͨ����ʹ�ù����ڴ��˼�롣
    ������˼���Ƕ���߳�ͬʱ����һ����������������������仯��ʱ�� ��
    �߳��ܹ���֪��ִ����Ӧ��ҵ����Ҳ����򵥵�һ��ʵ�ַ�ʽ
     */
    // 1.ʹ�� volatile �ؼ���
    List<String> list = new ArrayList<>();
    //�߳�A
    Thread threadA = new Thread(() -> {
      for (int i = 1; i <= 10; i++) {
        list.add("adc");
        System.out.println("�߳�A���Ԫ�أ���ʱlist ��seze Ϊ�� " + list.size());
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
   // �߳�B
    Thread threadB = new Thread(()->{
      for (true){
        if(notice){
          System.out.println("�߳�B �յ�֪ͨ����ʼִ���Լ���ҵ�� ������");
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
