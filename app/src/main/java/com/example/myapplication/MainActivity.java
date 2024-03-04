package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRR","onStart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRR","onDestroy()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRR","onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRR","onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRR","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRR","onStop()");
    }
}