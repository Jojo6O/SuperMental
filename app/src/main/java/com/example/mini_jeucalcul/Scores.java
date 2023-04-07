package com.example.mini_jeucalcul;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Scores extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        Button boutonQuitter = findViewById(R.id.boutonQuitter2);
        boutonQuitter.setOnClickListener(view -> {
            Intent intent = new Intent(Scores.this,MainActivity.class);
            startActivity(intent);
        });
    }
}
