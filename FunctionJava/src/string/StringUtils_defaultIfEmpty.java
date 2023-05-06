package string;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 鲁先生
 * @Description：三木运算
 * @date 2022/3/22 17:02
 */
public class StringUtils_defaultIfEmpty {
  public static void main(String[] args) {

    String params = "";
    // 后面是默认参数
    String saomu = StringUtils.defaultIfEmpty(params, "saomu");
    System.out.println(saomu);

  }
}
