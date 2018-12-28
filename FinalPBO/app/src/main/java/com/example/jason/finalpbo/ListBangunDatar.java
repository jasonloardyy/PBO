package com.example.jason.finalpbo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListBangunDatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bangun_datar);
    }

    public void persegi(View view){
        Bundle bundle = new Bundle();
        bundle.putInt("dataGambar", R.drawable.persegi);
        bundle.putString("dataNamaBangun", "Persegi");
        bundle.putString("dataRumus", "Rumus Luas : Sisi x Sisi");
        bundle.putString("dataTxtHitung", "Hitung Luas");
        Intent intent = new Intent(this,BangunDetail.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void persegiPanjang(View view){
        Bundle bundle = new Bundle();
        bundle.putInt("dataGambar", R.drawable.persegi_panjang);
        bundle.putString("dataNamaBangun", "Persegi Panjang");
        bundle.putString("dataRumus", "Rumus Luas : Panjang x Lebar");
        bundle.putString("dataTxtHitung", "Hitung Luas");
        Intent intent = new Intent(this,BangunDetail.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void lingkaran(View view){
        Bundle bundle = new Bundle();
        bundle.putInt("dataGambar", R.drawable.lingkaran);
        bundle.putString("dataNamaBangun", "Lingkaran");
        bundle.putString("dataRumus", "Rumus Luas : 3.14 x Jari x Jari");
        bundle.putString("dataTxtHitung", "Hitung Luas");
        Intent intent = new Intent(this,BangunDetail.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
