/**
 * 
 */
package com.mahran.musiky.model;

import java.util.ArrayList;

import com.mahran.musiky.utilities.JsonParser;

/**
 * @author Abdallah
 *
 */
public class AppUser extends User {
	private String mostPlayedSong;
	private String mostPlayedArtist;
	private String mostPlayedGenre;
	private String similarTasteUserId;
	private String listeningTO;
	private ArrayList<Long> friends;
	private static  AppUser currentUser;
	
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
	public void parse(String jsonString) {
		JsonParser.parse(jsonString, this);
	}
}
