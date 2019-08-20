package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mainactivity.asmaul_husna.Asmaul_Husna_Main;
import com.example.mainactivity.jadwalsolat.Jadwal_Sholat;
import com.example.mainactivity.produk_halal.Produk_Halal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.jadwal_sholat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Jadwal_Sholat.class));
            }
        });
        findViewById(R.id.asmaulhusna).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Asmaul_Husna_Main.class));
            }
        });
        findViewById(R.id.produk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Produk_Halal.class));
            }
        });
        findViewById(R.id.ciprofil).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Profil.class ));
            }
        });
    }
}
