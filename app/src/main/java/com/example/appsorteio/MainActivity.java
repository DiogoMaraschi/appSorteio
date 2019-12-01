package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random random = new Random();

        Button botao = findViewById(R.id.button);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int nSorteado;

                EditText numeroInicial = findViewById(R.id.numero_inicial);
                EditText numeroFinal = findViewById(R.id.numero_final);

                int num1 = Integer.parseInt(String.valueOf(numeroInicial.getText()));
                int num2 = Integer.parseInt(String.valueOf(numeroFinal.getText()));

                nSorteado = random.nextInt((num2 - num1) + 1) + num1;

                String sorteio = Integer.toString(nSorteado);

                TextView resultadoFinal = (TextView) findViewById(R.id.resultado);

                resultadoFinal.setText(sorteio);

            }

        });
    }
}