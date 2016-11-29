package com.example.oliinyk.lab5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public TextView text1;
    public Button button1;
    public EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.editText);
        text1 = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(obr);

    }
    OnClickListener obr = new OnClickListener() {
        public void onClick(View v) {
            String col = edit1.getText().toString();
            text1.setText(" ");
            if(col.isEmpty()) {
                text1.setText("Print color!");
            }
            else {
                text1.setText("The sky is " + col + "!");
            }
        }
    };

    OnClickListener clc = new OnClickListener(){
        public void onClick(View c) {
            edit1.setText(null);
            text1.setText("Print color!");
        }
    };
}
