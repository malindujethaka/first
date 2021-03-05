package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: Iam here.application loaded");

    }
    public void onStart(){
        super.onStart();
        Log.i(TAG, "onStart() invoked");
    }
    public  void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart() invoked");
    }
    public void onResume(){
        super.onResume();
        Log.i(TAG, "onResume() invoked");
    }

}