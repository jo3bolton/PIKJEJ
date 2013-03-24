package com.example.pikjej;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.View;
import android.view.Window;

public class AltTravel extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        // hide the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_alt_travel);
		//set to Portrait mode
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alt_travel, menu);
		return true;
	}
	public void Arriva(View arg0){
		Intent intent = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.arrivabus.co.uk/"));
		startActivity(intent);
	}
	public void Merseyrail(View arg0){
		Intent intent = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.merseyrail.org/"));
		startActivity(intent);
	}
	public void Stagecoach(View arg0){
		Intent intent = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.stagecoachbus.com/PdfUploads/Timetable_8924_347%20(Chorley).pdf"));
		startActivity(intent);
	}
	public void SLT(View arg0){
		Intent intent = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.sltbus.com/timetables.htm"));
		startActivity(intent);
	}
	public void About(View arg0){
		Intent intent = new Intent(AltTravel.this, About.class);
		startActivity(intent);

	}
    
    public void Settings(View arg0){
		Intent intent = new Intent(AltTravel.this, Settings.class);
		startActivity(intent);

	}
    
    public void Home(View arg0){
		Intent intent = new Intent(AltTravel.this, Home.class);
		startActivity(intent);

	}
    
    public void Schedule(View arg0){
		Intent intent = new Intent(AltTravel.this, Schedule.class);
		startActivity(intent);

	}
    public void Terms(View arg0){
		Intent intent = new Intent(AltTravel.this, Terms.class);
		startActivity(intent);

	}
    public void AltTravel(View arg0){
		Intent intent = new Intent(AltTravel.this, AltTravel.class);
		startActivity(intent);

	}
	public void Predictor(View arg0){
		Intent intent = new Intent(AltTravel.this, Predictor.class);
		startActivity(intent);

	}
	public void Guide(View arg0){
		Intent intent = new Intent(AltTravel.this, Userguide.class);
		startActivity(intent);

	}

}

