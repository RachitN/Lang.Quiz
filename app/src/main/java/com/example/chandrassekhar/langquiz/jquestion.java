package com.example.chandrassekhar.langquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class jquestion extends AppCompatActivity implements View.OnClickListener {
    Intent intent2;
    int ques2;
    Button next;
    RadioGroup rgroup;
    RadioButton rbutton1,rbutton2,rbutton3,rbutton4;
    TextView tv1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jquestion);
        next=(Button)findViewById(R.id.but);
        next.setOnClickListener(this);
        rgroup=(RadioGroup)findViewById(R.id.crg1);
        rbutton1=(RadioButton)findViewById(R.id.cb1);
        rbutton2=(RadioButton)findViewById(R.id.cb2);
        rbutton3=(RadioButton)findViewById(R.id.cb3);
        rbutton4=(RadioButton)findViewById(R.id.cb4);
        tv1=(TextView)findViewById(R.id.text1);
        intent2=getIntent();
        ques2 =intent2.getIntExtra("P1",-1);
        init2();
    }

    private void init2() {

        if(ques2==0){
            tv1.setText("1.What is the range of short data type in Java?");
            rbutton1.setText("1.128 to 127");
            rbutton2.setText("2.-32768 to 32767.");
            rbutton3.setText("3.-2147483648 to 2147483647.");
            rbutton4.setText("4.None of the Mentioned");

        }
        if(ques2==1){
            tv1.setText("2.Modulus operator, %, can be applied to which of these??");
            rbutton1.setText("1.Integers");
            rbutton2.setText("2.Floating – point numbers");
            rbutton3.setText("3.Both Integers and floating – point numbers");
            rbutton4.setText("4.None of the mentioned");

        }

        if(ques2==2){
            tv1.setText("3.Which of these is returned by “greater than”, “less than” and “equal to” operators?");
            rbutton1.setText("1.Integers");
            rbutton2.setText("2.Floating – point numbers.");
            rbutton3.setText("3.Boolean");
            rbutton4.setText("4.None of the mentioned");

        }

        if(ques2==3){
            tv1.setText("4.Which of these keywords is used to make a class??");
            rbutton1.setText("1.class");
            rbutton2.setText("2.struct");
            rbutton3.setText("3.int");
            rbutton4.setText("4.None of the mentioned");

        }

        if(ques2==4){
            tv1.setText("5.What is the process of defining more than one method in a class differentiated by method signature?\n" +
                    "?");
            rbutton1.setText("1.Function overriding");
            rbutton2.setText("2.Function overloading");
            rbutton3.setText("3.Function doubling");
            rbutton4.setText("4.None of the mentioned");

        }

        if(ques2==5){
            tv1.setText("6.Which of these can be overloaded??");
            rbutton1.setText("1.Methods");
            rbutton2.setText("2.Constructors");
            rbutton3.setText("3.All of the mentioned");
            rbutton4.setText("4.None of the mentioned");

        }

        if(ques2==6){
            tv1.setText("7.Which of these keyword must be used to inherit a class??");
            rbutton1.setText("1.super");
            rbutton2.setText("2.this");
            rbutton3.setText("3.extent");
            rbutton4.setText("4.extends");

        }

        if(ques2==7){
            tv1.setText("8. Which of these method of Object class can clone an object??");
            rbutton1.setText("1.Objectcopy()");
            rbutton2.setText("2.copy()");
            rbutton3.setText("3.Object clone()");
            rbutton4.setText("4.clone()");

        }

        if(ques2==8){
            tv1.setText("9.Which of these access specifiers can be used for an interface??");
            rbutton1.setText("1.Public");
            rbutton2.setText("2.Protected");
            rbutton3.setText("3.Private");
            rbutton4.setText("4.All of the mentioned");

        }

        if(ques2==9){
            tv1.setText("10.Which of these package is used for analyzing code during run-time??");
            rbutton1.setText("1.java.applet");
            rbutton2.setText("2.java.awt");
            rbutton3.setText("3.java.io");
            rbutton4.setText("4.java.lang.reflect");

        }



    }

    @Override
    public void onClick(View view) {

        ques2++;
        init2();

    }
}
