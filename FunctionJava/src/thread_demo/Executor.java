package thread_demo;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 *  �̳߳�
 */
public class Executor {
  public void queryByThread() {

    // ���ݼ��ϴ�С���ɵ������Լ�ָ��
    int listSize = 100;

    // �������߳���
    int runSize = 20;

    // һ���̴߳����������������������100�����ݣ�����20���̣߳���ôÿһ���߳�ִ�е���������5��
    int count = listSize / runSize;//5

    // ����һ���̳߳أ������Ϳ����̵߳�����һ��
    ExecutorService executor = Executors.newFixedThreadPool(runSize);

    // ����sql�����ÿ����ҳ��ѯ����ʼ�ͽ��������±�
    // ѭ�������߳�
    //�˴����þ���Ĳ�ѯ����
    System.out.println("��ʼ��ѯ");

    for (int i = 0; i < runSize; i++) {
      int index = i * count;
      int num = count;
      executor.execute(new Runnable() {
        @Override
        public void run() {

          try {
            //��ѯ�Ľ����α����������᲻����ڸ��ǵ�����
            System.out.println("ÿ�β�ѯ���±�:" + index + ",����:" + num);
           // List<MusicInfo> list = musicInfoMapper.queryByThread(index, num);
            //��������д���ļ��ķ���
          } catch (Exception e) {
            System.out.println("��ѯʧ��" + e);
          }
        }
      });
    }
    // ִ����ر��̳߳�
    executor.shutdown();
  }
}
