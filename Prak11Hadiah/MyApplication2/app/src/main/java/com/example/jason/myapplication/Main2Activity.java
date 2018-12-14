package com.example.jason.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tvHasil = (TextView) findViewById(R.id.hasil);

        tvHasil.setText("Hasil nya adalah " + getIntent().getStringExtra("hasil"));
    }
}
