package com.example.jason.finalpbo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bangunDatar(View view){
        Intent intent = new Intent(this,ListBangunDatar.class);
        startActivity(intent);
    }

    public void bangunRuang(View view){
        Intent intent = new Intent(this,ListBangunRuang.class);
        startActivity(intent);
    }

}
