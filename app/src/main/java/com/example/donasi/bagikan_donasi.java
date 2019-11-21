package com.example.donasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bagikan_donasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagikan_donasi);
    }

    public void buatdonasi(View view) {
        Intent buatdonasi = new Intent(bagikan_donasi.this, buatdonasi.class);
        startActivity(buatdonasi);
    }
}
