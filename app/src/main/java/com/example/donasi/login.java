package com.example.donasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void bagikandonasi(View view) {
        Intent bagikandonasi = new Intent(login.this,bagikan_donasi.class);
        startActivity(bagikandonasi);
    }
}
