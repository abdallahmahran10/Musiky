/**
 * 
 */
package com.mahran.musiky.model;

import com.mahran.musiky.utilities.JsonParser;

/**
 * @author Abdallah
 *
 */
public class FriendUser extends User {

	/* (non-Javadoc)
	 * @see com.mahran.musiky.utilities.IJsonCompatible#parse(java.lang.String)
	 */
	@Override
	public void parse(String jsonString) {
		JsonParser.parse(jsonString, this);
	}

}
