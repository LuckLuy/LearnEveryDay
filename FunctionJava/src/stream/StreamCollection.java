package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 集合序列
 */
public class StreamCollection {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    Stream<Integer> list1 = list.stream();
    list1.forEach(System.out::println);
    //list1.forEach(s -> System.out.println(Arrays.toString(list1)));
    Set<String> set = new HashSet<>();
    set.add("a");
    set.add("b");
    set.add("c");
    set.add("d");
    Stream<String> s2 = set.stream();
    System.out.println();
    s2.forEach(System.out::println);








    List<String> strings = Arrays.asList("java","c","c#","js","","vue");
    strings.forEach(System.out::println);

    // 去空
    List<String> collect = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
    collect.forEach(System.out::println);

  }
}

