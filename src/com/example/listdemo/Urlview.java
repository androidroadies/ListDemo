package com.example.listdemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class Urlview extends Activity
{
	Context context;
	AppConfig config;
	String pos;
 @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		context = getApplicationContext();
		config = new AppConfig(context);

		System.out.println(AppConfig.pos);
		
		if (AppConfig.pos == 0) 
		{
			Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=cxLG2wtE7TM"));
			intent.putExtra("force_fullscreen",true); 
			startActivity(intent);
		}
	}
}
