package string;

/**
 * String sartsWith(String str)
 * String endsWith(String str)
 * �ж��ַ����Ƿ����Ը����ַ�����ʼ���β��
 * @author soft01
 *
 */
public class StartWith {
  public static void main(String[] args) {
    //java���˼��
    String str="thinking in java";
    // �ж��Ƿ���thin ��ͷ��
    boolean starts =str.startsWith("thin");
    //System.out.println(starts);

    boolean ends =str.endsWith("a");
    //System.out.println(ends);

    // �������е����� ���� ture
    boolean b = str.contentEquals("In");
    System.out.println(b);

  }
}

