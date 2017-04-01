/**
 * Splash activity, this should be the app first activity to run
 */
package com.mahran.musiky;

import android.os.Bundle;

/**
 * @author Abdallah
 *
 */
public class SplashActivity extends BaseActivity {
	/* (non-Javadoc)
	 * @see com.mahran.musiky.BaseActivity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		initActivity();
		super.onCreate(savedInstanceState);
	}

	/* (non-Javadoc)
	 * @see com.mahran.musiky.BaseActivity#initActivity()
	 */
	@Override
	protected void initActivity() {
		activityViewId = R.layout.activity_main;
	}

	
}
