package ru.mirea.feofanovoi.lesson2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final String TAG=MainActivity.class.getSimpleName();
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextData);
        Log.d(TAG,"onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"method onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"method onStart");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG,"method onRestoreInstanceState");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"method onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"method onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG,"onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }
    public void invokeSecondActivity(View viev){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", editText.getText().toString());
        startActivity(intent);
    }
}