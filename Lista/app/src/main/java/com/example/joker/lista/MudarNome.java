package com.example.joker.lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MudarNome extends AppCompatActivity {
    EditText edtNomeM;
    Button btnAt;
    Button btnDel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudar_nome);

        edtNomeM = (EditText)findViewById(R.id.edtNomeM);
        btnAt = (Button)findViewById(R.id.btnAt);
        btnDel = (Button)findViewById(R.id.btnDel);

        final Bundle extras = getIntent().getExtras();
        final int id = extras.getInt("id");
        edtNomeM.setText(MainActivity.alunos.get(id).toString());


        btnAt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String novoAluno = edtNomeM.getText().toString();
                MainActivity.alunos.set(id, novoAluno);


            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.alunos.remove(id);
                onBackPressed();

            }
        });


    }
}
