package date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @Description：
 * @author 鲁先生
 * @date 2022/8/2 14:15
 */
public class after {
  public static void main(String[] args) {
    Date dateTime = DateUtil.parse("2022-08-11 09:50:56", "yyyy-MM-dd HH:mm:ss");
    // 测试此日期是否在指定日期之后。
    boolean flge = DateUtil.date().after(dateTime);
    System.out.println(flge);

    System.out.println(new Date().before(dateTime));

  }
}
