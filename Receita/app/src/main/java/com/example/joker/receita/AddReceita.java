package com.example.joker.receita;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddReceita extends ActionBarActivity {
    EditText edtIng1;
    EditText edtIng2;
    EditText edtIng3;
    EditText edtDesc;
    Button btnAddI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_receita);


        edtIng1 = (EditText)findViewById(R.id.edtIng1);
        edtIng2 = (EditText)findViewById(R.id.edtIng2);
        edtIng3 = (EditText)findViewById(R.id.edtIng3);
        edtDesc = (EditText)findViewById(R.id.edtDesc);
        btnAddI = (Button)findViewById(R.id.btnAddI);

        btnAddI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Receita r = new Receita (edtIng1.getText().toString(), edtIng2.getText().toString(),edtIng3.getText().toString(),edtDesc.getText().toString());
                MainActivity.rec.add(r);

            }
        });



    }
}
