package com.example.mini_jeucalcul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Propos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propos);

        Button boutonRetour = findViewById(R.id.boutonRetour);
        boutonRetour.setOnClickListener(view -> {
            Intent intent = new Intent(Propos.this,MainActivity.class);
            startActivity(intent);
        });
    }

}