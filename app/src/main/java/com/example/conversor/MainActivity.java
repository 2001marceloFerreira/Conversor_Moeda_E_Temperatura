package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaoMoeda;
    Button botaoTemperatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoMoeda = findViewById(R.id.bt_moeda);
        botaoTemperatura = findViewById(R.id.bt_temperatura);

        botaoMoeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Moeda.class);
                startActivity(intent);
            }
        });

        botaoTemperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Temperatura.class);
                startActivity(intent);
            }
        });

    }

}