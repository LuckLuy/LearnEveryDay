package testBO;

import cn.hutool.core.annotation.Alias;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Description£º
 * @author Â³ÏÈÉú
 * @date 2022/6/16 17:57
 */
@Data
public class HumpParamTwo {
  @Alias(value = "USER_ID")
  private int userId;
  @Alias(value = "USER_NAME")
  private String  userName;

  @Alias(value = "USER_AGE")
  private String  userAge;

  @Alias(value = "USER_ADREE")
  private String  userAdree;

}
