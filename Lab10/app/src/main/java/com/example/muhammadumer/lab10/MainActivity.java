package com.example.muhammadumer.lab10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
private static int marks=0;
    public void quiz(){
        final EditText Question;
        Question=(EditText)findViewById(R.id.Question);
        final RadioGroup grp;
        grp=(RadioGroup)findViewById(R.id.grp);
        final Button nextb;
        nextb=(Button)findViewById(R.id.nextb);

        nextb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioButton pressbutton;
                Integer id=grp.getCheckedRadioButtonId();
                pressbutton=(RadioButton) findViewById(id);
                if(pressbutton.getText().toString().equals("Islamabad")){
                    marks=marks+10;

                }
                Intent next=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(next);

            }
        });
}
