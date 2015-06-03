package com.example.todo1;

import android.app.Application;
import android.util.Log;
//import android_2.lesson01.app01.lib.DBEmpl_2;
import com.example.todo1.dao.TodoDAO;

public class MyApp extends Application {
	
	/* Static file for store a link to the data base object */	
	//private static DBEmpl_2 mDBEmpl = null;
	private static TodoDAO mdao = null;


	/* Private field for store a LOG tag */
	public static final String LOG_TAG = "MyApp";	
	
	@Override
	public void onCreate() {
		
		/* Invoke a parent method */
		super.onCreate();
		
		/* Create a data base object */		
		mdao = new TodoDAO(getApplicationContext());

		/* Write a log */
		Log.d(LOG_TAG, "Application onCreate");			
	}
	
	/** Get a link to the data base object */
	//public static DBEmpl_2 getDB() { return mDBEmpl; }

	public static TodoDAO getMdao() { return mdao; }
	
	/** Add any string to Log */
	public static void Log(String log) {
		Log.d(LOG_TAG, log);
	}

}
