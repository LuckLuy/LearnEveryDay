package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Â³ÏÈÉú
 * @Description£º
 * @date 2021/9/14 17:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestData {
  private static final long serialVersionUID = 1996598449318251880L;
  private String id;
  private String name;
  private String age;
  private String sex;

  public TestData(String s, String ÄÐÐÔ, String s1) {
  }
}
