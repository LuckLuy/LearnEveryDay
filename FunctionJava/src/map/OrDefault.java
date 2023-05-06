package map;

import java.util.HashMap;

/**
 * @Description：验证map中的key 是否存在
 * @author 鲁先生
 * @date 2022/4/11 14:03
 */
public class OrDefault {
  public static void main(String[] args) {
    // 创建一个 HashMap
    HashMap<Integer, String> sites = new HashMap<>();
    // 往 HashMap 添加一些元素
    sites.put(1, "Google");
    sites.put(2, "Runoob");
    sites.put(3, "Taobao");
    System.out.println("sites HashMap: " + sites);

    // key 的映射存在于 HashMap 中
    // Not Found - 如果 HashMap 中没有该 key，则返回默认值
    String value1 = sites.getOrDefault(1, "Not Found");
    System.out.println("Value for key 1:  " + value1);

    // key 的映射不存在于 HashMap 中
    // Not Found - 如果 HashMap 中没有该 key，则返回默认值
    String value2 = sites.getOrDefault(4, "Not Found");
    System.out.println("Value for key 4: " + value2);
  }
}
