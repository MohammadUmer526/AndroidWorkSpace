package com.example.muhammadumer.hellotoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private int mCount=0;
    //private TextView mshowCount;
    private int mCount = 0;       //initialize variable for counting
    private TextView showCount;   // initialize variable for showing counting

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = (TextView) findViewById(R.id.show_count);     //show TextView(input count expilicitly)
        //  mshowCount = (TextView) findViewById(R.id.show_count);
    }
    
    /*public void countUp(View view){
        mCount++;
         if (mshowCount != null)
             mshowCount.setText(Integer.toString(mCount));
        //showToast();
    }
    public	void	showToast(View	view)	{
        //	Create	a	toast	show	it.
         Toast toast	=	Toast.makeText(MainActivity.this,"Value is : " + mshowCount.getText().toString() ,	Toast.LENGTH_LONG);
        toast.show();

    }*/


    public void counting(View view) { // method for checking number of count is happening or not
        mCount++;
        if (showCount != null)
            showCount.setText(Integer.toString(mCount));


    }


public void showToast(View view){  // method for toasting the count which take logic from "counting method"
    Toast ab = Toast.makeText(MainActivity.this, "Value is : " + showCount.getText().toString(), Toast.LENGTH_LONG);
}
}
