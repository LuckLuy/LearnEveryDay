package hutool_family;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Dict;

/**
 * @author ³����
 * @Description��
 * @date 2021/12/16 11:11
 */
public class Dict_HashMap {
  public static void main(String[] args) {
    Dict dict = Dict.create()
        .set("age", 18)
        .set("name", "��Ĭ����")
        .set("birthday", DateTime.now());

    int age = dict.getInt("age");
    String name = dict.getStr("name");
    System.out.println(age);
    System.out.println(name);


    // ��ӡ�ַ���
    Console.log("��Ĭ������һö��Ȥ�ĳ���Ա");

    // ��ӡ�ַ���ģ��
    Console.log("������{}���Ŷ�",13);

    int [] ints = {1,2,3,4};
    // ��ӡ����
    Console.log(ints);

  }
}
