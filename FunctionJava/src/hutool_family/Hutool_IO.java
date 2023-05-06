package hutool_family;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

/**
 * @author Â³ÏÈÉú
 * @Description£º
 * @date 2021/12/16 9:57
 */
public class Hutool_IO {
  public static void main(String[] args) {

    BufferedInputStream in = FileUtil.getInputStream("D:\\CodeWorkSpace\\javaProjects\\suanfa\\src\\hutool_family\\origin.txt");
    BufferedOutputStream out = FileUtil.getOutputStream("D:\\CodeWorkSpace\\javaProjects\\suanfa\\src\\hutool_family\\to.txt");
    long copySize = IoUtil.copy(in, out, IoUtil.DEFAULT_BUFFER_SIZE);

    System.out.println(copySize);
  }
}
