package ru.mirea.feofanovoi.lesson2;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    private String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String value = extras.getString("key");
            Log.d(SecondActivity.class.getSimpleName(), value);
        }
        Log.d(SecondActivity.class.getSimpleName(),value);
    }
}