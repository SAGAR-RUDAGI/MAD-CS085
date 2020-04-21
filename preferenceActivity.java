--------------------------------mypreferences.xml-------------------------------------
<?xml version="1.0" encoding="utf-8"?>
<PreferenceScreen xmlns:android="http://schemas.android.com/apk/res/android">
    <CheckBoxPreference
        android:key="mypreference_checkbox"
        android:title="Checkbox"
        android:defaultValue="false"
        android:summary="Change The CheckBox Status here, it will be saved in Preference"/>
</PreferenceScreen>

------------------------------activity_layout_b.xml---------------------------------
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android" android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        xmlns:tools="http://schemas.android.com/tools"
        android:id="@+id/activity_layout_b"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:padding="20dp"
        android:orientation="vertical"
        tools:context="com.example.madassignment.Activity_b">

    </LinearLayout>
</androidx.constraintlayout.widget.ConstraintLayout>

------------------------------Activity_b.java-----------------------------------------
package com.example.madassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Activity_b extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_layout_b);
        addPreferencesFromResource(R.xml.mypreferences);
    }
}

---------------------------activity_main.xml--------------------------------------------
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="This is MainActivity"
            android:textSize="30sp"/>

        <Button
            android:id="@+id/setpreference"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Go To B"
            android:textSize="30sp"
            android:onClick="loadActivityB"/>

    </LinearLayout>
</androidx.constraintlayout.widget.ConstraintLayout>

-------------------------------------MainActivity.java----------------------------------
package com.example.madassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loadActivityB(View v){
        Intent i=new Intent(MainActivity.this, Activity_b.class);
        startActivity(i);
    }
}
