package com.example.muhammadumer.lab11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    public static int marks=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main2);
        quiz();
    }
    public void quiz(){
        final EditText Question;
        Question=(EditText)findViewById(R.id.Question);
        final RadioGroup grp;
        grp=(RadioGroup)findViewById(R.id.grp);
        final Button nextb;
        nextb=(Button)findViewById(R.id.nextb);
        Toast.makeText(Main2Activity.this,"check the coorect answer and press next",Toast.LENGTH_LONG).show();
        nextb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioButton pressbutton;
                Integer id=grp.getCheckedRadioButtonId();
                pressbutton=(RadioButton) findViewById(id);
                if(pressbutton.getText().toString().equals("Islamabad")){
                    marks=marks+10;

                }
                Intent next=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(next);

            }
        });
    }
}
