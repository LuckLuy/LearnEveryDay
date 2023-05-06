package comm;

import cn.hutool.core.date.DateUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * @Description：追加时间的后缀
 * @author 鲁先生
 * @date 2022/6/20 15:14
 */
public class StrToDate {

  /**
   * @description ：  追加起始时间的后缀 为 00：00：00
   * @author ：鲁先生
   * @date 2022/6/20 15:18
   */
  public static Date StartTimeToFomatDate(Date startDate) {
    if (null == startDate) {
      return null;
    }
    Calendar c = Calendar.getInstance();
    c.setTime(startDate);
    c.set(Calendar.HOUR_OF_DAY, 0);
    c.set(Calendar.MINUTE, 0);
    c.set(Calendar.SECOND, 0);
    return c.getTime();
  }

  /**
   * 将日期转化为对应日期的结束时刻的后缀 为 23：59：59
   * @param endDate
   * @return
   */
  public static Date EndTimeToFomatDate(Date endDate) {
    if (null == endDate) {
      return null;
    }
    Calendar c = Calendar.getInstance();
    c.setTime(endDate);
    c.set(Calendar.HOUR_OF_DAY, 23);
    c.set(Calendar.MINUTE, 59);
    c.set(Calendar.SECOND, 59);
    return c.getTime();
  }


  public static String StartTimeToStr(Date startDate) {
    if (null == startDate) {
      return null;
    }
    Calendar c = Calendar.getInstance();
    c.setTime(startDate);
    c.set(Calendar.HOUR_OF_DAY, 0);
    c.set(Calendar.MINUTE, 0);
    c.set(Calendar.SECOND, 0);
    return DateUtil.formatDateTime(c.getTime());
  }


  public static String EndTimeToStr(Date endDate) {
    if (null == endDate) {
      return null;
    }
    Calendar c = Calendar.getInstance();
    c.setTime(endDate);
    c.set(Calendar.HOUR_OF_DAY, 23);
    c.set(Calendar.MINUTE, 59);
    c.set(Calendar.SECOND, 59);
    return DateUtil.formatDateTime(c.getTime());
  }


  /**
   * @description ：  追加起始时间的后缀 为 00：00：00  返回string
   * @author ：鲁先生
   * @date 2022/6/20 15:18
   */
  public static String startTimeAddSuffix(String startDate) {
    if (null == startDate) {
      return null;
    }
    return startDate + " 00:00:00";
  }

  /**
   * 将日期转化为对应日期的结束时刻的后缀 为 23：59：59  返回string
   * @param endDate
   * @return
   */
  public static String EndTimeAddSuffix(String endDate) {
    if (null == endDate) {
      return null;
    }
    return endDate + " 23:59:59";
  }

  public static Date strToDate(String startDate) {
    if (null == startDate) {
      return null;
    }
    return  DateUtil.parse(startDate + " 00:00:00");
  }


  public static Date endToDate(String endDate) {
    if (null == endDate) {
      return null;
    }
    return  DateUtil.parse(endDate + " 23:59:59");
  }

}
