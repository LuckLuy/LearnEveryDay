package comm;

import cn.hutool.core.date.DateUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * @Description��׷��ʱ��ĺ�׺
 * @author ³����
 * @date 2022/6/20 15:14
 */
public class StrToDate {

  /**
   * @description ��  ׷����ʼʱ��ĺ�׺ Ϊ 00��00��00
   * @author ��³����
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
   * ������ת��Ϊ��Ӧ���ڵĽ���ʱ�̵ĺ�׺ Ϊ 23��59��59
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
   * @description ��  ׷����ʼʱ��ĺ�׺ Ϊ 00��00��00  ����string
   * @author ��³����
   * @date 2022/6/20 15:18
   */
  public static String startTimeAddSuffix(String startDate) {
    if (null == startDate) {
      return null;
    }
    return startDate + " 00:00:00";
  }

  /**
   * ������ת��Ϊ��Ӧ���ڵĽ���ʱ�̵ĺ�׺ Ϊ 23��59��59  ����string
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
