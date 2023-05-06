package object;

/**
 * 返回一个String类型的字符串，用于描述当前对象的信息，使用频率极高，
 * 一般都有子类都有覆盖，即可以重写返回对自己有用的信息，
 * 默认返回的是当前对象的类名+hashCode的16进制数字。
 */
public class toString_Demo {

  static class A{
    public String toString(){
      return "this is A";
    }
  }

  public static  void main(String[] args){
    A obj = new A();
    System.out.println(obj); //toString()作用：碰到“println（）”之类的输出方法时会自动调用，不用显式打出来。

    String str = "asdasdasd";
    System.out.println(str.toString());

    System.out.println("*****************");
    B obj_b =new B();
    System.out.println(obj_b);
    System.out.println(obj_b.getString());
  }



  public  static  class  B{
    public String getString(){
      return "this is B";
    }
  }

}
