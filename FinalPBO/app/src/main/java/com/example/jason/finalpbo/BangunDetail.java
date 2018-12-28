package com.example.jason.finalpbo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class BangunDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun_detail);

        ImageView imgBangun = (ImageView) findViewById(R.id.gambarBangun);
        TextView txtNamaBangun = (TextView) findViewById(R.id.namaBangun);
        TextView txtRumus = (TextView) findViewById(R.id.rumus);
        Button btnHitung = (Button) findViewById(R.id.menuHitung);

        Bundle bundle = getIntent().getExtras();
        imgBangun.setImageResource(bundle.getInt("dataGambar"));
        txtNamaBangun.setText(bundle.getString("dataNamaBangun"));
        txtRumus.setText(bundle.getString("dataRumus"));
        btnHitung.setText(bundle.getString("dataTxtHitung"));
    }

    public void menuHitung(View view){
        TextView txtNamaBangun = (TextView) findViewById(R.id.namaBangun);

        String[] HitungSatu = {"Persegi", "Lingkaran", "Kubus", "Bola"};
        if (Arrays.asList(HitungSatu).contains(txtNamaBangun.getText().toString())){
            Intent intent = new Intent(this, HitungSatu.class);
            intent.putExtra("dataNamaBangun",txtNamaBangun.getText().toString());
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, HitungDua.class);
            intent.putExtra("dataNamaBangun",txtNamaBangun.getText().toString());
            startActivity(intent);
        }

    }

}
