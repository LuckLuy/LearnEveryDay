package object;

/**
 * ����һ��String���͵��ַ���������������ǰ�������Ϣ��ʹ��Ƶ�ʼ��ߣ�
 * һ�㶼�����඼�и��ǣ���������д���ض��Լ����õ���Ϣ��
 * Ĭ�Ϸ��ص��ǵ�ǰ���������+hashCode��16�������֡�
 */
public class toString_Demo {

  static class A{
    public String toString(){
      return "this is A";
    }
  }

  public static  void main(String[] args){
    A obj = new A();
    System.out.println(obj); //toString()���ã�������println������֮����������ʱ���Զ����ã�������ʽ�������

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
