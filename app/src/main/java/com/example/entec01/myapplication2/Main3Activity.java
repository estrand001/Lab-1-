package com.example.entec01.myapplication2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class Main3Activity extends AppCompatActivity {
    public static final String TAG = "Main3activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "in the onStart() method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "in the onRestart() method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "in the onResume() method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "in the onPause() method");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "in the onStop() method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "in the onDestroy() method");
    }


}
