package date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @Description��
 * @author ³����
 * @date 2022/8/2 14:15
 */
public class after {
  public static void main(String[] args) {
    Date dateTime = DateUtil.parse("2022-08-11 09:50:56", "yyyy-MM-dd HH:mm:ss");
    // ���Դ������Ƿ���ָ������֮��
    boolean flge = DateUtil.date().after(dateTime);
    System.out.println(flge);

    System.out.println(new Date().before(dateTime));

  }
}
