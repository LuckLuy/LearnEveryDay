package hutool_family;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.extra.cglib.CglibUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description��bean ����
 * @author ³����
 * @date 2022/4/2 11:24
 */
public class Copy {

  public static void main(String[] args) {
   /* UserBO userBO = new UserBO();
    userBO.setUserId("1");
    userBO.setUserName("��");
    userBO.setPhone("110");

    UserDTO userDTO = new UserDTO();
    CglibUtil.copy(userBO, userDTO);
    System.out.println(userDTO.getUserId());*/

    // List<Bean>���Ͽ���
    List<UserBO> list = new ArrayList<>();
    UserBO bo = new UserBO();
    bo.setUserName("����");
    bo.setPhone("111");
    bo.setDrees("112");
    bo.setUserId("000");
    list.add(bo);
    System.out.println("*******");
    System.out.println(JSON.toJSONString(list));
    System.out.println("*******");

    UserBO bt = new UserBO();
    bt.setUserName("С��");
    bt.setPhone("333");
    bt.setDrees("333");
    bt.setUserId("333");
    list.add(bt);
    // List<UserDTO> list2 = CglibUtil.copyList(list, UserDTO::new, (var1, var2, var3) -> var1);
    //Ҳ����������var1,var2,var3���Բ�д
    List<UserDTO> userDTOS = CglibUtil.copyList(list, UserDTO::new);

    System.out.println(JSONUtil.toJsonPrettyStr(userDTOS));

    userDTOS.forEach(it ->{
      it.setJobAdree(it.getDrees());
      it.setJobPress(it.getDrees());
      it.setUserId(IdUtil.simpleUUID());
      System.out.println(it.getUserId().length());
    });
    System.out.println("**********************");
    System.out.println(JSONUtil.toJsonPrettyStr(userDTOS));


  }
}
