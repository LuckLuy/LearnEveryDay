package string;

import java.util.HashMap;
import java.util.Map;

/**
 *  �����ַ����г��ֵ�λ��
 */
public class IndexOf {
  public static void main(String[] args) {

    String str = "sadadsdsfsfsf asd inniin java";
    //���Ҹ����ַ�����һ�γ��ֵ�λ��
    int index =str.indexOf("s");
    System.out.println(index);
    // ��ָ��λ�ÿ�ʼ���ҵ�һ�γ��ָ�����λ��
    int indexStart= str.indexOf("sf",3);
    System.out.println(indexStart);
    // �������һ�γ��ָ����ַ���λ��
    int indexEnd = str.lastIndexOf("d");
    System.out.println(indexEnd);

    //  ��ȡ sadasda
    String ss = "ou=sadasda,cn=131313131";
    String[] split = ss.split(",");
    Map<String,String> map = new HashMap<>();
    for( String name : split){
      map.put(name.substring(0,name.indexOf("=")),name.substring(name.indexOf("=")+1,name.length()));
    }
    System.out.println(map.get("ou"));



  }
}
