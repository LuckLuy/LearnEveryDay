package twenty_three_DesignPatterns.singleton;

/**
 *  单例模式
 *  单例模式是一种常用的软件设计模式，其定义是单例对象的类只能允许一个实例存在。
 *
 * 许多时候整个系统只需要拥有一个的全局对象，这样有利于我们协调系统整体的行为。
 * 比如在某个服务器程序中，该服务器的配置信息存放在一个文件中，这些配置数据由一个单例对象统一读取，
 * 然后服务进程中的其他对象再通过这个单例对象获取这些配置信息。这种方式简化了在复杂环境下的配置管理。
 适用场景：
   1.需要生成唯一序列的环境
   2.需要频繁实例化然后销毁的对象。
   3.创建对象时耗时过多或者耗资源过多，但又经常用到的对象。
   4.方便资源相互通信的环境
 三、单例模式的优缺点
 优点：
   在内存中只有一个对象，节省内存空间；
   避免频繁的创建销毁对象，可以提高性能；
   避免对共享资源的多重占用，简化访问；
   为整个系统提供一个全局访问点。

 缺点：
 不适用于变化频繁的对象；
 滥用单例将带来一些负面问题，如为了节省资源将数据库连接池对象设计为的单例类，
 可能会导致共享连接池对象的程序过多而出现连接池溢出；
 如果实例化的对象长时间不被利用，系统会认为该对象是垃圾而被回收，这可能会导致对象状态的丢失；

 单例模式 又分为： 饿汉式单例 和 懒汉式 单例。
 */
/*
  饿汉式 单例
    优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。

    缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 */
public class Singleton1 {
  // 指向自己实例的私有静态引用，主动创建。
  private static  Singleton1 singleton1 = new Singleton1();

  // 私有的构造方法，
  private  Singleton1(){};

  // 以自己实例返回值的静态的公有方法，静态工厂方法。
  public static Singleton1 getSingleton1(){
    return  singleton1;
  }

}
