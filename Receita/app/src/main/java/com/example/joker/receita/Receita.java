package com.example.joker.receita;

/**
 * Created by Joker on 18/11/2015.
 */
public class Receita {
    public String nome;
    public String ingrediente1;
    public String ingrediente2;
    public String ingrediente3;
    public String preparo;

    public Receita(String preparo, String ingrediente1, String ingrediente2, String ingrediente3) {
        this.nome = nome;
        this.preparo = preparo;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3 = ingrediente3;
    }
    public String nome(){ return nome;}

    public void setnome (String nome) {this.nome = nome;}

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public String getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(String ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    public String getPreparo() {
        return preparo;
    }

    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }
}
