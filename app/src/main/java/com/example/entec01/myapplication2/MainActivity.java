package com.example.entec01.myapplication2;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    private int score = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Intent intent = new Intent(this, Main3Activity.class);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);


            }
        });

        Log.d(TAG, "in the onCreate() method");
        if (savedInstanceState !=null) {
        score = savedInstanceState.getInt("SCORE");
        Log.d(TAG, " in the onCreate method");}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("SCORE", score);
        Log.d(TAG, " in the onSaveInstanceState() method");
        super.onSaveInstanceState(outState);
    }
}


