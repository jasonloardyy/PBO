package com.example.jason.finalpbo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListBangunRuang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bangun_ruang);
    }

    public void kubus(View view){
        Bundle bundle = new Bundle();
        bundle.putInt("dataGambar", R.drawable.kubus);
        bundle.putString("dataNamaBangun", "Kubus");
        bundle.putString("dataRumus", "Rumus Volume : Sisi x Sisi x Sisi");
        bundle.putString("dataTxtHitung", "Hitung Volume");
        Intent intent = new Intent(this,BangunDetail.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void kerucut(View view){
        Bundle bundle = new Bundle();
        bundle.putInt("dataGambar", R.drawable.kerucut);
        bundle.putString("dataNamaBangun", "Kerucut");
        bundle.putString("dataRumus", "Rumus Volume : 1/3 x 3.14 x Jari x Jari x Tinggi");
        bundle.putString("dataTxtHitung", "Hitung Volume");
        Intent intent = new Intent(this,BangunDetail.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void bola(View view){
        Bundle bundle = new Bundle();
        bundle.putInt("dataGambar", R.drawable.bola);
        bundle.putString("dataNamaBangun", "Bola");
        bundle.putString("dataRumus", "Rumus Volume : 4/3 x 3.14 x Jari x Jari x Jari");
        bundle.putString("dataTxtHitung", "Hitung Volume");
        Intent intent = new Intent(this,BangunDetail.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
