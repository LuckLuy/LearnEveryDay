package map;

import org.apache.commons.collections.MapUtils;

import java.util.HashMap;
import java.util.Objects;

/**
 * @Description：
 * @author 鲁先生
 * @date 2022/8/2 15:50
 */
public class GetString {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("Tom", "1");
    map.put("Jarry", "2");
    map.put("Hello", "3");
    map.put("Soall", "4");
    // 根据key获取map的value
    String tom = MapUtils.getString(map, "Tom");
    System.out.println(tom);

    String s = Objects.toString(map.get("hello"), "haha");
    System.out.println(s);

  }
}
