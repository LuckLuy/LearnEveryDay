package jsonArrayToList;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.List;

/**
 * @author 鲁先生
 * @Description：jsonArray 转换成list对象
 * @date 2022/2/16 10:16
 */
public class JsonArrayToList {
  public static void main(String[] args) {


    // 1 jsonArray 转string
    JSONArrayToString();

    // 2. jsonArray 转list 对象
    String str= "[{\"id\":\"22\",\"value\":\"summer\"},{\"id\":\"20\",\"value\":\"sss\"}]";
    List<ListBO> listBOList = JSONArray.parseArray(str,ListBO.class);
    System.out.println(listBOList);

  }

  private static void JSONArrayToString() {
    String str333 = "[{\"id\":\"24\",\"value\":\"summer\"},{\"id\":\"22\",\"value\":\"sss\"}]";

    JSONArray jsonArray = JSONArray.parseArray(str333);
    System.out.println("jsonObject333=>" + jsonArray);
    StringBuilder sb = new StringBuilder();
    jsonArray.stream().forEach(jsonobejct -> arrayIdToString((JSONObject) jsonobejct, sb));

    System.out.println(sb.toString());
  }

  private static StringBuilder arrayIdToString(JSONObject jsonobejct,
                                               StringBuilder sBuffer) {
    return sBuffer.append(jsonobejct.getString("value")).append(",");

  }

}
