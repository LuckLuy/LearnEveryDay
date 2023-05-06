package suanfa_fuxi;

import java.nio.charset.Charset;

public class zffanzhuan {
public static void main(String[] args) {
	//39、如何实现字符串的反转及替换？ 
	//答：方法很多，可以自己写实现也可以使用String或StringBuffer/StringBuilder
	//中的方法。有一道很常见的面试题是用递归实现字符串反转，代码如下所示：

	   String s="ABCDEFG";
	   System.out.println(s);
	   System.out.println(reverse(s));

	   /*
	    * 备注：此方法针对的是io流，
	    */
	   StringBuffer sb =new StringBuffer("abcd");

		System.out.println(sb.reverse().toString());
		System.out.println(sb.reverse().toString());

	   StringBuffer sf=new StringBuffer("asd");
	   System.out.println(sf.reverse().toString());
	   
	   
	   
	
}
/*
 * String类就是一个字符数组 
	char(i)取第i个位置的字符（i从0开始）
 */
/*public static String reverse(String originStr) {
    if(originStr == null || originStr.length() <= 1) 
        return originStr;
    return reverse(originStr.substring(1)) + originStr.charAt(0);


}*/
/**
 * 此方法针对字符串
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

