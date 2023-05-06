package file;

import java.io.File;
import java.io.IOException;

public class FIle_Demo {
  public static void main(String[] args) throws IOException {

    //以当前路径创建一个file 对象。
    File file = new File(".");

    //直接获取文件名，输出一点
    System.out.println(file.getName());

    // 获取相对路径的父路径可能出错，下面代码输出null。
    System.out.println(file.getParent());

    //获取绝对路径
    System.out.println(file.getAbsoluteFile());

    //获取上一级路径
    System.out.println(file.getAbsoluteFile().getParent());

    //在当时路径下创建一个临时文件
   File tmpFile = File.createTempFile("aaa",".txt",file);
    System.out.println(tmpFile);

    File tmpFile1 = File.createTempFile("bbb",".txt",file);
    System.out.println(tmpFile1);



    // 指定jvm 退出时删除该文件
   // tmpFile.deleteOnExit();






  }



}
