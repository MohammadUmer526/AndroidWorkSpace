package com.example.muhammadumer.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioButton opt1,opt2,opt3,opt4;
    private RadioGroup rg;
    private Button btnNxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    call();
    }

    public void call(){
        rg= (RadioGroup) findViewById(R.id.radioGroupCal);
        btnNxt = (Button)findViewById(R.id.button2);

        btnNxt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });

    public void nextAct(){
        Intent cl1 = new Intent(this, Main2Activity.class);
        startActivity(cl1);
    }
}
