/**
 * Provide similar functionality to all activities
 */
package com.mahran.musiky.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * @author Abdallah
 *
 */
public abstract class BaseActivity extends FragmentActivity  {
	protected int activityViewId;
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(activityViewId);
		super.onCreate(savedInstanceState);
	}
	
	/**
	 * init activity views and layout controls
	 */
	protected abstract void initActivity();
}
