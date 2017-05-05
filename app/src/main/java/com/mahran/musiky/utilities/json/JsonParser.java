/**
 * 
 */
package com.mahran.musiky.utilities.json;
import com.mahran.musiky.exceptions.ExceptionsFactory;
import com.mahran.musiky.model.AppUser;
import com.mahran.musiky.model.FriendUser;
import com.mahran.musiky.model.User;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Abdallah
 *
 */
public class JsonParser {

    static private void parse(final JSONObject jsonObj, User user) throws JSONException {
        String  jsonType = jsonObj.getString(JsonKeys.JSON_OBJECT_TYPE);
        if(!jsonType.equals(user.getJsonType()))
            throw ExceptionsFactory.getInvalidJsonObjectType(user.getJsonType(), jsonType);
        JSONObject  propsJsonObj = jsonObj.getJSONObject(JsonKeys.USER_PROPERTIES);
        user.setListeningTo(propsJsonObj.getString(JsonKeys.APP_USER_LISTENING_TO));
        user.setMostPlayedSong(propsJsonObj.getString(JsonKeys.APP_USER_MOST_PLAYED_SONG));
        user.setMostPlayedArtist(propsJsonObj.getString(JsonKeys.APP_USER_MOST_PLAYED_ARTIST));
        user.setMostPlayedGenre(propsJsonObj.getString(JsonKeys.APP_USER_MOST_PLAYED_GENRE));
    }

    static public void parse(String jsonString, AppUser appUser) throws JSONException {
        JSONObject jsonObj = new JSONObject(jsonString);
        parse(jsonObj, appUser);
        jsonObj = jsonObj.getJSONObject(JsonKeys.USER_PROPERTIES);
        appUser.setIsAuthorized(jsonObj.getBoolean(JsonKeys.APP_USER_IS_AUTHORIZED));
        appUser.setSimilarTasteIds(CommonMethods.toListOfLong(jsonObj.getJSONArray(JsonKeys.APP_USER_SIMILAR_TASTE_IDS)));
        appUser.setFriendsIds(CommonMethods.toListOfLong(jsonObj.getJSONArray(JsonKeys.APP_USER_FRIENDSIDS)));
    }

	/**
	 * @param jsonString
	 * @param friendUser
	 */
	public static void parse(String jsonString, FriendUser friendUser) throws JSONException {
        JSONObject jsonObj = new JSONObject(jsonString);
        parse(jsonObj, friendUser);
        jsonObj = jsonObj.getJSONObject(JsonKeys.USER_PROPERTIES);
	}
}
