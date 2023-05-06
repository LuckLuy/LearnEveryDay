package object;

/**
 * java���������ж���һ����Ϊfinalize()�ķ�����
 *
 * ���Ĺ���ԭ���ǣ�������������׼�����ͷŶ���ռ�õĴ洢�ռ�ǰ��
 * �����ȵ�����finalize()��������������һ���������ն�������ʱ��
 * �Ż��������ն���ռ�õ��ڴ档
 */
public class finalize {
  /**
   * finalize()������������4���ص㣺
   *
   * ��Զ��Ҫ��������ĳ�������finalize()�������÷������������ջ����Լ����ã�
   * finalize()��ʱ�����ã��Ƿ񱻵��þ��в�ȷ���ԣ�
   * ��JVMִ�пɻָ������finalize()���ܻὫ�˶������±�Ϊ�ɴ�״̬��
   * ��JVMִ��finalize()����ʱ�����쳣���������ջ��Ʋ��ᱨ���쳣���������ִ�С�
   */

  private static finalize fl=null;
  public void info(){
    System.out.println("������Դ�����finalize ����");
  }
  public static void main(String[] args){
    //����finalize ������������ɻָ�״̬
    new finalize();
    //֪ͨϵͳ������������
    System.gc();
    //ǿ�ƻ��ջ��Ƶ��ÿɻָ������finalize ����
    System.runFinalization();
    fl.info();
  }



  @Override
  public void finalize(){
    //��fl���õ���ͼ���յĿɻָ����󣬼��ɻָ��������±�ɿɴ�
    fl=this;
    throw new RuntimeException("���쳣�ˣ���ܲ��ܰ�");

  }











}
