package com.rickrip.andersen2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import static com.rickrip.andersen2.MainActivity.LOG_TAG;


public class ActivityLesson2Task2 extends AppCompatActivity {

    private final static String TAG = "'";
    public final static String KEY_AVATAR = "ActivityLesson2Task2.KEY_AVATAR";
    private int int_number = 0;
    TextView textView;
    Counter counter;
    Button buttonSend;

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        counter.int_number = int_number;
        outState.putInt(KEY_AVATAR,counter.int_number);
        Log.i(TAG,"SAVED "+counter.int_number);
        super.onSaveInstanceState(outState);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_2);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); //disable night theme

        Log.d(LOG_TAG, "ActivityLesson2Task2 Activity LifeCycle");

        counter = new Counter();
        textView = findViewById(R.id.text_view);
        buttonSend = findViewById(R.id.button_send);

        if(savedInstanceState!=null){
            counter.int_number = savedInstanceState.getInt(KEY_AVATAR);
            Log.i(TAG,"LOADED "+counter.int_number);
        }else{
            Log.i(TAG,"NOT_LOADED "+counter.int_number);
        }

        counter.increase(textView);

        Log.i(TAG,"onCreate_"+(int_number+=1));

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String count = String.valueOf(int_number);
                Intent intent = new Intent(getApplicationContext(), Activity_2_2_A.class);
                intent.putExtra("count",count);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart(){ //2
        super.onStart();
        counter.increase(textView);
        Log.i(TAG,"onStart_"+(int_number+=1));
    }

    @Override
    protected void onResume(){ //3
        super.onResume();
        counter.increase(textView);
        Log.i(TAG,"onResume_"+(int_number+=1));
    }

    @Override
    protected void onPause(){
        super.onPause();
        counter.increase(textView);
        Log.i(TAG,"onPause_"+(int_number+=1));
    }

    @Override
    protected void onStop(){
        super.onStop();
        counter.increase(textView);
        Log.i(TAG,"onStop_"+(int_number+=1));
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        counter.increase(textView);
        Log.i(TAG,"onRestart_"+(int_number+=1));
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        counter.increase(textView);
        Log.i(TAG,"onDestroy_"+(int_number+=1));
    }
}
