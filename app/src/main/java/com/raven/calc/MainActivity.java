package com.raven.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    Button buttonEq, button1, button2, button3, button4, button5, button6, button7, button8, button9,
    button0, buttonTch, buttonDell, buttonSum, buttonMin, buttonMul, buttonDiv;
    TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.result);

        buttonEq = findViewById(R.id.equ);
        button0 = findViewById(R.id.b0);
        button1 = findViewById(R.id.b1);
        button2 = findViewById(R.id.b2);
        button3 = findViewById(R.id.b3);
        button4 = findViewById(R.id.b4);
        button5 = findViewById(R.id.b5);
        button6 = findViewById(R.id.b6);
        button7 = findViewById(R.id.b7);
        button8 = findViewById(R.id.b8);
        button9 = findViewById(R.id.b9);
        buttonTch = findViewById(R.id.tch);
        buttonDell = findViewById(R.id.dell);
        buttonSum = findViewById(R.id.sum);
        buttonMin = findViewById(R.id.min);
        buttonMul = findViewById(R.id.mul);
        buttonDiv = findViewById(R.id.div);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);

        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "0");

            }
        });button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "1");

            }
        });button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "2");

            }
        });button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "3");

            }
        });button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "4");

            }
        });button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "5");

            }
        });button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "6");

            }
        });button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "7");

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "8");

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "9");

            }
        });
        buttonTch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });buttonDell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText().toString();
                editText2.getText().toString();
                double n1 = Double.valueOf(editText.getText().toString());
                double n2 = Double.valueOf(editText2.getText().toString());
                double n3;
                n3 = n1-n2;
                textView.setText(String.valueOf(n3));


            }
        });buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText().toString();
                editText2.getText().toString();
                double n1 = Double.valueOf(editText.getText().toString());
                double n2 = Double.valueOf(editText2.getText().toString());
                double n3;
                n3 = n1+n2;
                textView.setText(String.valueOf(n3));



            }
        });buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText().toString();
                editText2.getText().toString();
                double n1 = Double.valueOf(editText.getText().toString());
                double n2 = Double.valueOf(editText2.getText().toString());
                double n3;
                n3 = n1*n2;
                textView.setText(String.valueOf(n3));

            }
        });buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText().toString();
                editText2.getText().toString();
                double n1 = Double.valueOf(editText.getText().toString());
                double n2 = Double.valueOf(editText2.getText().toString());
                double n3;
                n3 = n1/n2;
                textView.setText(String.valueOf(n3));

            }
        });



        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });









    }
}
