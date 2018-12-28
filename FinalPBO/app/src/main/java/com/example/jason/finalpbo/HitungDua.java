package com.example.jason.finalpbo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungDua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_dua);

        TextView txtInput1 = (TextView) findViewById(R.id.text1);
        TextView txtInput2 = (TextView) findViewById(R.id.text2);
        final EditText edtInput1 = (EditText) findViewById(R.id.input1);
        final EditText edtInput2 = (EditText) findViewById(R.id.input2);
        Button btnHitung = (Button) findViewById(R.id.hitung);
        String namaBangun = getIntent().getStringExtra("dataNamaBangun");

        if (namaBangun.equals("Persegi Panjang")){
            txtInput1.setText("Masukkan Panjang");
            txtInput2.setText("Masukkan Lebar");
            btnHitung.setText("Hitung Luas");
            btnHitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txtHasil = (TextView) findViewById(R.id.hasil);
                    String panjang = edtInput1.getText().toString().trim();
                    String lebar = edtInput2.getText().toString().trim();
                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    double hasil = (p*l);
                    txtHasil.setText("Hasil : "+hasil);
                }
            });
        }

        else if (namaBangun.equals("Kerucut")){
            txtInput1.setText("Masukkan Jari-Jari Alas");
            txtInput2.setText("Masukkan Tinggi");
            btnHitung.setText("Hitung Volume");
            btnHitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txtHasil = (TextView) findViewById(R.id.hasil);
                    String jarijari = edtInput1.getText().toString().trim();
                    String tinggi = edtInput2.getText().toString().trim();
                    double r = Double.parseDouble(jarijari);
                    double t = Double.parseDouble(tinggi);
                    double hasil = (double) 1/3 * 3.14 * r * r * t;
                    txtHasil.setText("Hasil : "+hasil);
                }
            });
        }

    }
}
