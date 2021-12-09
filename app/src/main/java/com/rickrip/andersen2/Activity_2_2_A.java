package com.rickrip.andersen2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_2_2_A extends AppCompatActivity {

    TextView textView;
    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_2_a);

        textView = findViewById(R.id.text_header);
        Intent intent = getIntent();
        String strLogin = "";
        strLogin = intent.getStringExtra("count");
        buttonBack = findViewById(R.id.button_second);

        textView.setText("This's activityB and count = "+strLogin);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}