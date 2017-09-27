package com.example.chandrassekhar.langquiz;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class question extends AppCompatActivity implements View.OnClickListener {
    TextView tv1;
    int ques1,count=0;
    String correct;
    Intent intent1;
    Button next;
    RadioGroup rgroup;
    RadioButton rbutton1,rbutton2,rbutton3,rbutton4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);
        tv1=(TextView)findViewById(R.id.text1);
        next=(Button)findViewById(R.id.but);
        next.setOnClickListener(this);
        rgroup=(RadioGroup)findViewById(R.id.crg1);
        rbutton1=(RadioButton)findViewById(R.id.cb1);
        rbutton2=(RadioButton)findViewById(R.id.cb2);
        rbutton3=(RadioButton)findViewById(R.id.cb3);
        rbutton4=(RadioButton)findViewById(R.id.cb4);
        init();
        intent1=getIntent();
        ques1 =intent1.getIntExtra("C1",-1);

    }

    private void init() {

        if(ques1==0){
            tv1.setText("1.For which of the following, “PI++;” code will fail?");
            rbutton1.setText("1.#define PI 3.14");
            rbutton2.setText("2.char *PI = “A”;");
            rbutton3.setText("3.float PI = 3.14;");
            rbutton4.setText("4.None of the Mentioned");
            Toast t=Toast.makeText(this,ques1,Toast.LENGTH_SHORT);
            t.show();
            //check(ques1);

        }
        if(ques1==1){
            tv1.setText("2.What is the size of *ptr in a 32-bit machine, (assuming initialization as int *ptr = 10;)?");
            rbutton1.setText("1.1");
            rbutton2.setText("2.2");
            rbutton3.setText("3.4");
            rbutton4.setText("4.8");
            check(ques1);



        }

        if(ques1==2){
            tv1.setText("3.Within main, return expr statement is equivalent to?");
            rbutton1.setText("1.abort(expr)");
            rbutton2.setText("2.exit(expr)");
            rbutton3.setText("3.ferror(expr)");
            rbutton4.setText("4.None of the mentioned");
            check(ques1);


        }

        if(ques1==3){
            tv1.setText("4.The number of digits present after decimal in float is________.");
            rbutton1.setText("1.1");
            rbutton2.setText("2.3");
            rbutton3.setText("3.6");
            rbutton4.setText("4.16");
            check(ques1);


        }

        if(ques1==4){
            tv1.setText("5.Are logical operators sequence points?");
            rbutton1.setText("1.True");
            rbutton2.setText("2.False");
            rbutton3.setText("3.Depends on the compiler");
            rbutton4.setText("4.Depends on the standard");
            check(ques1);


        }

        if(ques1==5){
            tv1.setText("6.Relational operators cannot be used on?");
            rbutton1.setText("1.structure");
            rbutton2.setText("2.long");
            rbutton3.setText("3.strings");
            rbutton4.setText("4.float");
            check(ques1);


        }

        if(ques1==6){
            tv1.setText("7.Which is the best way to generate numbers between 0 to 99??");
            rbutton1.setText("1.rand()-100");
            rbutton2.setText("2.rand()%100");
            rbutton3.setText("3.rand(100)");
            rbutton4.setText("4.srand(100)");
            check(ques1);


        }

        if(ques1==7){
            tv1.setText("8.sin(x) returns?");
            rbutton1.setText("1.sine of x where x is in radians");
            rbutton2.setText("2.sine of x where x is in degree");
            rbutton3.setText("3.cosine of x where x is in radians");
            rbutton4.setText("4.cosine of x where x is in degree");
            check(ques1);


        }

        if(ques1==8){
            tv1.setText("9.log(x) function defined in math.h header file is?");
            rbutton1.setText("1.Natural base logarithm");
            rbutton2.setText("2.Logarithm to the base 2");
            rbutton3.setText("3.Logarithm to the base 10");
            rbutton4.setText("4.None of the mentioned");
            check(ques1);


        }

        if(ques1==9){
            tv1.setText("10.Which of the following is not a valid variable name declaration?");
            rbutton1.setText("1.int _a3;");
            rbutton2.setText("2.int _3a;");
            rbutton3.setText("3.int _A3;");
            rbutton4.setText("4.None of the mentioned");
            check(ques1);


        }

    }

    private void check(int ques1) {
        int sel=rgroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(sel);
        correct = (String) selected.getText();
        if(ques1==0&& correct=="1.#define PI 3.14") {
            count++;
        }

        else;
        if(ques1==1&& correct=="3.4") {
            count++;


        }
        else;
        if(ques1==2&& correct=="2.exit(expr)") {
            count++;


        }
        else;

        if(ques1==3&& correct=="3.6") {
            count++;


        }
        else;

        if(ques1==4&& correct=="1.True") {
            count++;


        }
        else;

        if(ques1==5&& correct=="1.structure") {
            count++;


        }
        else;

        if(ques1==6&& correct=="2.rand()%100") {
            count++;


        }
        else;

        if(ques1==7&& correct=="1.sine of x where x is in radians") {
            count++;


        }
        else;

        if(ques1==8&& correct=="1.Natural base logarithm") {
            count++;


        }
        else;

        if(ques1==9&& correct=="2.int _3a;") {
            count++;


        }
        else;





    }



    @Override
    public void onClick(View view) {

        ques1++;
        check(ques1);
        init();
        if(ques1==10){
            Intent i=new Intent(this,result.class);
            i.putExtra("result",count);
        }
    }
}
