package com.example.android.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    private EditText edt_height;
    private RadioButton edt_rbn1;
    private RadioButton edt_rbn2;
    private RadioButton edt_rbn3;
    private RadioButton edt_rbn4;
    private RadioButton edt_rbn5;
    private RadioButton edt_rbn6;
    private double height;
    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_height = (EditText) findViewById(R.id.edt_height);
        edt_rbn1 = (RadioButton) findViewById(R.id.rdb1);
        edt_rbn2 = (RadioButton) findViewById(R.id.rdb2);
        edt_rbn3 = (RadioButton) findViewById(R.id.rdb3);
        edt_rbn4 = (RadioButton) findViewById(R.id.rdb4);
        edt_rbn5 = (RadioButton) findViewById(R.id.rdb5);
        edt_rbn6 = (RadioButton) findViewById(R.id.rdb6);
        group = (RadioGroup) findViewById(R.id.rgp);

    }

    public void onRadioButtonClicked( View view)
    {
        height = Double.parseDouble(edt_height.getText().toString());

        String w = "";
        String temp;
        double bmi;


        double weight;

        if(edt_rbn1.isChecked())
        {

            w = edt_rbn1.getText().toString();

            temp = w.substring(w.lastIndexOf(" "));

            weight = Double.parseDouble(temp);

            bmi = weight / (height * height);

            Toast.makeText(MainActivity.this,""+ bmi, Toast.LENGTH_LONG).show();

        }
        else if(edt_rbn2.isChecked())
        {
            w = edt_rbn2.getText().toString();

            temp = w.substring(w.lastIndexOf(" "));

            weight = Double.parseDouble(temp);

            bmi = weight / (height * height);

            Toast.makeText(MainActivity.this,""+ bmi, Toast.LENGTH_LONG).show();

        }
        else if(edt_rbn3.isChecked())
        {
            w = edt_rbn3.getText().toString();

            temp = w.substring(w.lastIndexOf(" "));

            weight = Double.parseDouble(temp);

            bmi = weight / (height * height);

            Toast.makeText(MainActivity.this,""+ bmi, Toast.LENGTH_LONG).show();

        }
        else if(edt_rbn4.isChecked())
        {
            w = edt_rbn4.getText().toString();

            temp = w.substring(w.lastIndexOf(" "));

            weight = Double.parseDouble(temp);

            bmi = weight / (height * height);

            Toast.makeText(MainActivity.this,""+ bmi, Toast.LENGTH_LONG).show();

        }
        else if(edt_rbn5.isChecked())
        {
            w = edt_rbn5.getText().toString();

            temp = w.substring(w.lastIndexOf(" "));

            weight = Double.parseDouble(temp);

            bmi = weight / (height * height);

            Toast.makeText(MainActivity.this,""+ bmi, Toast.LENGTH_LONG).show();

        }
        else
        {
            w = edt_rbn6.getText().toString();

            temp = w.substring(w.lastIndexOf(" "));

            weight = Double.parseDouble(temp);

            bmi = weight / (height * height);

            Toast.makeText(MainActivity.this,""+ bmi, Toast.LENGTH_LONG).show();


        }


    }
}
