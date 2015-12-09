package com.example.joker.receita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ListView listView;
    Button btnAddRec;
    public static ArrayList<Receita> rec = new ArrayList<>();
    ReceitaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddRec = (Button) findViewById(R.id.btnAddRec);
        listView = (ListView)findViewById(R.id.lvReceita);

        adapter = new ReceitaAdapter(this, R.layout.activity_receita_adapter,rec);
        listView.setAdapter(adapter);

        btnAddRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add = new Intent(MainActivity.this, AddReceit.class);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}