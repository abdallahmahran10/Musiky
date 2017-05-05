/**
 * 
 */
package com.mahran.musiky.model;

import java.util.ArrayList;
import java.util.List;

import com.mahran.musiky.utilities.json.JsonParser;

import org.json.JSONException;

/**
 * @author Abdallah
 *
 */
public class AppUser extends User {
	protected boolean isAuthorized;
	private List<Long> similarTasteIds;
	private List<Long> friendsIds;
	private static  AppUser currentUser;

	private  AppUser()
	{
		jsonType = "a156834615431";
	}
	/**
	 * return the current App user
	 * @return singletone instant of AppUser
	 */
	static public AppUser getAppUser()
	{
		if(currentUser == null)
			currentUser = new AppUser();
		return currentUser;
	}

	/* (non-Javadoc)
	 * @see com.mahran.musiky.utilities.IJsonCompatible#parse(java.lang.String)
	 */
	@Override
	public void parse(String jsonString) throws JSONException {
		JsonParser.parse(jsonString, this);
	}


    public void setIsAuthorized(boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }


    public void setSimilarTasteIds(List<Long> similarTasteIds) {
        this.similarTasteIds = similarTasteIds;
    }

    public void setFriendsIds(List<Long> friendsIds) {
        this.friendsIds = friendsIds;
    }
}
