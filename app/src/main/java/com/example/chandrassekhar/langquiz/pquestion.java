package com.example.chandrassekhar.langquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class pquestion extends AppCompatActivity implements View.OnClickListener {

    Intent intent3;
    int ques3;
    Button next;
    RadioGroup rgroup;
    RadioButton rbutton1,rbutton2,rbutton3,rbutton4;
    TextView tv1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pquestion);
        next=(Button)findViewById(R.id.but);
        next.setOnClickListener(this);
        rgroup=(RadioGroup)findViewById(R.id.crg1);
        rbutton1=(RadioButton)findViewById(R.id.cb1);
        rbutton2=(RadioButton)findViewById(R.id.cb2);
        rbutton3=(RadioButton)findViewById(R.id.cb3);
        rbutton4=(RadioButton)findViewById(R.id.cb4);
        tv1=(TextView)findViewById(R.id.text1);
        intent3=getIntent();
        ques3 =intent3.getIntExtra("P1",-1);
        init3();


    }

    private void init3() {


        if(ques3==0){
            tv1.setText("1.What does PHP stand for?");
            rbutton1.setText("1.Personal Home Page");
            rbutton2.setText("2.Hypertext Preprocessor");
            rbutton3.setText("3.Pretext Hypertext Processor");
            rbutton4.setText("4.Preprocessor Home Page");

        }
        if(ques3==1){
            tv1.setText("2.Which version of PHP introduced Try/catch Exception?");
            rbutton1.setText("1.PHP 4");
            rbutton2.setText("2.PHP 5");
            rbutton3.setText("3.PHP 5.3");
            rbutton4.setText("4.PHP 6");

        }

        if(ques3==2){
            tv1.setText("3.A function in PHP which starts with __ (double underscore) is know as..");
            rbutton1.setText("1.Magic Function");
            rbutton2.setText("2.Inbuilt Function");
            rbutton3.setText("3.Default Function");
            rbutton4.setText("4.User Defined Function");

        }

        if(ques3==3){
            tv1.setText("4.Which one of the following PHP functions can be used to find files?");
            rbutton1.setText("1.glob()");
            rbutton2.setText("2.file()");
            rbutton3.setText("3.fold()");
            rbutton4.setText("4.get_file()");

        }

        if(ques3==4){
            tv1.setText("5.Which of the following PHP functions can be used to get the current memory usage?");
            rbutton1.setText("1.get_usage()");
            rbutton2.setText("2.get_peak_usage()");
            rbutton3.setText("3.get_memory_usage()");
            rbutton4.setText("4.get_memory_peak_usage()");

        }

        if(ques3==5){
            tv1.setText("6.Which statement causes PHP to disregard repeated error messages that occur within the same file,on the same line?");
            rbutton1.setText("1.ignore_repeated_errors");
            rbutton2.setText("2.ignore_repeat_error");
            rbutton3.setText("3.repeatedly_ignore_error");
            rbutton4.setText("4.repeated_error_ignore");

        }

        if(ques3==6){
            tv1.setText("7.Which function is used to erase all session variables stored in the current session?");
            rbutton1.setText("1.session_destroy()");
            rbutton2.setText("2.session_change()");
            rbutton3.setText("3.session_remove()");
            rbutton4.setText("4.session_unset()");

        }

        if(ques3==7){
            tv1.setText("8.An attacker somehow obtains an unsuspecting user’s SID and then using it to impersonate the user inorder to gain potentially sensitive information. This attack is known as..");
            rbutton1.setText("1.session-fixation");
            rbutton2.setText("2.session-fixing");
            rbutton3.setText("3.session-hijack");
            rbutton4.setText("4.session-copy");

        }

        if(ques3==8){
            tv1.setText("9.Code that uses a class, function, or method is often described as the..");
            rbutton1.setText("1.client code");
            rbutton2.setText("2.user code");
            rbutton3.setText("3.object code");
            rbutton4.setText("4.class code");

        }

        if(ques3==9){
            tv1.setText("10.Which version of PHP introduced Try/catch Exception?");
            rbutton1.setText("1.PHP 4");
            rbutton2.setText("2.PHP 5");
            rbutton3.setText("3.PHP 5.3");
            rbutton4.setText("4.PHP 6");

        }




    }

    @Override
    public void onClick(View view) {

        ques3++;
        init3();

    }
}