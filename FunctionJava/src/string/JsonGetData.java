package string;


import com.alibaba.fastjson.JSONObject;

/**
 * @author Â³ÏÈÉú
 * @Description£º
 * @date 2021/10/14 21:04
 */
public class JsonGetData {
  public static void main(String[] args) {
    String data="{'foo':'bar','coolness':2.0, 'nuber':1,'altitude':39000, 'pilot':{'firstName':'Buzz','lastName':'Aldrin'," +
        "'strArray':[{'s1':'01','s2':'02','s3':'03'}]}," +
        " 'mission':'apollo 11'}";

    JSONObject json = JSONObject.parseObject(data);
    //JSONObject json =  JSONSerializer.toJSON(data);

    double coolness = json.getDouble( "coolness" );
    int  nuber = json.getInteger( "nuber" );
    System.out.println("nuber;" + nuber);
    int altitude = json.getInteger( "altitude" );

    JSONObject pilot = json.getJSONObject("pilot");

    String firstName = pilot.getString("firstName");

    String lastName = pilot.getString("lastName");


    System.out.println( "Coolness: " + coolness );

    System.out.println( "Altitude: " + altitude );

    System.out.println( "Pilot: " + lastName );

    System.out.println("************************");
    String strArray1 = pilot.getString("strArray");
    JSONObject json2 = JSONObject.parseObject(strArray1);
    String s1Name = json2.getString("s1");
    String s2Name = json2.getString("s2");
    String s3Name = json2.getString("s3");

    System.out.println("strArray1 :"+strArray1);
    System.out.println("s1Name :"+s1Name);
    System.out.println("s2Name :"+s2Name);


  }
}
