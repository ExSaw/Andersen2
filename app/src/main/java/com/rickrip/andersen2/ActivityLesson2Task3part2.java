package com.rickrip.andersen2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ShareCompat;

import static com.rickrip.andersen2.MainActivity.LOG_TAG;


public class ActivityLesson2Task3part2 extends AppCompatActivity {

    EditText mWebsiteEditText,mLocationEditText,mShareTextEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_3);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); //disable night theme

        Log.d(LOG_TAG, "ActivityLesson2Task3 Explicit Intents");

        Intent intent = getIntent();
        Uri uri = intent.getData();
        if (uri != null) {
            String uri_string = getString(R.string.uri_label)
                    + uri.toString();
            TextView textView = findViewById(R.id.text_uri_message);
            textView.setText(uri_string);
        }

    }
}
