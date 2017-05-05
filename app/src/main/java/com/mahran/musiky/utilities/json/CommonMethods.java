package com.mahran.musiky.utilities.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abdallah on 4/21/2017.
 */

public abstract class CommonMethods {

    public static List<Long> toListOfLong(JSONArray jsonArray) throws JSONException {
        List<Long> retArray = new ArrayList<Long>();
        if(jsonArray == null)
            return retArray;
        for(int i =0; i< jsonArray.length(); i++)
          retArray.add(jsonArray.getLong(i));
        return retArray;
    }
}
