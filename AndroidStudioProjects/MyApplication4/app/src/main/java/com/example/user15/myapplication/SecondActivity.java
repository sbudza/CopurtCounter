package com.example.user15.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = (TextView) findViewById(R.id.text);

        Intent i = getIntent();

        String value = i.getStringExtra("data");

        text.setText(value);

    }
}
