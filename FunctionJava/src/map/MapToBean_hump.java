package map;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.extra.cglib.CglibUtil;
import testBO.TBO;
import testBO.TTBO;

import java.util.Map;

/**
 * @Description：
 * @author 鲁先生
 * @date 2022/6/8 16:41
 */
public class MapToBean_hump {

  public static void main(String[] args) {

    TBO tbo = new TBO();
    tbo.setId(11);
    tbo.setUserAge(18);
    tbo.setUserName("哈哈");
    tbo.setUserCID(123123);
    // bean 转map 驼峰转下划线
    Map<String, Object> map= BeanUtil.beanToMap(tbo,true,false);
    System.out.println(map);


    // map 转 bean  下划线 转驼峰 不区分大小写
    TBO person = BeanUtil.fillBeanWithMapIgnoreCase(map, new TBO(), false);
    System.out.println(person);



  }
}
