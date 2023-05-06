package string;

import javax.xml.transform.Source;

/**
 *  charAt  :返回当前字符串中给定位置处对应的字符。
 *
 */
public class CharAt {
  public static void main(String[] args) {
    String str = "thinking in java";
    char c= str.charAt(3);
    System.out.println(c);


    String line ="上海自来水来自海上";
    for(int i=0;i<line.length()/2;i++){
      char c1=line.charAt(i); // 获取前面的字符
      char c2 =line.charAt(line.length()-1-i);//获取最后面对字符
      if(c1 != c2){
        System.out.println("不是回文！！！");
        return;
      }
    }
    System.out.println("是回文。。。");
  }


  }
