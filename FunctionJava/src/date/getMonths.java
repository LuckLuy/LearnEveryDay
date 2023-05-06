package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 鲁先生
 * @Description：获取前6个月的月份
 * @date 2022/2/23 16:26
 */
public class getMonths {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
      Date now = new Date();
      System.out.println("当前日期：" + DATE_FORMAT.format(now));
      Date newDate = stepMonth(now, -13);
      System.out.println("当前时间前13个月的日期：" + DATE_FORMAT.format(newDate));

      for(int i=12;i<=24 ;i++){
        String months = getLast12Months(i);
        System.out.println("months " +i +" +：" + months);
      }


    }

    /**
     * 在给定的日期加上或减去指定月份后的日期
     *
     * @param sourceDate 原始时间
     * @param month      要调整的月份，向前为负数，向后为正数
     * @return
     */
    public static Date stepMonth(Date sourceDate, int month) {
      Calendar c = Calendar.getInstance();
      c.setTime(sourceDate);
      c.add(Calendar.MONTH, month);

      return c.getTime();
    }

  private static String getLast12Months(int i) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Calendar c = Calendar.getInstance();
    c.setTime(new Date());
    c.add(Calendar.MONTH, -i);
    Date m = c.getTime();
    return sdf.format(m);


  }
}
