package com.example.joker.aulaoo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText v1;
    EditText v2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.xBtn);
        v1 = (EditText) findViewById(R.id.xV1);
        v2 = (EditText) findViewById(R.id.xV2);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 try {


                     Random n = new Random();
                     int minimo = Integer.parseInt(v1.getText().toString());
                     int maximo = Integer.valueOf(v2.getText().toString());


                     String result = String.valueOf(n.nextInt(maximo - minimo) + minimo);
                     //Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                     Intent intencao = new Intent(MainActivity.this, Main2Activity.class);

                     intencao.putExtra("Resultado", result);
                     startActivity(intencao);

                 }catch (Exception e) {
                     Toast.makeText(MainActivity.this,"Informe um numero", Toast.LENGTH_LONG).show();
                 }

             }
         });

    }


}

