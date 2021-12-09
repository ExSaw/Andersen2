package com.rickrip.andersen2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // public static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String LOG_TAG = "'";
    AppCompatButton buttonOneOne,buttonOneTwoA,buttonOneTwoB,buttonOneThree,buttonOneFour,
                    buttonTwoOne,buttonTwoTwo,buttonTwoThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); //disable night theme
        Log.d(LOG_TAG,"MainActivity Created");
        buttonOneOne = findViewById(R.id.btn_1_1);
        buttonOneTwoA = findViewById(R.id.btn_1_2_1);
        buttonOneTwoB = findViewById(R.id.btn_1_2_2);
        buttonOneThree= findViewById(R.id.btn_1_3);
        buttonOneFour = findViewById(R.id.btn_1_4);
        buttonTwoOne = findViewById(R.id.btn_2_1);
        buttonTwoTwo = findViewById(R.id.btn_2_2);
        buttonTwoThree = findViewById(R.id.btn_2_3);

        buttonOneOne.setOnClickListener(this);
        buttonOneTwoA.setOnClickListener(this);
        buttonOneTwoB.setOnClickListener(this);
        buttonOneThree.setOnClickListener(this);
        buttonOneFour.setOnClickListener(this);
        buttonTwoOne.setOnClickListener(this);
        buttonTwoTwo.setOnClickListener(this);
        buttonTwoThree.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btn_1_1){
            Intent intent = new Intent(this,ActivityLesson1Task1.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn_1_2_1){
            Intent intent = new Intent(this,ActivityLesson1Task2A.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn_1_2_2){
            Intent intent = new Intent(this,ActivityLesson1Task2B.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn_1_3){
            Intent intent = new Intent(this,ActivityLesson1Task3.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn_1_4){
            Intent intent = new Intent(this,ActivityLesson1Task4.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn_2_1){
            Intent intent = new Intent(this,ActivityLesson2Task1.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn_2_2){
            Intent intent = new Intent(this,ActivityLesson2Task2.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn_2_3){
            Intent intent = new Intent(this,ActivityLesson2Task3.class);
            startActivity(intent);
        }

    }
}