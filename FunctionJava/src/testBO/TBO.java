package testBO;

import cn.hutool.core.annotation.Alias;
import lombok.Data;

import java.util.List;

@Data
public class TBO {
  private int id;
  private int adree;
  @Alias(value = "USER_NAME")
  private String userName;
  @Alias(value = "USER_AGE")
  private int userAge;
  @Alias(value = "USER_CID")
  private int userCID;
  private List<String> stringList;

}
