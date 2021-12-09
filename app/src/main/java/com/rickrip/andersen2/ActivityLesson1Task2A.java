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

public class ActivityLesson1Task2A extends AppCompatActivity {

    Button buttonToast, buttonCount;
    TextView textViewShowCount;
    private int count = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_1_2_a);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); //disable night theme

        Log.d(LOG_TAG, "ActivityLesson1Tsk2A Hello Toast A!");

        buttonToast = findViewById(R.id.button_toast);
        buttonCount = findViewById(R.id.button_count);

        textViewShowCount = findViewById(R.id.tv_show_count);

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(ActivityLesson1Task2A.this, R.string.toast_message, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (textViewShowCount != null) {
                    textViewShowCount.setText(String.valueOf(count));
                }
            }
        });

    }

}
