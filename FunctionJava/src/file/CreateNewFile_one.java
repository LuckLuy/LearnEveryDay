package file;

import java.io.File;
import java.io.IOException;

public class CreateNewFile_one {
  public static void main(String[] args) throws IOException {
    File file = new File("one.txt");
    // 不存在 创建
    if(!file.exists()){
      file.createNewFile();
      System.out.println("已创建");
    }else{
      System.out.println("已存在！");
    }

    // 父目录绝对路径 + 子目录名称
    //file.getAbsoluteFile().getParent()
    File two = new File(file.getAbsoluteFile().getParent(),"two111.txt");
    two.createNewFile();
    System.out.println(two.getAbsoluteFile());



    //父目录File对象 + 子目录名称
    File tree = new File("./","tree.txt");
    tree.createNewFile();

    System.out.println(tree.toString());






  }
}
