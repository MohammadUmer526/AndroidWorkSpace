package com.example.muhammadumer.calculatorradiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt1, edt2;
    private RadioButton add,sub,mul,div;
    private RadioGroup rg;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    call();
    }

    public void call(){
         edt1 = (EditText)findViewById(R.id.editText);
        edt2 = (EditText)findViewById(R.id.editText2);
       rg= (RadioGroup) findViewById(R.id.radioGroupCal);
        bt = (Button)findViewById(R.id.button2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selecid = rg.getCheckedRadioButtonId();
                Integer f = Integer.parseInt(edt1.getText().toString());

                Integer s = Integer.parseInt(edt2.getText().toString());
                Integer res = 0;

                add = (RadioButton)findViewById(selecid);

                if(add.getText().toString().equals("+"))
                {
                    res = f+s;

                }
                else if(add.getText().toString().equals("-"))
                {
                    res = f-s;
                }
                else if(add.getText().toString().equals("*"))
                {
                    res = f*s;
                }
                else
                {
                    res = f/s;
                }
                Toast.makeText(MainActivity.this,String.valueOf(res),Toast.LENGTH_LONG).show();
            }
        });
}
}
