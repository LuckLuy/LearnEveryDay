package enums;

import lombok.Getter;

/**
 * @Description：
 * @author 鲁先生
 * @date 2022/10/25 10:32
 */
@Getter
public enum ChannelType {

  JAVA("01","java"),
  ORACLE("02","oracle");

  final String key;
  final String name;

  ChannelType(String key, String name) {
    this.key = key;
    this.name = name;
  }
}
