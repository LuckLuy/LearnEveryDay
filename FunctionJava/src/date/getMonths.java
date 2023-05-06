package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ³����
 * @Description����ȡǰ6���µ��·�
 * @date 2022/2/23 16:26
 */
public class getMonths {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
      Date now = new Date();
      System.out.println("��ǰ���ڣ�" + DATE_FORMAT.format(now));
      Date newDate = stepMonth(now, -13);
      System.out.println("��ǰʱ��ǰ13���µ����ڣ�" + DATE_FORMAT.format(newDate));

      for(int i=12;i<=24 ;i++){
        String months = getLast12Months(i);
        System.out.println("months " +i +" +��" + months);
      }


    }

    /**
     * �ڸ��������ڼ��ϻ��ȥָ���·ݺ������
     *
     * @param sourceDate ԭʼʱ��
     * @param month      Ҫ�������·ݣ���ǰΪ���������Ϊ����
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
