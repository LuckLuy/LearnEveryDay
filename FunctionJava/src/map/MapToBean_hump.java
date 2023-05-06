package map;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.extra.cglib.CglibUtil;
import testBO.TBO;
import testBO.TTBO;

import java.util.Map;

/**
 * @Description��
 * @author ³����
 * @date 2022/6/8 16:41
 */
public class MapToBean_hump {

  public static void main(String[] args) {

    TBO tbo = new TBO();
    tbo.setId(11);
    tbo.setUserAge(18);
    tbo.setUserName("����");
    tbo.setUserCID(123123);
    // bean תmap �շ�ת�»���
    Map<String, Object> map= BeanUtil.beanToMap(tbo,true,false);
    System.out.println(map);


    // map ת bean  �»��� ת�շ� �����ִ�Сд
    TBO person = BeanUtil.fillBeanWithMapIgnoreCase(map, new TBO(), false);
    System.out.println(person);



  }
}
