package com.taxigol.creamywidgets;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HeroUnitActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hero_unit);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hero_unit, menu);
		return true;
	}

}
