package com.taxigol.creamywidgets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.btnButtons).setOnClickListener(this);
		findViewById(R.id.btnHeadings).setOnClickListener(this);
		findViewById(R.id.btnHeroUnit).setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		Intent i = null;
		if (v.equals(findViewById(R.id.btnButtons))){
			i = new Intent(this, ButtonsActivity.class);
		}
		else if (v.equals(findViewById(R.id.btnHeadings))){
			i = new Intent(this, HeadingsActivity.class);
		}
		else if (v.equals(findViewById(R.id.btnHeroUnit))){
			i = new Intent(this, HeroUnitActivity.class);
		}
		
		startActivity(i);
	}


}
