package file;

import java.io.File;
import java.io.IOException;

public class CreateNewFile_one {
  public static void main(String[] args) throws IOException {
    File file = new File("one.txt");
    // ������ ����
    if(!file.exists()){
      file.createNewFile();
      System.out.println("�Ѵ���");
    }else{
      System.out.println("�Ѵ��ڣ�");
    }

    // ��Ŀ¼����·�� + ��Ŀ¼����
    //file.getAbsoluteFile().getParent()
    File two = new File(file.getAbsoluteFile().getParent(),"two111.txt");
    two.createNewFile();
    System.out.println(two.getAbsoluteFile());



    //��Ŀ¼File���� + ��Ŀ¼����
    File tree = new File("./","tree.txt");
    tree.createNewFile();

    System.out.println(tree.toString());






  }
}
