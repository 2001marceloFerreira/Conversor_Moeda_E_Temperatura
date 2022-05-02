package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Temperatura extends AppCompatActivity {
    /*EditText et_tempC;
    TextView TxtFah;
    TextView TxtKel;
    Button bt_convert; */

    Button finalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        finalizar = findViewById(R.id.bt_voltar);

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

      /*  et_tempC = findViewById(R.id.et_tempC);
        TxtFah = findViewById(R.id.txtFah);
        TxtKel = findViewById(R.id.txtKel);

        bt_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tempC = Double.parseDouble(et_tempC.getText().toString());
                double tempF = (tempC * 1.8) + 32;

                TxtFah.setText("Temperatura em Fahrenheit = " + tempF);
            }
        }); */
    }

    public void Convert(View view){

        EditText et_tempC;
        TextView TxtFah;
        TextView TxtKel;
        Button bt_convert;

        et_tempC = findViewById(R.id.et_tempC);
        TxtFah = findViewById(R.id.txtFah);
        TxtKel = findViewById(R.id.txtKel);

        //DecimalFormat arredondar = new DecimalFormat("#.##");
        double tempC = Double.parseDouble(et_tempC.getText().toString());

        double tempF = (tempC * 1.8) + 32;
        double tempK = tempC + 273.15;

        TxtFah.setText("Temperatura Fahrenheit = " + tempF + " ºF");
        TxtKel.setText("Temperatura em Kelvin = " + tempK + " K");
    }

}