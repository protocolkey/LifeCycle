package com.example.don.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("**LifeCycle**","onCreate");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("**LifeCycle**","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("**LifeCycle**","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("**LifeCycle**","onRestart);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.e("**LifeCycle**","onDeatachedFromWindow");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("**LifeCycle**","onPause");
    }
}
