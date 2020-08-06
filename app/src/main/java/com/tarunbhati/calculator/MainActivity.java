package com.tarunbhati.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edittext1, edittext2;
    private Button buttonSum,buttonSub,buttonMul,buttonDiv,buttonMod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMod = (Button) findViewById(R.id.b5);
        buttonMod.setOnClickListener(this);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        edittext1 = (EditText) findViewById(R.id.e1);
        edittext2 = (EditText) findViewById(R.id.e2);
        buttonSum = (Button) findViewById(R.id.b1);
        buttonSub = (Button) findViewById(R.id.b2);
        buttonMul = (Button) findViewById(R.id.b3);
        buttonDiv = (Button) findViewById(R.id.b4);



        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a+b;
                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a-b;
                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a*b;
                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                if(b==0){
                    Toast.makeText(getApplicationContext(),"Error: Divisor cannot be zero", Toast.LENGTH_LONG).show();
                }
                else{
                    int sum=a/b;
                    Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();

                }
            }
        });




    }
    public void onClick(View v){
        String value1=edittext1.getText().toString();
        String value2=edittext2.getText().toString();
        int a=Integer.parseInt(value1);
        int b=Integer.parseInt(value2);
        int sum=a%b;
        Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
    }
}
