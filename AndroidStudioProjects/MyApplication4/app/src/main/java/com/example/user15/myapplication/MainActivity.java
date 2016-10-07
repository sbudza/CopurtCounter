package com.example.user15.myapplication;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity
{
    EditText input;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.simon);
        click = (Button) findViewById(R.id.button);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String data= input.getText().toString();

                Intent i = new Intent(MainActivity.this,SecondActivity.class);

                i.putExtra("data",data);

                startActivity(i);
            }
        });

    }

    public void next(View n)
    {
        String data= input.getText().toString();

        Intent i = new Intent(MainActivity.this,SecondActivity.class);

        i.putExtra("data",data);

        startActivity(i);
    }
}
