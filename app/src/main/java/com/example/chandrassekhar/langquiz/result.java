package com.example.chandrassekhar.langquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by chandrassekhar on 26/09/17.
 */

public class result extends AppCompatActivity {
    Intent result;
    int score;
    TextView tv1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        init();

    }

    private void init() {
        result=getIntent();
        score=result.getIntExtra("result",-1);
        tv1.setText(score);




    }
}
