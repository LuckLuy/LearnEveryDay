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
public class Hump_Param {

  @JSONField(name = "userId")
  private int USER_ID;

  @JSONField(name = "userName")
  private String USER_NAME;

  @JSONField(name = "userAge")
  private String USER_AGE;

  @JSONField(name = "userAdree")
  private String USER_ADREE;


}
