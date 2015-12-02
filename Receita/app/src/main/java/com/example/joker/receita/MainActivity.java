package com.example.joker.receita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnAddRec;
    Button btnListar;
    Button btnAtualizar;
    Button btnExcluir;
   public static ArrayList<Receita> rec = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddRec = (Button) findViewById(R.id.btnAddRec);
        btnListar = (Button) findViewById(R.id.btnListar);
        btnAtualizar = (Button) findViewById(R.id.btnAtualizar);
        btnExcluir = (Button) findViewById(R.id.btnExcluir);
    }
}
