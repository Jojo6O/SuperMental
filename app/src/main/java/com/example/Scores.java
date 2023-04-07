package com.example;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.DAO.CalculBaseHelper;
import com.example.DAO.CalculDAO;
import com.example.mini_jeucalcul.R;
import com.example.mini_jeucalcul.model.entities.Score;

public class Scores extends AppCompatActivity {
    private CalculDAO calculDao;
    TextView textViewScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        calculDao = new CalculDAO(new CalculBaseHelper(this, "BDD", 1));
        Score monScore = calculDao.lastOrNull();
        if (monScore == null) {
            Toast.makeText(this, "Aucun score trouvé", Toast.LENGTH_SHORT).show();
        } else {
            textViewScore = findViewById(R.id.Score);
            textViewScore.setText(String.valueOf(monScore.getScore()));
        }

        Button boutonQuitter = findViewById(R.id.boutonQuitter2);
        boutonQuitter.setOnClickListener(view -> {
            Intent intent = new Intent(Scores.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
