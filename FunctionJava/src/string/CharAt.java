package string;

import javax.xml.transform.Source;

/**
 *  charAt  :���ص�ǰ�ַ����и���λ�ô���Ӧ���ַ���
 *
 */
public class CharAt {
  public static void main(String[] args) {
    String str = "thinking in java";
    char c= str.charAt(3);
    System.out.println(c);


    String line ="�Ϻ�����ˮ���Ժ���";
    for(int i=0;i<line.length()/2;i++){
      char c1=line.charAt(i); // ��ȡǰ����ַ�
      char c2 =line.charAt(line.length()-1-i);//��ȡ�������ַ�
      if(c1 != c2){
        System.out.println("���ǻ��ģ�����");
        return;
      }
    }
    System.out.println("�ǻ��ġ�����");
  }


  }
