//package com.example.todo1;
//
//import android.app.Application;
//import android.util.Log;
//
///**
// * Created by Sergey on 29.05.2015.
// */
//public class MyApp extends Application {
//    /* Static file for store a link to the data base object */
//    private static DBHelper mDB = null;
//
//
//    /* Private field for store a LOG tag */
//    public static final String LOG_TAG = "MyApp";
//
//    @Override
//    public void onCreate() {
//
//		/* Invoke a parent method */
//        super.onCreate();
//
//		/* Create a data base object */
//        mDB = new DBHelper(getApplicationContext());
//
//		/* Write a log */
//        Log.d(LOG_TAG, "Application onCreate");
//    }
//
//    /**
//     * Get a link to the data base object
//     */
//    public static DBHelper getDB() {
//        return mDB;
//    }
//
//    /**
//     * Add any string to Log
//     */
//    public static void Log(String log) {
//        Log.d(LOG_TAG, log);
//    }
//
//}
//
