package com.example.joker.lista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<String> alunos = new ArrayList<>();
    Button btnAdd;
    EditText edtNome;
    ListView lvAlunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText)findViewById(R.id.edtNome);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        lvAlunos = (ListView)findViewById(R.id.lvAlunos);


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line);
        lvAlunos.setAdapter(adapter);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtNome.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Nome vazio", Toast.LENGTH_SHORT).show();
                } else {
                    alunos.add(edtNome.getText().toString());
                    Toast.makeText(MainActivity.this, edtNome.getText().toString(), Toast.LENGTH_SHORT).show();
                    edtNome.setText("");
                    adapter.notifyDataSetChanged();
                }

            }
        });
        lvAlunos.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valor = (String) parent.getAdapter().getItem(position);
                lvAlunos.setAdapter(adapter);
                Toast.makeText(MainActivity.this, valor, Toast.LENGTH_SHORT).show();

                int p=alunos.indexOf(valor);
                Intent intecao = new Intent(MainActivity.this, MudarNome.class);
                intecao.putExtra("id", p);
                startActivity(intecao);
            }
        });



    }
}
