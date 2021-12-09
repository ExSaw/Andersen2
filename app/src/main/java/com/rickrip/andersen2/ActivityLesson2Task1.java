package com.rickrip.andersen2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import static com.rickrip.andersen2.MainActivity.LOG_TAG;

public class ActivityLesson2Task1 extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.rickrip.andersen2.extra.MESSAGE";
    private EditText messageEditText;

    public static final int TEXT_REQUEST = 1;

    private TextView mReplyHeadTextView;
    private TextView mReplyTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_1);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); //disable night theme

        Log.d(LOG_TAG, "ActivityLesson2Task1 Activities and Intents");

        messageEditText = findViewById(R.id.editText_main);

        mReplyHeadTextView = findViewById(R.id.text_header_reply);
        mReplyTextView = findViewById(R.id.text_message_reply);

    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");

        String message = messageEditText.getText().toString();

        Intent intent = new Intent(this,Activity_2_1_A.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent,TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(Activity_2_1_A.EXTRA_REPLY);
                mReplyHeadTextView.setVisibility(View.VISIBLE);
                mReplyTextView.setText(reply);
                mReplyTextView.setVisibility(View.VISIBLE);
            }
        }
    }
}
