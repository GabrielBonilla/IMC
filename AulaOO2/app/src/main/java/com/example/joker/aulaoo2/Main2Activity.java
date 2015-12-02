package com.example.joker.aulaoo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        resultado =(TextView) findViewById(R.id.xResultado);
        resultado.setText(getIntent().getExtras().getString(Resultado));
    }
}
