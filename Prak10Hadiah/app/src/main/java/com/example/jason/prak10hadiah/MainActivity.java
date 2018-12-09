package com.example.jason.prak10hadiah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtJariAlas,edtTinggi;
    private TextView txtVolume;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Menghitung Volume Kerucut");

        edtJariAlas = (EditText) findViewById(R.id.jarialas);
        edtTinggi = (EditText) findViewById(R.id.tinggi);
        btnHitung = (Button) findViewById(R.id.hitung);
        txtVolume = (TextView) findViewById(R.id.volume);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jarialas = edtJariAlas.getText().toString().trim();
                String tinggi = edtTinggi.getText().toString().trim();

                double r = Double.parseDouble(jarialas);
                double t = Double.parseDouble(tinggi);

                double volume = (3.14*r*r*t)/3;
                txtVolume.setText("Volume Kerucut = "+volume);
            }
        });

    }
}
