package file;

import java.io.File;
import java.io.IOException;

public class FIle_Demo {
  public static void main(String[] args) throws IOException {

    //�Ե�ǰ·������һ��file ����
    File file = new File(".");

    //ֱ�ӻ�ȡ�ļ��������һ��
    System.out.println(file.getName());

    // ��ȡ���·���ĸ�·�����ܳ�������������null��
    System.out.println(file.getParent());

    //��ȡ����·��
    System.out.println(file.getAbsoluteFile());

    //��ȡ��һ��·��
    System.out.println(file.getAbsoluteFile().getParent());

    //�ڵ�ʱ·���´���һ����ʱ�ļ�
   File tmpFile = File.createTempFile("aaa",".txt",file);
    System.out.println(tmpFile);

    File tmpFile1 = File.createTempFile("bbb",".txt",file);
    System.out.println(tmpFile1);



    // ָ��jvm �˳�ʱɾ�����ļ�
   // tmpFile.deleteOnExit();






  }



}
