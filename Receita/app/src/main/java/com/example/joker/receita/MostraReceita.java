package com.example.joker.receita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MostraReceita extends AppCompatActivity {
    Button btnAtualizar;
    Button btnEx;
    EditText edtNome;
    EditText edtIng1;
    EditText edtIng2;
    EditText edtIng3;
    EditText edtModo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_receita);

        btnAtualizar = (Button) findViewById(R.id.btnAtualiar);
        btnEx = (Button) findViewById(R.id.btnEx);
        edtNome = (EditText) findViewById(R.id.edtNome);
        edtIng1 = (EditText) findViewById(R.id.edtIng1);
        edtIng2 = (EditText) findViewById(R.id.edtIng2);
        edtIng3 = (EditText) findViewById(R.id.edtIng3);
        edtModo = (EditText) findViewById(R.id.edtModo);

        final Bundle extra = getIntent().getExtras();
        final int x = extra.getInt("x");

        btnAtualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtNome.getText().toString().isEmpty() || edtIng1.getText().toString().isEmpty() || edtIng2.getText().toString().isEmpty() || edtIng3.getText().toString().isEmpty() || edtModo.getText().toString().isEmpty()) {
                    Toast.makeText(MostraReceita.this, "Informe corretamente", Toast.LENGTH_SHORT).show();
                } else {
                    Receita novo = new Receita (edtNome.getText().toString(), edtIng1.getText().toString(), edtIng2.getText().toString(), edtIng3.getText().toString(), edtModo.getText().toString());
                    MainActivity.rec.set(x, novo);
                    onBackPressed();
                }

            }
        });

    }
}
