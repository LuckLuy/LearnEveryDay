package stringBuffer;

/**
 * @Description£º
 * @author Â³ÏÈÉú
 * @date 2022/5/9 16:55
 */
public class StringbuilderTest {
  public static void main(String[] args) {
    StringBuilder str  = new StringBuilder();
    for(int i=0 ;i<10 ;i++){
      String defaultStr ="Hello";
      str.append(defaultStr+""+i+"¡¢");

    }
    System.out.println();
    System.out.println(str.toString());
  }
}
