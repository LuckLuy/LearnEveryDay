package string;

import cn.hutool.core.date.DateUtil;
import comm.StrToDate;

import java.util.Date;

/**
 * @Description����ʱ����Ӻ�׺
 * @author ³����
 * @date 2022/6/20 15:26
 */
public class DateAddSuffix {
  public static void main(String[] args) {
    Date startTime = DateUtil.parse("2022-06-11");
    Date endTime = DateUtil.parse("2022-06-20");


    System.out.println("��ʼʱ�� ��"+StrToDate.StartTimeToFomatDate(startTime));
    System.out.println("����ʱ�� ��"+StrToDate.EndTimeToFomatDate(endTime));

    long start =System.currentTimeMillis();
    System.out.println(StrToDate.StartTimeToStr(startTime));
    long end =System.currentTimeMillis();
    System.out.println("��ʱ��"+ String.valueOf(end-start));

    System.out.println(StrToDate.EndTimeToStr(endTime));
    long startTwo =System.currentTimeMillis();
    System.out.println(StrToDate.startTimeAddSuffix("2022-06-20"));
    long endTwo =System.currentTimeMillis();
    System.out.println("��ʱ Two��"+ String.valueOf(end-start));
    System.out.println(StrToDate.EndTimeAddSuffix("2022-06-20"));


    System.out.println(StrToDate.strToDate("2022-06-01"));
    System.out.println(StrToDate.endToDate("2022-06-01"));
  }
}
