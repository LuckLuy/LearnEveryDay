package hutool_family;

import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.StrUtil;

/**
 * @author 鲁先生
 * @Description：字符串工具
 * @date 2021/12/16 10:19
 */
public class StrUtils {
  public static void main(String[] args) {
    String template = "{}，一枚沉默但有趣的程序员，喜欢他的文章的话，请微信搜索{}";
    String str = StrUtil.format(template, "沉默王二", "沉默王二");
    System.out.println(str);

    String ID_18 = "321083197812162119";
    String ID_15 = "150102880730303";

    boolean valid = IdcardUtil.isValidCard(ID_18);
    boolean valid15 = IdcardUtil.isValidCard(ID_15);
    System.out.println(valid);
    System.out.println(valid15);

    //字段验证器
    boolean email = Validator.isEmail("沉默王二");
    boolean mobile = Validator.isMobile("itwanger.com");
    System.out.println(email);
    System.out.println(mobile);

  }
}
