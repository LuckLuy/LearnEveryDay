package suanfa_fuxi;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pachong {

/**
 * 获得url对应的网页内容
 * @param urlStr
 * @return
 */
public static String getURLContent(String urlStr,String charset) {
	
	//定义一个结果变量
	StringBuilder sb=new StringBuilder();
	
	try { 
		//URL url=new URL("http://www.163.com");
		URL url=new URL(urlStr);
		
		//流   获取流   
		/**
		 * Charset.forName(charset) 获取网页的字符集设置。
		 */
		BufferedReader reader = new BufferedReader( 
				new InputStreamReader(url.openStream(),Charset.forName(charset) ) 
				);
		//字符串内容
		String temp="";
		for((temp=reader.readLine())!=null) {
			sb.append(temp);
		}	
				
	} catch (Exception e) {

	}
	return sb.toString();
	
}
/**
 * 封装list
 * @param destStr
 * @param regexStr
 * @return
 */
public static List<String> getMatherSubstrs(String destStr,String regexStr){
	//设置正则
	//Pattern p= Pattern.compile("<a[\\s\\S]+?</a>");//取得的超链接的整个内容
	//	Pattern p= Pattern.compile("href=\"(.+?)\" ");

	Pattern p= Pattern.compile(regexStr);
	//取出正则中的数据
	Matcher m=p.matcher(destStr);
	List<String> result=new ArrayList<String>();
	//循环数据
	for(m.find()) {
		result.add(m.group(1));
	}

	return result;
	
}
public static void main(String[] args) {
	String destStr=getURLContent("https://wenku.baidu.com/view/ee6bd169250c844769eae009581b6bd97f19bc98.html","gbk");
	
	//List<String> result=getMatherSubstrs(destStr, "href=\"(.+?)\" ");
	//设置正则方式  ：参考正则的设置。
	List<String> result=getMatherSubstrs(destStr, "href=\"([\\w\\s./:]+?)\" ");
	for (String temp : result) {
		System.out.println(temp);
	}



} 
}
