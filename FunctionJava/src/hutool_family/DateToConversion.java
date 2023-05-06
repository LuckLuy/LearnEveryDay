package hutool_family;

import cn.hutool.core.date.DateUtil;
import cn.hutool.system.SystemUtil;

import java.util.Date;

/**
 * @author 鲁先生
 * @Description：日期格式相互转换
 * @date 2021/7/8 14:30
 */
public class DateToConversion {
  public static void main(String[] args) {

  Date date = DateUtil.date();
    System.out.println(date);
    String dateStr = "2017-03-01";
    Date date2 = DateUtil.parse(dateStr);
    System.out.println(date2);


    //昨天

    System.out.println( DateUtil.yesterday());
//明天
    System.out.println( DateUtil.tomorrow());
//上周
    System.out.println( DateUtil.lastWeek());
//下周
    System.out.println( DateUtil.nextWeek());
//上个月
    System.out.println( DateUtil.lastMonth());
//下个月
    System.out.println( DateUtil.nextMonth());








//年龄
    System.out.println( DateUtil.ageOfNow("1990-01-30"));
//是否闰年
    System.out.println( DateUtil.isLeapYear(2017));

    System.out.println(SystemUtil.getOsInfo());
    System.out.println(SystemUtil.getUserInfo());
    System.out.println(SystemUtil.getHostInfo());
    System.out.println(SystemUtil.getRuntimeInfo());





    System.out.println(DateUtil.format(DateUtil.lastMonth(),"yyyy-MM-dd"));









  }


}
