package stringBuffer;

import java.sql.SQLOutput;
import java.util.HashSet;

/**
 * Java�ַ��������㣺����StringBuffer sb=new StringBuffer("Good");
 * ���sb.capacity();������Ϊ20����ΪStringBuffer��Ϊ������䳤�ȵ�ʱ����ʼ�����һ���֣�Ҳ���������ֽڳ��ȼ���16λ����
 * ÿ����һ���ַ������Ⱦͻ���16�Ļ����ϼ� 1 ��
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
