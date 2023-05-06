package doWhile;

/**
 * @Description£º
 * @author Â³ÏÈÉú
 * @date 2022/9/19 15:44
 */
public class DoWhileDemo  {
  public static void main(String[] args) {
    String str ="123";
    int i =0;
 /*   do{
      System.out.println(str);
      i+=1;
    }while (i>5);*/



    if(i<5){

      System.out.println(str);
      if(str.contains("123")){
        return;
      }
      try{
        System.out.println("try");
      }catch (Exception e){
         e.printStackTrace();

      }finally {

      }
    }


  }
}
