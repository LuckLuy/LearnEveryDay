package md5;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.*;
import java.util.function.BiConsumer;

/**
 * @author ³����
 * @Description�� Map תJSON ��ת String ���� MD5 ���ܣ��� LinkedHashMap ��֤˳��
 * @date 2021/6/18 11:09
 */
public class MD5Demo {

  public static void main(String[] args) throws Exception {
   // System.out.println(getMD5("aksdhkah123123AS")); //3be7d1d2071018fff61412e8b039302f
    //String ss ="3be7d1d2071018fff61412e8b039302f";
   // System.out.println(ss.length());
   // System.out.println(getMD5("aksdhkah123123AS")); //3be7d1d2071018fff61412e8b039302f

    System.out.println("map ���� ...");
    // LinkedHashMap �ظ����ݻ��ɾ��
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
    //4.Stringתmap
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
      // ����һ��MD5���ܼ���ժҪ
      MessageDigest md = MessageDigest.getInstance("MD5");

      // ����md5����
      md.update(str.getBytes());

      // digest()���ȷ������md5 hashֵ������ֵΪ8Ϊ�ַ�������Ϊmd5 hashֵ��16λ��hexֵ��ʵ���Ͼ���8λ���ַ�
      // BigInteger������8λ���ַ���ת����16λhexֵ�����ַ�������ʾ���õ��ַ�����ʽ��hashֵ
      return new BigInteger(1, md.digest()).toString(16);
    } catch (Exception e) {
      throw new Exception("MD5���ܳ��ִ���");
    }

  }
}
