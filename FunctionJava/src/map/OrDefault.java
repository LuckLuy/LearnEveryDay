package map;

import java.util.HashMap;

/**
 * @Description����֤map�е�key �Ƿ����
 * @author ³����
 * @date 2022/4/11 14:03
 */
public class OrDefault {
  public static void main(String[] args) {
    // ����һ�� HashMap
    HashMap<Integer, String> sites = new HashMap<>();
    // �� HashMap ���һЩԪ��
    sites.put(1, "Google");
    sites.put(2, "Runoob");
    sites.put(3, "Taobao");
    System.out.println("sites HashMap: " + sites);

    // key ��ӳ������� HashMap ��
    // Not Found - ��� HashMap ��û�и� key���򷵻�Ĭ��ֵ
    String value1 = sites.getOrDefault(1, "Not Found");
    System.out.println("Value for key 1:  " + value1);

    // key ��ӳ�䲻������ HashMap ��
    // Not Found - ��� HashMap ��û�и� key���򷵻�Ĭ��ֵ
    String value2 = sites.getOrDefault(4, "Not Found");
    System.out.println("Value for key 4: " + value2);
  }
}
