package map;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.extra.cglib.CglibUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 鲁先生
 * @Description：map 转对象
 * @date 2022/1/18 16:41
 */
public class MapToBean {


  public static void main(String[] args) {
    MapObject objectBean = new MapObject();
    Map<String,String> map = new HashMap<>();
    map.put("one","one_test");
    map.put("two","two_test");
    map.put("tree","tree_test");

    CglibUtil.copy(map,objectBean);
    System.out.println("objectBean 1 : "+objectBean);
    BeanUtil.copyProperties(map,objectBean);
    System.out.println("objectBean 2 : "+objectBean);







  }

}
