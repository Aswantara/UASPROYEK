package com.example.projectuas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projectuas.model.Cup;

public class ProfilActivity extends AppCompatActivity {

    Cup cup;
    TextView txJudul,txJenis,txAsal,txDeskripsi;
    ImageView ivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        cup = (Cup) intent.getSerializableExtra(DaftarNegaraActivity.HEWAN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(cup);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarNegara);
    }


    private void tampilkanProfil(Cup cup) {
        Log.d("Profil","Menampilkan "+ cup.getJenis());
        txJudul.setText(cup.getJenis());
        txJenis.setText(cup.getRas());
        txAsal.setText(cup.getAsal());
        txDeskripsi.setText(cup.getDeskripsi());
        ivFotoHewan.setImageDrawable(this.getDrawable(cup.getDrawableRes()));
    }




}