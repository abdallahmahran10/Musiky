/**
 * Splash activity, this should be the app first activity to run
 */
package com.mahran.musiky.activities;

import android.os.Bundle;

import com.mahran.musiky.R;

/**
 * @author Abdallah
 *
 */
public class SplashActivity extends BaseActivity {
	/* (non-Javadoc)
	 * @see com.mahran.musiky.activities.BaseActivity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		initActivity();
		super.onCreate(savedInstanceState);
	}

	/* (non-Javadoc)
	 * @see com.mahran.musiky.activities.BaseActivity#initActivity()
	 */
	@Override
	protected void initActivity() {
		activityViewId = R.layout.activity_main;
	}

	
}
