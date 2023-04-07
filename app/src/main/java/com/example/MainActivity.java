package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.mini_jeucalcul.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boutonJouer = findViewById(R.id.boutonJouer);
        boutonJouer.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, GameActivity.class);
            startActivity(intent);
        });

        Button boutonScores = findViewById(R.id.boutonScores);
        boutonScores.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Scores.class);
            startActivity(intent);
        });

        Button boutonPropos = findViewById(R.id.boutonPropos);
        boutonPropos.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Propos.class);
            startActivity(intent);
        });
    }
}