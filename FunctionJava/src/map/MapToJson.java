package map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ³����
 * @Description��Map תJson
 * @date 2021/6/18 15:13
 */
public class MapToJson {

  public static void main(String[] args) {
    Map map = new HashMap();
    map.put("AAA", "1");
    map.put("BBB", "2");
    map.put("CCC", "3");
    System.out.println("map=>" + map);

    //1.mapתstring
    String jsonString = JSON.toJSONString(map);
    System.out.println("mapToString=>" + jsonString);

    //2.mapתjsonObject?
    JSONObject JSONObj = JSONObject.parseObject(JSON.toJSONString(map));
    System.out.println("mapToJSON=>" + JSONObj);

    //3.StringתjsonObject
    String jsonString2 = "{\"AAA\":\"1\",\"CCC\":\"3\",\"BBB\":\"2\"}";
    JSONObject parseObject = JSONObject.parseObject(jsonString2);
    System.out.println("StringToJson=>" + parseObject);

    //4.Stringתmap
    Map stringToMap = JSONObject.parseObject(jsonString2);
    System.out.println("StringToMap=>" + stringToMap);

    String str = "{\"age\":\"24\",\"name\":\"summer\"}";
    JSONObject jsonObject = JSONObject.parseObject(str);

    //5.jsonObjectתmap
    Map jsonToMap = JSONObject.parseObject(jsonObject.toJSONString());
    System.out.println("jsonToMap=>" + jsonToMap);

    //6.jsonObjectתString
    String jsonString3 = jsonObject.toJSONString();
    System.out.println("jsonToString=>" + jsonString3);

    String str333 = "[{\"id\":\"24\",\"value\":\"summer\"},{\"id\":\"22\",\"value\":\"sss\"}]";

    JSONArray jsonArray = JSONArray.parseArray(str333);
    System.out.println("jsonObject333=>" + jsonArray);
    StringBuilder sb = new StringBuilder();
    jsonArray.stream().forEach(jsonobejct->arrayIdToString((JSONObject) jsonobejct,sb));

    System.out.println(sb.toString());

  }

  private static StringBuilder arrayIdToString(JSONObject jsonobejct,
                                               StringBuilder sBuffer) {
    return sBuffer.append(jsonobejct.getString("value")).append(",");

  }

  }

