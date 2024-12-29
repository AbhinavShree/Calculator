package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText textbox1, textbox2 , output;
    Button addition, division,multiplication,subtraction;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textbox1 = (EditText) findViewById(R.id.textbox1);
        textbox2 = (EditText) findViewById(R.id.textbox2);
        output = (EditText) findViewById(R.id.output);
        addition = (Button) findViewById(R.id.addition);
        division = (Button) findViewById(R.id.division);
        multiplication = (Button) findViewById(R.id.multiplication);
        subtraction = (Button) findViewById(R.id.subtraction);

        addition.setOnClickListener(new View.OnClickListener() { // Addition
            @Override
            public void onClick(View view) {
                output.getText().clear();
                if(textbox1.getText().toString().isEmpty() | textbox2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Valid Number", Toast.LENGTH_SHORT).show();
                }
                else {
                    String a = textbox1.getText().toString();
                    String b = textbox2.getText().toString();
                    int total = Integer.parseInt(a) + Integer.parseInt(b);
                    output.setText(""+total+"");
                    Toast.makeText(MainActivity.this, "Addition is "+total, Toast.LENGTH_SHORT).show();
                    textbox1.setText("");
                    textbox2.setText("");
                }

            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() { // Addition
            @Override
            public void onClick(View view) {
                output.getText().clear();
                if(textbox1.getText().toString().isEmpty() | textbox2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Valid Number", Toast.LENGTH_SHORT).show();
                }
                else {
                    String a = textbox1.getText().toString();
                    String b = textbox2.getText().toString();
                    int total = Integer.parseInt(a) * Integer.parseInt(b);
                    output.setText("" + total + "");
                    Toast.makeText(MainActivity.this, "Multiplication is " + total, Toast.LENGTH_SHORT).show();
                    textbox1.setText("");
                    textbox2.setText("");
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() { // Addition
            @Override
            public void onClick(View view) {
                output.getText().clear();
                if(textbox1.getText().toString().isEmpty() | textbox2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Valid Number", Toast.LENGTH_SHORT).show();
                }
                else {
                    String a = textbox1.getText().toString();
                    String b = textbox2.getText().toString();
                    int total = Integer.parseInt(a) / Integer.parseInt(b);
                    output.setText("" + total + "");
                    Toast.makeText(MainActivity.this, "Division is " + total, Toast.LENGTH_SHORT).show();
                    textbox1.setText("");
                    textbox2.setText("");
                }

            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() { // Addition
            @Override
            public void onClick(View view) {
                output.getText().clear();
                if(textbox1.getText().toString().isEmpty() | textbox2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Valid Number", Toast.LENGTH_SHORT).show();
                }
                else {
                    String a = textbox1.getText().toString();
                    String b = textbox2.getText().toString();
                    int total = Integer.parseInt(a) - Integer.parseInt(b);
                    output.setText("" + total + "");
                    Toast.makeText(MainActivity.this, "Subtraction is " + total, Toast.LENGTH_SHORT).show();
                    textbox1.setText("");
                    textbox2.setText("");
                }
            }
        });

    }
}