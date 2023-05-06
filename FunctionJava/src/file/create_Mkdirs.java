package file;

import hutool_family.UserDTO;

import java.io.File;
import java.io.IOException;

public class create_Mkdirs {
  public static void main(String[] args) throws IOException {
    String fileName = "tree.txt";
    // ���� "\"
    System.out.println("File.separator:"+ File.separator);

    // �����ļ�
    File testFile = new File("D:"+File.separator+"filepath"+File.separator+"test"+File.separator+fileName);
    System.out.println(testFile.getAbsoluteFile());


    //���ش˳���·�����ĸ�Ŀ¼�ĳ���·����

    // 1 ���ص���File����,���Ե���exists()�ȷ���
    File fileParent = testFile.getParentFile();
    System.out.println(fileParent);

    // 2 ���ص���String����
    String fileParentPath = testFile.getParent();
    System.out.println(fileParentPath);


    // ����Ŀ¼
    //���Դ˳���·����*��ʾ���ļ���Ŀ¼�Ƿ���ڡ�
    if(!fileParent.exists()){
      fileParent.mkdirs();
    }
    if(!testFile.exists()){
      // ��·�����ܳɾ��ļ�
      testFile.createNewFile();
      System.out.println(testFile);

    }
    String path= testFile.getPath();
    System.out.println("path="+path);

    // �ļ��ľ���·��
    String absolutePath = testFile.getAbsolutePath();
    System.out.println("absolutePath= "+absolutePath);

    // �õ��ļ� / �ļ��е�����
    String getFileName = testFile.getName();
    System.out.println("getFileName = "+getFileName);










  }

}
