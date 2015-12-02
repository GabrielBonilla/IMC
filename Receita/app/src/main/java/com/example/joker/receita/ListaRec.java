package com.example.joker.receita;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListaRec extends ActionBarActivity {
    ListView lstViewRec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_rec);

        lstViewRec = (ListView)findViewById(R.id.lstViewRec);
    }
}
