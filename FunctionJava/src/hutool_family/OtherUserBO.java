package hutool_family;

import lombok.Builder;
import lombok.Data;

/**
 * @Description��
 * @author ³����
 * @date 2022/4/2 11:28
 */
@Data
@Builder
public class OtherUserBO {
  private String userId;
  private String userName;
  private String phone;
  private String drees;
  private String age;

}
