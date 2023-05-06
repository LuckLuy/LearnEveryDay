package testBO;

import cn.hutool.core.annotation.Alias;
import lombok.Data;

import java.util.List;

@Data
public class ParamBO {
  @Alias(value = "UU_ID")
  private int uuId;
  @Alias(value = "USER_NAME")
  private String  userName;
  @Alias(value = "UU_ID")
  private String  USER_ADREE;
  @Alias(value = "USER_AGE")
  private String  userAge;

}
