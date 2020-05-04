package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText t1 = (EditText)findViewById(R.id.editText);
        final EditText t2 = (EditText)findViewById(R.id.editText2);
        final EditText t3 = (EditText)findViewById(R.id.editText3);

        Button b = (Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);

                String s1 = t1.getText().toString();
                String s2 = t2.getText().toString();
                String s3 = t3.getText().toString();

                intent.putExtra("Name",s1);
                intent.putExtra("USN",s2);
                intent.putExtra("Branch",s3);

                startActivity(intent);

            }
        });

    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

SecondActivity.java

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

////////////////////////////////////////////////////////////////////////////////
AndroidManifest.xml

<activity android:name=".SecondActivity"
            android:parentActivityName=".MainActivity">
            <!-- The meta-data tag is required if you support API level 15 and lower -->
            <meta-data
                android:name="android.support.PARENT_ACTIVITY"
                android:value=".MainActivity" />
 </activity>
