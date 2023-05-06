package string;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 鲁先生
 * @Description：
 * @date 2021/10/14 11:19
 */
public class SplitArray {
  public static void main(String[] args) {
    String[] arr = {"s1","s2","s3","s4","s5","s6","s7","s8","s9"};
    String strArry ="-|02|03|04|05|06||08|-";
    String[] strings = strArry.split("\\|");
    System.out.println(Arrays.toString(strings));

    Map<String,String> map = new HashMap<>();
    for (int i=0;i<arr.length;i++){
        map.put(arr[i],strings[i]);
    }
    //  map  转对象
    StrArrrys entity = JSON.parseObject(JSON.toJSONString(map), StrArrrys.class);
    System.out.println(entity);

    StrArrrys strArrrys = new StrArrrys();
    System.out.println("123:"+strArrrys.getId());

  }


}
