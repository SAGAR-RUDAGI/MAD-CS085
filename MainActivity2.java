package com.example.myfirstlabprogram;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    int ch = 1;
    float font = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t = (TextView) findViewById(R.id.textView);
        final EditText e1 = (EditText) findViewById(R.id.editText);
        final EditText e2 = (EditText) findViewById(R.id.editText2);
        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());
                int res = n1+n2;
                t.setText(Integer.toString(res));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());
                int res = n1-n2;
                t.setText(Integer.toString(res));

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());
                int res = n1 * n2;
                t.setText(Integer.toString(res));

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());
                float res = n1/n2;
                t.setText(Float.toString(res));

            }
        });

    }
}
