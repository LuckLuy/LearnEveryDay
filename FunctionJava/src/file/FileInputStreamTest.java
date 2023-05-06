package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
  public static void main(String[] args) throws IOException {
    //创建字节输入流
    FileInputStream fis = new FileInputStream("FileTest.java");

    //创建一个长度为1024 的“竹筒”
    byte[] bt = new byte[1024];

    //用于保存实际读取的字节数
    int hasRead =0 ;

    //使用循环来重复“取水" 过程
    for ((hasRead = fis.read(bt)) >0){
      //取出”竹筒“ 中的水滴 （字节） ，将字节数组转换成字符串输入
      System.out.println(new String(bt,0,hasRead));
    }

    // 关闭文件输入流，放在finally 块更安全。
    fis.close();

  }
}
