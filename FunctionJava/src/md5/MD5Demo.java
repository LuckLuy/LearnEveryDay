package md5;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.*;
import java.util.function.BiConsumer;

/**
 * @author 鲁先生
 * @Description： Map 转JSON 再转 String 进行 MD5 加密，用 LinkedHashMap 保证顺序。
 * @date 2021/6/18 11:09
 */
public class MD5Demo {

  public static void main(String[] args) throws Exception {
   // System.out.println(getMD5("aksdhkah123123AS")); //3be7d1d2071018fff61412e8b039302f
    //String ss ="3be7d1d2071018fff61412e8b039302f";
   // System.out.println(ss.length());
   // System.out.println(getMD5("aksdhkah123123AS")); //3be7d1d2071018fff61412e8b039302f

    System.out.println("map 测试 ...");
    // LinkedHashMap 重复数据会会删掉
    Map<String, String> map = new LinkedHashMap();
    map.put("223AAA", "1");
    map.put("323AAA", "1");
    map.put("121BBB", "2");
    map.put("A21BBB", "2");
    map.put("333CCC", "3");
    System.out.println(map);
    JSONObject JSONObj = JSONObject.parseObject(JSON.toJSONString(map));
    String jsonString3 = JSONObj.toJSONString();

    //61c99a062f77fa7904dae584950cdcf6
    System.out.println(getMD5(jsonString3));
    //4.String转map
    Map stringToMap = JSONObject.parseObject(jsonString3);
    Map<String, String> newMap = new LinkedHashMap<>();
    stringToMap.forEach(new BiConsumer() {
      @Override
      public void accept(Object o, Object o2) {
        newMap.putAll(map);
      }
    });
    System.out.println(newMap);
    JSONObject JSONObj1 = JSONObject.parseObject(JSON.toJSONString(newMap));
    String mapMd5 = JSONObj1.toJSONString();
    System.out.println(getMD5(mapMd5));


  }

  public static String getMD5(String str) throws Exception {

    try {
      // 生成一个MD5加密计算摘要
      MessageDigest md = MessageDigest.getInstance("MD5");

      // 计算md5函数
      md.update(str.getBytes());

      // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
      // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
      return new BigInteger(1, md.digest()).toString(16);
    } catch (Exception e) {
      throw new Exception("MD5加密出现错误");
    }

  }
}
