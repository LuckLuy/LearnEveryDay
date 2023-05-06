package hutool_family;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.BetweenFormatter;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;

import java.util.Date;

/**
 * @author 鲁先生
 * @Description：
 * @date 2021/12/15 17:15
 */
public class HutoolFuction {


  public static void main(String[] args) {
    //Hutool 的 Convert 类可以简化这个操作，可以将任意可能的类型转换为指定类型，
    // 同时第二个参数 defaultValue 可用于在转换失败时返回一个默认值。
    String param = "10";
    int paramInt = Convert.toInt(param);
    int paramIntDefault = Convert.toInt(param, 0);
    System.out.println(paramInt + " : " + paramIntDefault);

    // 把字符串转换成日期： //"2020年09月29日";  "20200929"
    String dateStr = "20200929";
    Date date = Convert.toDate(dateStr);
    System.out.println(date);

    // 把字符串转成 Unicode：
    String unicodeStr = "沉默王二";
    String unicode = Convert.strToUnicode(unicodeStr);
    System.out.println(unicode);

    //获取当前日期：
    Date cuerrDate = DateUtil.date();
    System.out.println(cuerrDate);

    //字符串转日期：
    String dateStr1 = "2020-09-29";
    Date date1 = DateUtil.parse(dateStr1);
    System.out.println(date1);
    System.out.println(date1.toString());

    //格式化时间差：
    String dateStr2 = "2020-09-29 22:33:23";
    Date date2 = DateUtil.parse(dateStr2);

    String dateStr3 = "2020-10-01 23:34:27";
    Date date3 = DateUtil.parse(dateStr3);

    long betweenDay = DateUtil.between(date2, date3, DateUnit.MS);
    System.out.println(betweenDay);


    // 输出：2天1小时1分4秒
   // String formatBetween = DateUtil.formatBetween(betweenDay, BetweenFormatter.Level.SECOND);

    //System.out.println(formatBetween);

    // 星座和属相：
    // 射手座
    String zodiac = DateUtil.getZodiac(Month.DECEMBER.getValue(), 10);
    System.out.println(zodiac);
    // 蛇
    String chineseZodiac = DateUtil.getChineseZodiac(2011);
    System.out.println(chineseZodiac);

















  }
}
