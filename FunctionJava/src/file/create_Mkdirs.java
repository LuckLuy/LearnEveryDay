package file;

import hutool_family.UserDTO;

import java.io.File;
import java.io.IOException;

public class create_Mkdirs {
  public static void main(String[] args) throws IOException {
    String fileName = "tree.txt";
    // 返回 "\"
    System.out.println("File.separator:"+ File.separator);

    // 创建文件
    File testFile = new File("D:"+File.separator+"filepath"+File.separator+"test"+File.separator+fileName);
    System.out.println(testFile.getAbsoluteFile());


    //返回此抽象路径名的父目录的抽象路径名

    // 1 返回的是File类型,可以调用exists()等方法
    File fileParent = testFile.getParentFile();
    System.out.println(fileParent);

    // 2 返回的是String类型
    String fileParentPath = testFile.getParent();
    System.out.println(fileParentPath);


    // 创建目录
    //测试此抽象路径名*表示的文件或目录是否存在。
    if(!fileParent.exists()){
      fileParent.mkdirs();
    }
    if(!testFile.exists()){
      // 有路径才能成就文件
      testFile.createNewFile();
      System.out.println(testFile);

    }
    String path= testFile.getPath();
    System.out.println("path="+path);

    // 文件的绝对路径
    String absolutePath = testFile.getAbsolutePath();
    System.out.println("absolutePath= "+absolutePath);

    // 得到文件 / 文件夹的名字
    String getFileName = testFile.getName();
    System.out.println("getFileName = "+getFileName);










  }

}
