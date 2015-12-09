package com.example.joker.receita;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ramon on 04/11/15.
 */
public class ReceitaAdapter extends ArrayAdapter<Receita> {

    public ReceitaAdapter(Context context, int resource, List<Receita> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View linha = LayoutInflater.from(getContext()).inflate(R.layout.activity_add_receit,null);
        TextView txtNome=(TextView) linha.findViewById(R.id.txtNome);
        TextView txtIngrediente1 =(TextView) linha.findViewById(R.id.txtIngrediente1);
        TextView txtIngrediente2 =(TextView) linha.findViewById(R.id.txtIngrediente2);
        TextView txtIngrediente3 = (TextView)linha.findViewById(R.id.txtIngrediente3);
        TextView txtModo = (TextView)linha.findViewById(R.id.txtModo);


        Receita x = getItem(position);
        txtNome.setText(x.getNome());
        txtIngrediente1.setText(x.getIngrediente1());
        txtIngrediente2.setText(x.getIngrediente2());
        txtIngrediente3.setText(x.getIngrediente3());
        txtModo.setText(x.getModoPreparo());

        return linha;

    }
}
