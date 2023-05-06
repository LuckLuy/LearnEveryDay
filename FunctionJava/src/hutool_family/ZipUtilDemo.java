package hutool_family;

import cn.hutool.core.util.ZipUtil;

import java.io.File;

/**
 * @author 鲁先生
 * @Description：压缩工具
 * @date 2021/12/16 11:05
 */
public class ZipUtilDemo {
  public static void main(String[] args) {
    ZipUtil.zip("hutool", "hutool.zip");
    File unzip = ZipUtil.unzip("hutool.zip", "hutoolzip");
  }
}
