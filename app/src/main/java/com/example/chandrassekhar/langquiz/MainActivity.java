package com.example.chandrassekhar.langquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     TextView tv1;
    Button but;
    EditText edit1;
  public   Intent in;
    String name;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=(EditText) findViewById(R.id.edit);
        but=(Button)findViewById(R.id.but);
        but.setOnClickListener(this);


    }



    @Override
    public void onClick(View view) {
        name =edit1.getText().toString();
        Intent in=new Intent(this,language.class);
        in.putExtra("N1",name);
        startActivity(in);
        finish();


    }
}
