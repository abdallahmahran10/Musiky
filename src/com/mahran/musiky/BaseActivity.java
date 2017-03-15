/**
 * Provide similar functionality to all activities
 */
package com.mahran.musiky;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Abdallah
 *
 */
public abstract class BaseActivity extends Activity {
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
