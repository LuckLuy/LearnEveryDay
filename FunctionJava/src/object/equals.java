package object;

import cn.hutool.core.date.DateUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * Object�е�equals()������ֱ�������ж���������ָ����ڴ�ռ��ǲ���ͬһ�顣
 * �����ͬһ���ڴ��ַ���򷵻�true��
 */
public class equals {
  public static void main(String[] args) {
    String s = DateUtil.offsetDay(DateUtil.date(), -30).toString();
    System.out.println(s);

    String ss="12312";
    String s1 = StringUtils.isNotEmpty(ss) ? ss : "999";
    System.out.println(s1);
    System.out.println("----------");
    if("12312".equals(ss)){
      System.out.println("12312");
    }else{
      System.out.println("true");
    }



  }
}
