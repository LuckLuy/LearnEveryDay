package stream;

import entity.PersonBO;

import java.util.Arrays;
import java.util.List;

/**
 * @Description：检查是否匹配所有元素
 * @author 鲁先生
 * @date 2022/4/19 11:12
 */
public class AllMatch {
  public static void main(String[] args) {

    List<PersonBO> personBOList = Arrays.asList(
        new PersonBO("1", "小三", 18),
        new PersonBO("2", "小舞", 17),
        new PersonBO("3", "小胖", 18),
        new PersonBO("4", "小雅", 16),
        new PersonBO("5", "小六", 16),
        new PersonBO("5", "小六", 16),
        new PersonBO("5", "小六", 16)
    );
    //
    boolean allMatch = personBOList.stream().allMatch(e -> e.getAge().equals(17));
    System.out.println(allMatch);

  }
}
