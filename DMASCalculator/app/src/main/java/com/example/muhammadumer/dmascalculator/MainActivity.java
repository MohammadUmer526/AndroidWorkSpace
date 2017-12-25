package com.example.muhammadumer.dmascalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstnumber,secondnumber;
    Button btnAdd,btnSubtract,btnMultiply,btnDivide,btnCalculate;
    TextView txtResult;
    double num1,num2,sum,subtarction,division,multiplication;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnumber = (EditText) findViewById(R.id.editText);
        secondnumber = (EditText) findViewById(R.id.editText2);
        btnAdd = (Button) findViewById(R.id.button2);
        btnSubtract = (Button) findViewById(R.id.button3);
        btnMultiply = (Button) findViewById(R.id.button4);
        btnDivide = (Button) findViewById(R.id.button5);
        txtResult=(TextView)findViewById(R.id.textView3);

       // btnCalculate = (Button) findViewById(R.id.button6);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(firstnumber.getText().toString());
                num2=Double.parseDouble(secondnumber.getText().toString());
                sum=num1+num2;
                txtResult.setText(Double.toString(sum));

            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(firstnumber.getText().toString());
                num2=Double.parseDouble(secondnumber.getText().toString());
                subtarction=(num1)-(num2);
                txtResult.setText(Double.toString(subtarction));

            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(firstnumber.getText().toString());
                num2=Double.parseDouble(secondnumber.getText().toString());
                multiplication=(num1)*(num2);
                txtResult.setText(Double.toString(multiplication));

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick(View view){
            num1=Double.parseDouble(firstnumber.getText().toString());
            num2=Double.parseDouble(secondnumber.getText().toString());
            division=(num1)/(num2);
            txtResult.setText(Double.toString(division));
        }

        }
        );
    }
}
