package testBO;

import cn.hutool.core.annotation.Alias;
import cn.hutool.core.bean.copier.CopyOptions;
import lombok.Data;

import java.util.List;

@Data
public class TTBO {
  private int id;
  private int adree;
  private int str;
  private int strss;
  private String USER_NAME;
  private int USER_AGE;
  private int USER_CID;
  private List<String> stringList;



}
