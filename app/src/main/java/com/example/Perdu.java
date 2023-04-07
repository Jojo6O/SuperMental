package com.example;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mini_jeucalcul.R;

public class Perdu extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_perdu);

            Button boutonRecommencer = findViewById(R.id.boutonRecommencer);
            boutonRecommencer.setOnClickListener(view -> {
                Intent intent = new Intent(Perdu.this, GameActivity.class);
                startActivity(intent);
            });

            Button boutonScores = findViewById(R.id.boutonScores2);
            boutonScores.setOnClickListener(view -> {
                Intent intent = new Intent(Perdu.this, Scores.class);
                startActivity(intent);
            });

            Button boutonQuitter = findViewById(R.id.boutonQuitter);
            boutonQuitter.setOnClickListener(view -> {
                Intent intent = new Intent(Perdu.this, MainActivity.class);
                startActivity(intent);
            });
        }

    }
