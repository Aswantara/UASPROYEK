package com.example.projectuas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton btnEuro,btnCopa,btnAfc;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnEuro = findViewById(R.id.btn_euro);
        btnCopa = findViewById(R.id.btn_copa);
        btnAfc = findViewById(R.id.btn_afc);
        btnEuro.setOnClickListener(view -> bukaGaleri("Euro"));
        btnCopa.setOnClickListener(view -> bukaGaleri("Copa"));
        btnAfc.setOnClickListener(view -> bukaGaleri("AFC"));
    }

    private void bukaGaleri(String jenisNegara) {
        Log.d("MAIN","Buka activity cup");
        Intent intent = new Intent(this, DaftarNegaraActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisNegara);
        startActivity(intent);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, Euro.class);
        startActivity(intent);
    }
}