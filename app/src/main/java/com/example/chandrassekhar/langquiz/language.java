package com.example.chandrassekhar.langquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by chandrassekhar on 25/09/17.
 */

public class language extends AppCompatActivity implements View.OnClickListener {
    TextView tv1;
    Intent ci,s1,s2,s3;
    String name;
    Button but1,but2,but3;
    int j=0,p=0,c=0;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language);
        tv1=(TextView)findViewById(R.id.text2);
        ci=getIntent();
        name=ci.getStringExtra("N1");
        tv1.setText(name);
        init();

    }

    private void init() {
        but1=(Button)findViewById(R.id.button1);
        but2=(Button)findViewById(R.id.button2);
        but3=(Button)findViewById(R.id.button3);
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.button1:
                Intent s1=new Intent(this,question.class);
                s1.putExtra("C1",c);
                startActivity(s1);

                break;
            case R.id.button2:
                Intent s2=new Intent(this,jquestion.class);
                s2.putExtra("P1",p);
                startActivity(s2);


                break;
            case R.id.button3:
                Intent s3=new Intent(this,pquestion.class);
                s3.putExtra("j1",j);
                startActivity(s3);


                break;

        }

    }
}
