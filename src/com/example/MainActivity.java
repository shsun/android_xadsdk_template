package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class MainActivity extends Activity implements OnClickListener {

	public static final String TAG = "MainActivity";

	private Button musicServiceBtn;
	private Button musicReceiverBtn;
	private Button bindMusicServiceBtn;
	private Button remoteMusicServiceBtn;

	
	private final static String XADSDK = "http://211.151.146.65:8080/wlantest/shanghai_sun/liuyi/testaa.fpk";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Log.i(TAG, "onCreate");

		musicServiceBtn = (Button) findViewById(R.id.musicService);
		musicReceiverBtn = (Button) findViewById(R.id.musicReceiver);
		bindMusicServiceBtn = (Button) findViewById(R.id.bindMusicService);
		remoteMusicServiceBtn = (Button) findViewById(R.id.remoteMusicService);

		musicServiceBtn.setOnClickListener(this);
		musicReceiverBtn.setOnClickListener(this);
		bindMusicServiceBtn.setOnClickListener(this);
		remoteMusicServiceBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
	}

	@Override
	public void onPause() {
		Log.i(TAG, "onPause");

		super.onPause();
	}

	@Override
	public void onResume() {
		Log.i(TAG, "onResume");

		super.onResume();
	}

	@Override
	public void onRestart() {
		Log.i(TAG, "onRestart");

		super.onRestart();
	}

	@Override
	public void onStop() {
		Log.i(TAG, "onStop");

		super.onStop();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		Log.i(TAG, "onSaveInstanceState");
		super.onSaveInstanceState(outState);
	}

	@Override
	public void onDestroy() {
		Log.i(TAG, "onDestroy");
		super.onDestroy();

	}

}