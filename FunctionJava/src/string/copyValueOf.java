package string;

public class copyValueOf {
  public static void main(String[] args) {
    char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
    String str ="";
    // ����char �����е�Ԫ��
    str = str.copyValueOf(myStr1,0,myStr1.length);
    System.out.println(myStr1.length);


    System.out.println(str);



    String  arry = String.valueOf(new char[]{'H', 'e', 'l', 'l', 'o'});
    System.out.println(arry);

  }
}
