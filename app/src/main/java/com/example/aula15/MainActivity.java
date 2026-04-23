package com.example.aula15;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView txtStatus;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ratingBar = findViewById(R.id.rtbvotacao);
        txtStatus = findViewById(R.id.txtstatus);
        btnOk = findViewById(R.id.btnOk);

        btnOk.setOnClickListener(v -> {

            int estrelas = (int) ratingBar.getRating();
            String classificacao = "";

            switch (estrelas) {
                case 1:
                    classificacao = "Regular";
                    break;

                case 2:
                    classificacao = "Bom";
                    break;

                case 3:
                    classificacao = "Ótimo";
                    break;

                case 4:
                    classificacao = "Excelente";
                    break;

                case 5:
                    classificacao = "Espetacular";
                    break;
            }

            txtStatus.setText("Classificação: " + classificacao);

            Intent telaResultado = new Intent(MainActivity.this, ResultadoActivity.class);
            telaResultado.putExtra("nota", classificacao);
            startActivity(telaResultado);

        });
    }
}