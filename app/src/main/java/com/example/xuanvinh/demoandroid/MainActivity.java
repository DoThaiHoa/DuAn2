package com.example.xuanvinh.demoandroid;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void doSignup(View v)
    {
        Intent i = new Intent(MainActivity.this, SignupActivity.class);
        startActivity(i);
    }

    public void doLogin(View v)
    {
        Intent i = new Intent(MainActivity.this,UiMychat.class);
        startActivity(i);
    }
}
