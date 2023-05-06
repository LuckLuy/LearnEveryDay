package stringBuffer;

import java.sql.SQLOutput;
import java.util.HashSet;

/**
 * Java字符容量计算：比如StringBuffer sb=new StringBuffer("Good");
 * 输出sb.capacity();，长度为20，因为StringBuffer在为对象分配长度的时候，起始会分配一个字，也就是两个字节长度即（16位），
 * 每增加一个字符，长度就会在16的基础上加 1 。
 */
public class capacityDemo {
  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer("test");
    System.out.println("length "+sb.length());
    System.out.println("buffer "+sb);
    System.out.println("length "+sb.capacity());

    HashSet  set =new HashSet();
    Boolean flag = true;


  }
}
