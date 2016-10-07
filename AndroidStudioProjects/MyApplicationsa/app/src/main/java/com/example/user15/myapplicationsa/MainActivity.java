package com.example.user15.myapplicationsa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup gender;
    RadioButton selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gender = (RadioGroup) findViewById(R.id.rdg_gender);

        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) findViewById(checkedId);
                String data = selected.getText().toString();
                Toast.makeText(MainActivity.this, "You Selected : "+data, Toast.LENGTH_LONG).show();
            }
        });

    }
}
