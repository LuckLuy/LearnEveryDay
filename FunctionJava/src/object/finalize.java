package object;

/**
 * java允许在类中定义一个名为finalize()的方法。
 *
 * 它的工作原理是：在垃圾回收器准备好释放对象占用的存储空间前，
 * 将首先调用其finalize()方法，并且在下一次垃圾回收动作发生时，
 * 才会真正回收对象占用的内存。
 */
public class finalize {
  /**
   * finalize()方法具有如下4个特点：
   *
   * 永远不要主动调用某个对象的finalize()方法，该方法由垃圾回收机制自己调用；
   * finalize()何时被调用，是否被调用具有不确定性；
   * 当JVM执行可恢复对象的finalize()可能会将此对象重新变为可达状态；
   * 当JVM执行finalize()方法时出现异常，垃圾回收机制不会报告异常，程序继续执行。
   */

  private static finalize fl=null;
  public void info(){
    System.out.println("测试资源清理的finalize 方法");
  }
  public static void main(String[] args){
    //创建finalize 对象立即进入可恢复状态
    new finalize();
    //通知系统进行垃圾回收
    System.gc();
    //强制回收机制调用可恢复对象的finalize 方法
    System.runFinalization();
    fl.info();
  }



  @Override
  public void finalize(){
    //让fl引用到试图回收的可恢复对象，即可恢复对象重新变成可达
    fl=this;
    throw new RuntimeException("出异常了，你管不管啊");

  }











}
