package suanfa_fuxi;

import java.nio.charset.Charset;

public class zffanzhuan {
public static void main(String[] args) {
	//39�����ʵ���ַ����ķ�ת���滻�� 
	//�𣺷����ܶ࣬�����Լ�дʵ��Ҳ����ʹ��String��StringBuffer/StringBuilder
	//�еķ�������һ���ܳ��������������õݹ�ʵ���ַ�����ת������������ʾ��

	   String s="ABCDEFG";
	   System.out.println(s);
	   System.out.println(reverse(s));

	   /*
	    * ��ע���˷�����Ե���io����
	    */
	   StringBuffer sb =new StringBuffer("abcd");

		System.out.println(sb.reverse().toString());
		System.out.println(sb.reverse().toString());

	   StringBuffer sf=new StringBuffer("asd");
	   System.out.println(sf.reverse().toString());
	   
	   
	   
	
}
/*
 * String�����һ���ַ����� 
	char(i)ȡ��i��λ�õ��ַ���i��0��ʼ��
 */
/*public static String reverse(String originStr) {
    if(originStr == null || originStr.length() <= 1) 
        return originStr;
    return reverse(originStr.substring(1)) + originStr.charAt(0);


}*/
/**
 * �˷�������ַ���
 * @param str
 * @return
 */
public static String reverse(String str) {
	if(str==null ||str.length()<=1) {
		return str;
	}
	return reverse(str.substring(1))+str.charAt(0);
}


}

