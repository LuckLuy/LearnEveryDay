package hutool_family;

import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.StrUtil;

/**
 * @author ³����
 * @Description���ַ�������
 * @date 2021/12/16 10:19
 */
public class StrUtils {
  public static void main(String[] args) {
    String template = "{}��һö��Ĭ����Ȥ�ĳ���Ա��ϲ���������µĻ�����΢������{}";
    String str = StrUtil.format(template, "��Ĭ����", "��Ĭ����");
    System.out.println(str);

    String ID_18 = "321083197812162119";
    String ID_15 = "150102880730303";

    boolean valid = IdcardUtil.isValidCard(ID_18);
    boolean valid15 = IdcardUtil.isValidCard(ID_15);
    System.out.println(valid);
    System.out.println(valid15);

    //�ֶ���֤��
    boolean email = Validator.isEmail("��Ĭ����");
    boolean mobile = Validator.isMobile("itwanger.com");
    System.out.println(email);
    System.out.println(mobile);

  }
}
