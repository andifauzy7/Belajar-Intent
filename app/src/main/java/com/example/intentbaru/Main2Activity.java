package com.example.intentbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent returnIntent = new Intent();
        setResult(MainActivity.REQUEST_CODE, returnIntent);
        Log.d("lifecycle", "ACT 2 onCreate");
        Toast.makeText(this, "onCreate ACT 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "ACT 2 onStart");
        Toast.makeText(this, "onStart ACT 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "ACT 2 onResume");
        Toast.makeText(this, "onResume ACT 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "ACT 2 onPause");
        Toast.makeText(this, "onPause ACT 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "ACT 2 onStop");
        Toast.makeText(this, "onStop ACT 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle", "ACT 2 onRestart");
        Toast.makeText(this, "onRestart ACT 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "ACT 2 onDestroy");
        Toast.makeText(this, "onDestroy ACT 2", Toast.LENGTH_SHORT).show();
    }
}
