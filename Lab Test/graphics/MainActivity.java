package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner color = (Spinner)findViewById(R.id.color);
        final Spinner shape = (Spinner)findViewById(R.id.shape);

        final RadioGroup rg = (RadioGroup)findViewById(R.id.radiogroup);

        Button submit = (Button)findViewById(R.id.button);

        String[] colors = new String[]{"Red", "Blue", "Green"};
        String[] shapes = new String[]{"Circle", "Oval", "Triangle", "Rectangle"};

        ArrayAdapter<String> a = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, colors);
        color.setAdapter(a);

        ArrayAdapter<String> a1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, shapes);
        shape.setAdapter(a1);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioID = rg.getCheckedRadioButtonId();
                RadioButton r = (RadioButton)findViewById(radioID);
                String fill = (String) r.getText();

                String c, s;
                c = color.getSelectedItem().toString();
                s = shape.getSelectedItem().toString();

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("COLOR", c);
                i.putExtra("SHAPE", s);
                i.putExtra("FILL", fill);

                startActivity(i);
            }
        });
    }
}
