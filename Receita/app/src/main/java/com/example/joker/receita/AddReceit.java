package com.example.joker.receita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class AddReceit extends AppCompatActivity {
ArrayList<Receita> rec = new ArrayList<Receita>();
    EditText edtNome;
    EditText edtIng1;
    EditText edtIng2;
    EditText edtIng3;
    EditText edtPrep;
    Button btnAdd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_receit);
        edtNome = (EditText) findViewById(R.id.edtNome);
        edtIng1 = (EditText) findViewById(R.id.edtIng1);
        edtIng2 = (EditText) findViewById(R.id.edtIng2);
        edtIng3 = (EditText) findViewById(R.id.edtIng3);
        edtPrep = (EditText) findViewById(R.id.edtPrep);
        btnAdd = (Button) findViewById(R.id.btnAdd);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Receita r = new Receita(edtNome.getText().toString(),edtIng1.getText().toString(),edtIng2.getText().toString(),edtIng3.getText().toString(),edtPrep.getText().toString());
                if (edtNome.getText().toString().isEmpty() || edtIng1.getText().toString().isEmpty() || edtIng2.getText().toString().isEmpty() || edtIng3.getText().toString().isEmpty() || edtPrep.getText().toString().isEmpty()) {
                    Toast.makeText(AddReceit.this, "Informe corretamente", Toast.LENGTH_SHORT).show();
                } else {
                    Receita novo = new Receita (edtNome.getText().toString(), edtIng1.getText().toString(), edtIng2.getText().toString(), edtIng3.getText().toString(), edtPrep.getText().toString());
                    MainActivity.rec.add(novo);
                    Toast.makeText(AddReceit.this, "Receita foi adicionada!", Toast.LENGTH_SHORT).show();
                    onBackPressed();
                }


            }
        });




    }


}
