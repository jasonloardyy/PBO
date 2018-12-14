package com.example.jason.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView etBil1 = (EditText) findViewById(R.id.bil1);
        final TextView etBil2 = (EditText) findViewById(R.id.bil2);
        Button btJumlah = (Button) findViewById(R.id.jumlah);
        Button btKurang = (Button) findViewById(R.id.kurang);

        btJumlah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String bil1 = etBil1.getText().toString().trim();
                String bil2 = etBil2.getText().toString().trim();

                double b1 = Double.parseDouble(bil1);
                double b2 = Double.parseDouble(bil2);

                double hasil = b1+b2;

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("hasil",Double.toString(hasil));
                startActivity(intent);
            }
        });

        btKurang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String bil1 = etBil1.getText().toString().trim();
                String bil2 = etBil2.getText().toString().trim();

                double b1 = Double.parseDouble(bil1);
                double b2 = Double.parseDouble(bil2);

                double hasil = b1-b2;

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("hasil",Double.toString(hasil));
                startActivity(intent);
            }
        });

    }
}
