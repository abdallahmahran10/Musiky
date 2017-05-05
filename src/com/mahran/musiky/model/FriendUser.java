/**
 * 
 */
package com.mahran.musiky.model;

import com.mahran.musiky.utilities.json.JsonParser;

import org.json.JSONException;

/**
 * @author Abdallah
 *
 */
public class FriendUser extends User {
	public FriendUser()
	{
        jsonType = "f4565as4d654asd";
	}

	/* (non-Javadoc)
	 * @see com.mahran.musiky.utilities.IJsonCompatible#parse(java.lang.String)
	 */
	@Override
	public void parse(String jsonString) throws JSONException {
		JsonParser.parse(jsonString, this);
	}
}
