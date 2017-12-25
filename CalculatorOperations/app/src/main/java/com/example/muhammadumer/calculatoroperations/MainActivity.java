package com.example.muhammadumer.calculatoroperations;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtView1,txtView2,txtView3,txtView4;
    private TextView showresult;
    private Button btnCalculate;

    double num1,num2,sum,subtraction,division,multiplication;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cal();
    }

    public void cal()
    {

        final EditText txtView1=(EditText)findViewById(R.id.editText);
        final EditText txtView2=(EditText)findViewById(R.id.editText2);
        final EditText txtView3=(EditText)findViewById(R.id.editText3);
        final Button btnCalculate=(Button)findViewById(R.id.button);
        final TextView textView=(TextView)findViewById(R.id.textView);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String test = txtView3.getText().toString();
                //Toast.makeText(MainActivity.this,test, Toast.LENGTH_LONG).show();

                if (test.equals("+")) {
                    num1 = Double.parseDouble(txtView1.getText().toString());
                    num2 = Double.parseDouble(txtView2.getText().toString());
                    sum = (num1) + (num2);
                    textView.setText(Double.toString(sum));
                }
                else if(test.equals("-")){
                    num1= Double.parseDouble(txtView1.getText().toString());
                    num2=Double.parseDouble(txtView2.getText().toString());
                    subtraction = (num1) - (num2);
                    textView.setText(Double.toString(subtraction));
                }
                else if(test.equals("*")){
                    num1=Double.parseDouble(txtView1.getText().toString());
                    num2=Double.parseDouble(txtView2.getText().toString());
                    multiplication = (num1) * (num2);
                    textView.setText(Double.toHexString(multiplication));
                }
                else if(test.equals("/")){
                    num1 =  Double.parseDouble(txtView1.getText().toString());
                    num2 = Double.parseDouble((txtView2.getText().toString()));
                    division = (num1) / (num2);
                    textView.setText(Double.toString(division));
                }
            }




        });
    }
}