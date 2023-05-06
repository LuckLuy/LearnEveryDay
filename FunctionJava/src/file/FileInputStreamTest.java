package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
  public static void main(String[] args) throws IOException {
    //�����ֽ�������
    FileInputStream fis = new FileInputStream("FileTest.java");

    //����һ������Ϊ1024 �ġ���Ͳ��
    byte[] bt = new byte[1024];

    //���ڱ���ʵ�ʶ�ȡ���ֽ���
    int hasRead =0 ;

    //ʹ��ѭ�����ظ���ȡˮ" ����
    for ((hasRead = fis.read(bt)) >0){
      //ȡ������Ͳ�� �е�ˮ�� ���ֽڣ� �����ֽ�����ת�����ַ�������
      System.out.println(new String(bt,0,hasRead));
    }

    // �ر��ļ�������������finally �����ȫ��
    fis.close();

  }
}
