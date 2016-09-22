package com.example.aaron.lifecycle;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
    public static final String LOG_CAT = "AR   Activity 2 ----->";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(LOG_CAT, "OnStart");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_CAT, "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_CAT, "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_CAT, "OnDestroy");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(LOG_CAT, "OnPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(LOG_CAT, "OnPostResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_CAT, "OnRestart");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(LOG_CAT, "OnBackPressed");
    }

    public void goBack(View view) {
        finish();
    }
}
