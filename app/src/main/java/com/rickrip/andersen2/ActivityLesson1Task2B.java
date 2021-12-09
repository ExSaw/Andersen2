package com.rickrip.andersen2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import static com.rickrip.andersen2.MainActivity.LOG_TAG;

public class ActivityLesson1Task2B extends AppCompatActivity {

    Button buttonToast, buttonCount, buttonZero;
    TextView textViewShowCount;
    private int count = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_2_b);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); //disable night theme

        Log.d(LOG_TAG, "ActivityLesson1Tsk2A Hello Toast A!");

        buttonToast = findViewById(R.id.button_toast);
        buttonCount = findViewById(R.id.button_count);
        buttonZero = findViewById(R.id.button_zero);

        textViewShowCount = findViewById(R.id.tv_show_count);

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(ActivityLesson1Task2B.this, R.string.toast_message, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                setText(count);
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                setText(count);
            }
        });
    }

    private void setText(int count){
        if (textViewShowCount != null) {
            textViewShowCount.setText(String.valueOf(count));
        }
    }

}