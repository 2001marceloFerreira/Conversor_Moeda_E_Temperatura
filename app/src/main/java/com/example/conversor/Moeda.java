package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class Moeda extends AppCompatActivity {

    Button botaoVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda);

       botaoVoltar= findViewById(R.id.voltar);

       botaoVoltar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               finish();
           }
       });
    }

    public void converter(View view) {

        EditText editReal;
        TextView TextResultDolar;
        TextView TextResultEuro;
        TextView TextResultChile;
        TextView TextResultBitcoin;

        editReal = findViewById(R.id.editReal);
        TextResultDolar = findViewById(R.id.textResultDolar);
        TextResultEuro = findViewById(R.id.textResultEuro);
        TextResultChile = findViewById(R.id.textResultChile);
        TextResultBitcoin = findViewById(R.id.textResultBitcoin);

        double valorReal = Double.parseDouble(editReal.getText().toString());
        DecimalFormat df = new DecimalFormat("###.##");

        double valorConvertidoDolar = valorReal / 4.96;
        double valorConvertidoEuro = valorReal / 5.25;
        double valorConvertidoChile = valorReal * 170.64;
        double valorConvertidoBitcoin = (valorReal / 194494.71);

        TextResultDolar.setText("Valor em dolar US$ = " + df.format(valorConvertidoDolar) + " USD");
        TextResultEuro.setText("Valor em Euro € = " + df.format(valorConvertidoEuro) + " EUR");
        TextResultChile.setText("Valor em peso chileno = " + df.format(valorConvertidoChile) + " CLP");
        TextResultBitcoin.setText("Valor em Bitcoin ฿ = " + df.format(valorConvertidoBitcoin) + " BTC");

    }
}
