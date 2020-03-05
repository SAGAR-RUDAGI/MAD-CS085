package com.example.myapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView t1,t2,t3;
    String name,reg,dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1= (TextView) findViewById(R.id.textView);
        t2= (TextView) findViewById(R.id.textView2);
        t3= (TextView) findViewById(R.id.textView3);

        Intent i = getIntent();

        name = i.getStringExtra("Name");
        reg = i.getStringExtra("USN");
        dept = i.getStringExtra("Branch");

        t1.setText(name);
        t2.setText(reg);
        t3.setText(dept);

    }

}
