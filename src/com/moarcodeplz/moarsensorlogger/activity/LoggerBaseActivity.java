package com.moarcodeplz.moarsensorlogger.activity;

import com.moarcodeplz.moarsensorlogger.application.LoggerApplication;

import android.app.Activity;
import android.os.Bundle;

public class LoggerBaseActivity extends Activity {

	protected LoggerApplication app;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
    	app = (LoggerApplication) getApplication();
    	
    }
    
    @Override
    public void onResume() {
    	
    	super.onResume();
    	app = (LoggerApplication) getApplication();
    	
    	
    }
    
}
