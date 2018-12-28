package com.example.jason.finalpbo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungSatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_satu);

        TextView txtInput1 = (TextView) findViewById(R.id.text1);
        final EditText edtInput1 = (EditText) findViewById(R.id.input1);
        Button btnHitung = (Button) findViewById(R.id.hitung);
        String namaBangun = getIntent().getStringExtra("dataNamaBangun");

        if (namaBangun.equals("Persegi")){
            txtInput1.setText("Masukkan Sisi");
            btnHitung.setText("Hitung Luas");
            btnHitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txtHasil = (TextView) findViewById(R.id.hasil);
                    String sisi = edtInput1.getText().toString().trim();
                    double s = Double.parseDouble(sisi);
                    double hasil = (s*s);
                    txtHasil.setText("Hasil : "+hasil);
                }
            });
        }

        else if (namaBangun.equals("Lingkaran")){
            txtInput1.setText("Masukkan Jari-Jari");
            btnHitung.setText("Hitung Luas");
            btnHitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txtHasil = (TextView) findViewById(R.id.hasil);
                    String jarijari = edtInput1.getText().toString().trim();
                    double r = Double.parseDouble(jarijari);
                    double hasil = (3.14*r*r);
                    txtHasil.setText("Hasil : "+hasil);
                }
            });
        }

        else if (namaBangun.equals("Kubus")){
            txtInput1.setText("Masukkan Sisi");
            btnHitung.setText("Hitung Volume");
            btnHitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txtHasil = (TextView) findViewById(R.id.hasil);
                    String sisi = edtInput1.getText().toString().trim();
                    double s = Double.parseDouble(sisi);
                    double hasil = (s*s*s);
                    txtHasil.setText("Hasil : "+hasil);
                }
            });
        }

        else if (namaBangun.equals("Bola")){
            txtInput1.setText("Masukkan Jari-Jari");
            btnHitung.setText("Hitung Volume");
            btnHitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txtHasil = (TextView) findViewById(R.id.hasil);
                    String jarijari = edtInput1.getText().toString().trim();
                    double r = Double.parseDouble(jarijari);
                    double hasil = (double) 4/3 * 3.14 * r * r * r;
                    txtHasil.setText("Hasil : "+hasil);
                }
            });
        }

    }



}
