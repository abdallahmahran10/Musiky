/**
 * 
 */
package com.mahran.musiky.model;

import android.net.ParseException;
import android.support.v4.util.LongSparseArray;

/**
 * @author Abdallah
 *
 */
public class UsersPool {
	private static LongSparseArray<User> users;
	static
	{
		users = new LongSparseArray<User>();
	}
	/**
	 * add user to the users pool 
	 * @param user
	 */
	static public void addUser(User user)
	{
		users.put(user.userId, user);
	}

	/**
	 * Get user by id 
	 * @param userId user id 
	 * @return user if found in pool, otherwise return null
	 */
	static public User addUser(long userId)
	{
		return users.get(userId);
	}
	
	
}
