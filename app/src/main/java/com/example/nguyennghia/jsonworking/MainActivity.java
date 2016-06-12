package com.example.nguyennghia.jsonworking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String json = "{\"widget\": {\n" +
//                "    \"debug\": \"on\",\n" +
//                "    \"window\": {\n" +
//                "        \"title\": \"Sample Konfabulator Widget\",\n" +
//                "        \"name\": \"main_window\",\n" +
//                "        \"width\": 500,\n" +
//                "        \"height\": 500\n" +
//                "    },\n" +
//                "    \"image\": { \n" +
//                "        \"src\": \"Images/Sun.png\",\n" +
//                "        \"name\": \"sun1\",\n" +
//                "        \"hOffset\": 250,\n" +
//                "        \"vOffset\": 250,\n" +
//                "        \"alignment\": \"center\"\n" +
//                "    },\n" +
//                "    \"text\": {\n" +
//                "        \"data\": \"Click Here\",\n" +
//                "        \"size\": 36,\n" +
//                "        \"style\": \"bold\",\n" +
//                "        \"name\": \"text1\",\n" +
//                "        \"hOffset\": 250,\n" +
//                "        \"vOffset\": 100,\n" +
//                "        \"alignment\": \"center\",\n" +
//                "        \"onMouseUp\": \"sun1.opacity = (sun1.opacity / 100) * 90;\"\n" +
//                "    }\n" +
//                "}}";
//
//
//        try {
//            JSONObject rootObject = new JSONObject(json);
//            JSONObject widgetObject = rootObject.getJSONObject("widget");
//
//            String debug = widgetObject.getString("debug");
//
//            JSONObject windowObject = widgetObject.getJSONObject("window");
//            String window_title = windowObject.getString("title");
//            String window_name = windowObject.getString("name");
//            int window_height = windowObject.getInt("height");
//            int window_width = windowObject.getInt("width");
//
//            JSONObject imageObject = widgetObject.getJSONObject("image");
//            String image_src = imageObject.getString("src");
//            String image_name = imageObject.getString("name");
//            int image_hOffset = imageObject.getInt("hOffset");
//            int image_vOffset = imageObject.getInt("vOffset");
//            String image_alignment = imageObject.getString("alignment");
//
//            JSONObject textObject = widgetObject.getJSONObject("text");
//            String text_data = textObject.getString("data");
//            String text_size = textObject.getString("size");
//            String text_style = textObject.getString("style");
//            String text_name = textObject.getString("name");
//            int text_hOffset = textObject.getInt("hOffset");
//            int text_vOffset = textObject.getInt("vOffset");
//            String text_alignment = textObject.getString("alignment");
//            String text_on_mouseup = textObject.getString("onMouseUp");





//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

//        String json = "{\"employees\":[\n" +
//                "    {\"firstName\":\"John\", \"lastName\":\"Doe\"},\n" +
//                "    {\"firstName\":\"Anna\", \"lastName\":\"Smith\"},\n" +
//                "    {\"firstName\":\"Peter\", \"lastName\":\"Jones\"}\n" +
//                "]}";
//
//        try {
//            JSONObject rootObject = new JSONObject(json);
//            JSONArray employeesArray = rootObject.getJSONArray("employees");
//            for(int i = 0; i < employeesArray.length(); i++){
//                JSONObject employeeObject = employeesArray.getJSONObject(i);
//                String firstName = employeeObject.getString("firstName");
//                String lastName = employeeObject.getString("lastname");
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

        City city = new City("Ho Chi Minh", new LatLng(10.887469,106.790446));
        Log.d("JsonWorking", "onCreate: " + city.toString());

    }
}
