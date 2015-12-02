package com.example.joker.imc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class IMC extends ActionBarActivity {
    TextView imc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        imc = (TextView) findViewById(R.id.txtIMC);
        imc.setText(getIntent().getExtras().getString("Imc"));
        double result = Double.parseDouble(imc.getText().toString());
        if(result < 20.7){
            Toast.makeText(IMC.this, "Abaixo do peso ideal(Se for homem)", Toast.LENGTH_SHORT).show();
        }else
        if(result >= 20.8 && result <= 26.4){
            Toast.makeText(IMC.this, "No peso ideal(Se for homem)", Toast.LENGTH_SHORT).show();
        }else
        if(result >= 26.5 && result <= 27.8){
            Toast.makeText(IMC.this, "Um pouco acima do pseo peso ideal(Se for homem)", Toast.LENGTH_SHORT).show();
        }
        else
        if(result >= 27.9 && result <= 31.1){
            Toast.makeText(IMC.this, "Acima do peso ideal(Se for homem)", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(IMC.this, "Obeso(Se for homem)", Toast.LENGTH_SHORT).show();
        }
    }
}
