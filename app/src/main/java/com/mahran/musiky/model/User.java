/**
 * 
 */
package com.mahran.musiky.model;

import com.mahran.musiky.utilities.IJsonCompatible;

/**
 * @author Abdallah
 *
 */
public abstract class User implements IJsonCompatible {
	
	protected long userId;
	protected String fname;
	protected String lname;
	protected boolean isAuthorized;
	
}
