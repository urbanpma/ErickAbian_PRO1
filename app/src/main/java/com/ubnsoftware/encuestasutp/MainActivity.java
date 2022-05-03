package com.ubnsoftware.encuestasutp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SystemClock.sleep(2500);
        Intent AppIntent = new Intent(MainActivity.this, AppActivity.class);
        startActivity(AppIntent);
        finish();
    }
}