package map;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.cglib.CglibUtil;
import testBO.TBO;
import testBO.TTBO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description��
 * @author ³����
 * @date 2022/6/7 9:51
 */
public class hump {
  public static void main(String[] args) {
    String str = "321helloWordTestHe123";
    // String Str = "FOC331";
    // System.out.println(xX2x_x(str));
   // System.out.println(StrUtil.toUnderlineCase(str).toUpperCase());
    List<String> list = new ArrayList<>();
    list.add("123");
    list.add("345");
    list.add("678");
    TBO tbo = new TBO();
    tbo.setUserAge(18);
    tbo.setUserName("����");
    tbo.setUserCID(123123);
    tbo.setStringList(list);
    //System.out.println(BeanUtil.beanToMap(tbo,true,false));
    // bean תmap �շ�ת�»���
    Map<String, Object> map= BeanUtil.beanToMap(tbo,true,false);

    System.out.println(map);
    // map תbean
    //TTBO ttbo1  = BeanUtil.mapToBean(map, TTBO.class, false);
    //System.out.println(ttbo1);
    // map תbean
    TTBO ttbo  = BeanUtil.fillBeanWithMap(map, new TTBO(), false);
    System.out.println("map תbean :"+ttbo);
    System.out.println();

    TTBO tbo_new = new TTBO();
    CglibUtil.copy(ttbo, tbo_new);
    System.out.println(tbo_new);

/*
    TBO person = BeanUtil.fillBeanWithMapIgnoreCase(map, new TBO(), false);
    System.out.println(person);*/



  }

}
