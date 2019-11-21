package com.example.donasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class buatdonasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buatdonasi);
    }

    public void detail1(View view) {
        Intent detail1 = new Intent(buatdonasi.this,detail1.class);
        startActivity(detail1);
    }
}
