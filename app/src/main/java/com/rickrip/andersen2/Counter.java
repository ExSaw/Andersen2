package com.rickrip.andersen2;

import android.widget.TextView;

public class Counter {

    private final static String TAG = "'";
    public int int_number = 0;

    public void increase(TextView textView){
        int_number+=1;
        textView.setText(String.valueOf(int_number));
    }

}
