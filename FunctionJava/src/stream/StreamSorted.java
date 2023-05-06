package stream;

import cn.hutool.db.PageResult;
import entity.PersonBO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author 鲁先生
 * @Description：排序
 * @date 2021/6/2 15:12
 */
public class StreamSorted {
  public static void main(String[] args) {
    List<PersonBO> personBOList = Arrays.asList(
        new PersonBO("1", "小三", 18),
        new PersonBO("2", "小舞", 17),
        new PersonBO("3", "小胖", 18),
        new PersonBO("4", "小雅", 16),
        new PersonBO("5", "小六", 16),
        new PersonBO("5", "小六", 16),
        new PersonBO("5", "小六", 16)
    );

    //sorted 是排序，因为也需要知道其他元素的值，
    // 然后才能去重，所以这个也是有状态操作，如下：
    //IntStream.of(2,3,4,6,7,8,3,5,1,9).distinct().sorted().forEach(System.out::println);


    Stream<PersonBO> stream = personBOList.stream();
    // 遍历所有的对象
    //stream.forEach(System.out::println);
    System.out.println("过滤大于16 的数据 ");

    // 过滤大于16 的数据
    //stream.filter(e -> e.getAge() > 16).forEach(System.out::println);
    System.out.println("过滤大于16 的数据 取出2个");
    // 过滤大于16 的数据 取出2个
    stream.filter(e -> e.getAge() > 16).limit(2).forEach(System.out::println);



    // 去重
    //stream.distinct().forEach(System.out::println);

  }

}
