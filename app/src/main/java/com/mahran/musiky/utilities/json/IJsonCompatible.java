/**
 * 
 */
package com.mahran.musiky.utilities.json;

import org.json.JSONException;

/**
 * @author Abdallah
 *
 */
public interface IJsonCompatible {
	public void parse(String jsonString) throws JSONException;
}
