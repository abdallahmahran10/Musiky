package com.mahran.musiky.exceptions;

import com.mahran.musiky.CONSTANTS;

import org.json.JSONException;

/**
 * Created by Abdallah on 4/21/2017.
 */

public abstract class ExceptionsFactory {
    public static JSONException getInvalidJsonObjectType(String expectedType, String foundType)
    {
        String errorMessage = "Invalid json object types";
        if(CONSTANTS.DEBUG)
            errorMessage += " :: Expected Type:" + expectedType + ", Found Type: " + foundType;
        return new JSONException(errorMessage);
    }
}
