package string;

import org.apache.commons.lang3.StringUtils;

/**
 * @author ³����
 * @Description����ľ����
 * @date 2022/3/22 17:02
 */
public class StringUtils_defaultIfEmpty {
  public static void main(String[] args) {

    String params = "";
    // ������Ĭ�ϲ���
    String saomu = StringUtils.defaultIfEmpty(params, "saomu");
    System.out.println(saomu);

  }
}
