package hutool_family;

import cn.hutool.core.date.DateUtil;
import cn.hutool.system.SystemUtil;

import java.util.Date;

/**
 * @author ³����
 * @Description�����ڸ�ʽ�໥ת��
 * @date 2021/7/8 14:30
 */
public class DateToConversion {
  public static void main(String[] args) {

  Date date = DateUtil.date();
    System.out.println(date);
    String dateStr = "2017-03-01";
    Date date2 = DateUtil.parse(dateStr);
    System.out.println(date2);


    //����

    System.out.println( DateUtil.yesterday());
//����
    System.out.println( DateUtil.tomorrow());
//����
    System.out.println( DateUtil.lastWeek());
//����
    System.out.println( DateUtil.nextWeek());
//�ϸ���
    System.out.println( DateUtil.lastMonth());
//�¸���
    System.out.println( DateUtil.nextMonth());








//����
    System.out.println( DateUtil.ageOfNow("1990-01-30"));
//�Ƿ�����
    System.out.println( DateUtil.isLeapYear(2017));

    System.out.println(SystemUtil.getOsInfo());
    System.out.println(SystemUtil.getUserInfo());
    System.out.println(SystemUtil.getHostInfo());
    System.out.println(SystemUtil.getRuntimeInfo());





    System.out.println(DateUtil.format(DateUtil.lastMonth(),"yyyy-MM-dd"));









  }


}
