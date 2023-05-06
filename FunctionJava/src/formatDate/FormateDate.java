package formatDate;

import cn.hutool.core.date.DateUtil;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.SimpleFormatter;

/**
 * @author Â³ÏÈÉú
 * @Description£º
 * @date 2021/9/14 15:21
 */
public class FormateDate {
  public static void main(String[] args) throws ParseException {

    String ss = "2021-09-14 14:47:00";
/*    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
    Date date=sd.parse(ss);
    String format = sd.format(date);
    System.out.println(format);
    System.out.println(format.length());
    System.out.println(ss.substring(0,10));
    Calendar cl =new GregorianCalendar();
    System.out.println( sd.format(cl.getTime()));*/

    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    Date date=sd.parse(ss);
    //String format = sd.format(date);
    System.out.println(date);
  }
}
