package hutool_family;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Dict;

/**
 * @author 鲁先生
 * @Description：
 * @date 2021/12/16 11:11
 */
public class Dict_HashMap {
  public static void main(String[] args) {
    Dict dict = Dict.create()
        .set("age", 18)
        .set("name", "沉默王二")
        .set("birthday", DateTime.now());

    int age = dict.getInt("age");
    String name = dict.getStr("name");
    System.out.println(age);
    System.out.println(name);


    // 打印字符串
    Console.log("沉默王二，一枚有趣的程序员");

    // 打印字符串模板
    Console.log("洛阳是{}朝古都",13);

    int [] ints = {1,2,3,4};
    // 打印数组
    Console.log(ints);

  }
}
