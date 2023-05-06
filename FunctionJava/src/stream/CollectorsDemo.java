package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author 鲁先生
 * @Description：
 * @date 2021/6/2 14:07
 */
public class CollectorsDemo {
  /**
   * @param
   * @return
   * @description ： Stream API是JDK8新添加的处理集合的关键组件，提供了多种的函数式操作。
   * 引入全新的Stream API。这里的流Stream和I/O流不同，它更像具有Iterable的集合类，但行为和集合类又有所不同。
   * Stream是对集合对象功能的增强，它专注于对集合对象进行各种非常便利、高效的聚合操作，或者打批量数据操作。
   * 只要给出需要对其包含的元素执行什么操作，比如“过滤掉长度大于10的字符串”、“获取每个字符串的首字母”等，Stream会隐式地在内部进行遍历，做出相应的数据转换。
   * Java有关List的stream基本操作
   * Stream使用一种类似用SQL语句从数据库查询数据的直观方式来提供一种对Java集合运算和表达的高阶抽象。
   * 这种风格将要处理的元素集合看作一种流，流在管道中传输，并且可以在管道的节点上进行处理，比如筛选、排序、聚合等。
   * 和以前的collection操作不同，Stream操作还有两个基础的特征：
   * Pipelining:中间操作都会返回流对象本身。这样多个操作可以串联成一个管道，如同流式风格。这样做可以对操作进行优化，比如延迟执行和短路。
   * 内部迭代：以前对集合遍历都是通过Iterator或者ForEach的方式，显示的在集合外部进行迭代，这叫做外部迭代。Stream提供了内部迭代的方式，通过访问者模式实现。
   * 一些方法：
   * stream()；为集合创建串行流。
   * parallelStream(),为集合创建并行流。是流并行处理程序的代替方法。
   * forEach(),Stream提供的新的方法来迭代流中的每个数据。
   * map(),方法用于映射每个元素到对应的结果。map(i -> i*i)集合中的每个元素变为平方
   * filter(),方法用于通过设置的条件过滤出元素，filter(string -> string.isEmpty()) 过滤出空字符串。
   * limit(),方法用于获取指定数量的流。limit(10) 获取10条数据
   * sorted(),方法用于对流进行排序。
   * collect(Collectors.toList()),用于返回列表或字符串，Collectors.joining(",");将集合转换成逗号隔开的字符串
   * @author 鲁先生
   * @date 2022/3/3 16:06
   */
  //Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。
  // Collectors 可用于返回列表或字符串：
  public static void main(String[] args) {

    // 返回列表
    List<String> stringList = Arrays.asList("abc", "as", "", "fff", "sdfg", "qwe");
    List<String> collect = stringList.stream().filter(s -> !s.isEmpty()).collect(java.util.stream.Collectors.toList());
    System.out.println("筛选条件：" + collect);
    // 返回字符串
    String mergedString = stringList.stream().filter(s -> !s.isEmpty()).collect(java.util.stream.Collectors.joining(", "));
    System.out.println("合并字符串：" + mergedString);
  }
}
