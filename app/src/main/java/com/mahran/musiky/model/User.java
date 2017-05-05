/**
 * 
 */
package com.mahran.musiky.model;

import com.mahran.musiky.utilities.json.IJsonCompatible;

/**
 * @author Abdallah
 *
 */
public abstract class User implements IJsonCompatible {

	protected String jsonType;
	protected long userId;
	protected String fname;
	protected String lname;
	protected String listeningTo;
	protected String mostPlayedSong;
	protected String mostPlayedArtist;
	protected String mostPlayedGenre;

	public String getJsonType()
	{
		return jsonType;
	}

	public void setListeningTo(String listeningTo) {
		this.listeningTo = listeningTo;
	}

	public void setMostPlayedArtist(String mostPlayedArtist) {
		this.mostPlayedArtist = mostPlayedArtist;
	}

	public void setMostPlayedSong(String mostPlayedSong) {
		this.mostPlayedSong = mostPlayedSong;
	}

	public void setMostPlayedGenre(String mostPlayedGenre) {
		this.mostPlayedGenre = mostPlayedGenre;
	}

}
