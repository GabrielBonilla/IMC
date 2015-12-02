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
        View linha = LayoutInflater.from(getContext()).inflate(R.layout.linha_adapter_pessoa,null);
        TextView txtNome=(TextView) linha.findViewById(R.id.txtNome);
        TextView txtIdade=(TextView) linha.findViewById(R.id.txtIngrediente1);
        TextView txtFone = (TextView) linha.findViewById(R.id.txtIng);

        Receita r = getItem(position);
        txtNome.setText(r.getNome());
        txtIng.setText(r.getIngrediente1());
        txtIng2.setText(r.getIngrediente2());
        txtFone.setText(r.getIngrediente3());
        return linha;

    }
}
