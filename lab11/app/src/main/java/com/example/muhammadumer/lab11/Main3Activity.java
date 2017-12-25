package com.example.muhammadumer.lab11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        quiz();
    }
    public void quiz(){
        final EditText Question;
        Question=(EditText)findViewById(R.id.Question);
        final RadioGroup grp;
        grp=(RadioGroup)findViewById(R.id.grp);
        final Button nextb;
        nextb=(Button)findViewById(R.id.nextb);
        Toast.makeText(Main3Activity.this,"check the coorect answer and press next",Toast.LENGTH_LONG).show();
        nextb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main2Activity m=new Main2Activity();
                RadioButton pressbutton;
                Integer id=grp.getCheckedRadioButtonId();
                pressbutton=(RadioButton) findViewById(id);
                if(pressbutton.getText().toString().equals("Founder of Pakistan")){
                    m.marks=m.marks+10;

                }
                String msg="you get "+m.marks+" marks";
                Toast.makeText(Main3Activity.this,msg,Toast.LENGTH_LONG).show();

            }
        });
    }
}


