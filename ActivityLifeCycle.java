package com.example.androidactivitylifecycle;

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
        Log.d("TAG", "onStart called..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Tag","onResume called..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Tag","onRestart called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Tag","onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Tag","onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Tag","onDestroy called");
    }
}


