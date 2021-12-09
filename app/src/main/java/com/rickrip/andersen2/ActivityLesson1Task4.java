package com.rickrip.andersen2;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import static com.rickrip.andersen2.MainActivity.LOG_TAG;

public class ActivityLesson1Task4 extends AppCompatActivity {

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_1_4);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); //disable night theme

            Log.d(LOG_TAG, "ActivityLesson1Task4 Icons,Templates!");

        }

}
