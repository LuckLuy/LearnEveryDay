package hutool_family;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.BetweenFormatter;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;

import java.util.Date;

/**
 * @author ³����
 * @Description��
 * @date 2021/12/15 17:15
 */
public class HutoolFuction {


  public static void main(String[] args) {
    //Hutool �� Convert ����Լ�������������Խ�������ܵ�����ת��Ϊָ�����ͣ�
    // ͬʱ�ڶ������� defaultValue ��������ת��ʧ��ʱ����һ��Ĭ��ֵ��
    String param = "10";
    int paramInt = Convert.toInt(param);
    int paramIntDefault = Convert.toInt(param, 0);
    System.out.println(paramInt + " : " + paramIntDefault);

    // ���ַ���ת�������ڣ� //"2020��09��29��";  "20200929"
    String dateStr = "20200929";
    Date date = Convert.toDate(dateStr);
    System.out.println(date);

    // ���ַ���ת�� Unicode��
    String unicodeStr = "��Ĭ����";
    String unicode = Convert.strToUnicode(unicodeStr);
    System.out.println(unicode);

    //��ȡ��ǰ���ڣ�
    Date cuerrDate = DateUtil.date();
    System.out.println(cuerrDate);

    //�ַ���ת���ڣ�
    String dateStr1 = "2020-09-29";
    Date date1 = DateUtil.parse(dateStr1);
    System.out.println(date1);
    System.out.println(date1.toString());

    //��ʽ��ʱ��
    String dateStr2 = "2020-09-29 22:33:23";
    Date date2 = DateUtil.parse(dateStr2);

    String dateStr3 = "2020-10-01 23:34:27";
    Date date3 = DateUtil.parse(dateStr3);

    long betweenDay = DateUtil.between(date2, date3, DateUnit.MS);
    System.out.println(betweenDay);


    // �����2��1Сʱ1��4��
   // String formatBetween = DateUtil.formatBetween(betweenDay, BetweenFormatter.Level.SECOND);

    //System.out.println(formatBetween);

    // ���������ࣺ
    // ������
    String zodiac = DateUtil.getZodiac(Month.DECEMBER.getValue(), 10);
    System.out.println(zodiac);
    // ��
    String chineseZodiac = DateUtil.getChineseZodiac(2011);
    System.out.println(chineseZodiac);

















  }
}
