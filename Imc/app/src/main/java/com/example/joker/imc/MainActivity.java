package com.example.joker.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.*;
import android.view.*;




public class MainActivity extends AppCompatActivity  {
    EditText edtAltura;
    EditText edtPeso;
    Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAltura = (EditText) findViewById(R.id.edtAltura);
        edtPeso = (EditText) findViewById(R.id.edtPeso);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular(view);
            }
        });
    }

        public void calcular(View v){
            try {
                float pe = Float.parseFloat(edtPeso.getText().toString());
                float al = Float.parseFloat(edtAltura.getText().toString());

                String imc = String.valueOf(pe  /(al + al));

                Intent intencao = new Intent(MainActivity.this, IMC.class);

                intencao.putExtra("Imc", imc);
                startActivity(intencao);


            }catch (Exception e){
                Toast.makeText(MainActivity.this,"Digite altura E peso", Toast.LENGTH_LONG).show();
            }



    }



    }

