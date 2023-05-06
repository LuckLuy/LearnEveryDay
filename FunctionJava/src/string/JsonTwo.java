package string;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author Â³ÏÈÉú
 * @Description£º
 * @date 2021/10/14 21:04
 */
public class JsonTwo {
  public static void main(String[] args) {
    String data="{'coolness':2.0, 'pilot':[{'firstName':'Buzz','lastName':'Aldrin','str':[{'firstName1':'Buzz1','lastName1':'Aldrin1'}]}]}";

    JSONObject json = JSON.parseObject(data);
    JSONArray pilot = json.getJSONArray("pilot");
    System.out.println(pilot.size());
    //System.out.println(JSON.parseObject(data).getString("pilot"));
    JSONObject json1 = null;
    JSONObject json2 = null;

    for(int i = 0; i < pilot.size(); i++){
       json1 = JSONObject.parseObject(pilot.getString(i));
      System.out.println("json1 "+json1.toString());
    }
    JSONArray jsonArray = json1.getJSONArray("str");
    for(int j = 0; j < jsonArray.size(); j++){
      json2 = JSONObject.parseObject(jsonArray.getString(j));
      System.out.println("jsonArray:"+json2.toString());
    }


  }
}
