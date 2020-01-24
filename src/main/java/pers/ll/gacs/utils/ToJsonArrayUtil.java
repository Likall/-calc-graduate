package pers.ll.gacs.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class ToJsonArrayUtil {
    //fastjson
    public static JSONArray toJsonArray(List<List<String>> strs){
        JSONArray array = new JSONArray();
        for (int i = 1; i < strs.size(); i++) {
            JSONObject object = new JSONObject();
            for (int j = 0; j < strs.get(0).size(); j++) {
                object.put(strs.get(0).get(j),strs.get(i).get(j));
            }
            array.add(object);
        }
        return array;
    }
}
