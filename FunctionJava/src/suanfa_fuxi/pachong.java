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
 * ���url��Ӧ����ҳ����
 * @param urlStr
 * @return
 */
public static String getURLContent(String urlStr,String charset) {
	
	//����һ���������
	StringBuilder sb=new StringBuilder();
	
	try { 
		//URL url=new URL("http://www.163.com");
		URL url=new URL(urlStr);
		
		//��   ��ȡ��   
		/**
		 * Charset.forName(charset) ��ȡ��ҳ���ַ������á�
		 */
		BufferedReader reader = new BufferedReader( 
				new InputStreamReader(url.openStream(),Charset.forName(charset) ) 
				);
		//�ַ�������
		String temp="";
		for((temp=reader.readLine())!=null) {
			sb.append(temp);
		}	
				
	} catch (Exception e) {

	}
	return sb.toString();
	
}
/**
 * ��װlist
 * @param destStr
 * @param regexStr
 * @return
 */
public static List<String> getMatherSubstrs(String destStr,String regexStr){
	//��������
	//Pattern p= Pattern.compile("<a[\\s\\S]+?</a>");//ȡ�õĳ����ӵ���������
	//	Pattern p= Pattern.compile("href=\"(.+?)\" ");

	Pattern p= Pattern.compile(regexStr);
	//ȡ�������е�����
	Matcher m=p.matcher(destStr);
	List<String> result=new ArrayList<String>();
	//ѭ������
	for(m.find()) {
		result.add(m.group(1));
	}

	return result;
	
}
public static void main(String[] args) {
	String destStr=getURLContent("https://wenku.baidu.com/view/ee6bd169250c844769eae009581b6bd97f19bc98.html","gbk");
	
	//List<String> result=getMatherSubstrs(destStr, "href=\"(.+?)\" ");
	//��������ʽ  ���ο���������á�
	List<String> result=getMatherSubstrs(destStr, "href=\"([\\w\\s./:]+?)\" ");
	for (String temp : result) {
		System.out.println(temp);
	}



} 
}
