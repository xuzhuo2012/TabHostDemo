package com.xxzzsoftware.tabhostdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class NewsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView textView=new TextView(this);
		textView.setText("这是信息！");
		setContentView(textView);
	}
	
}
