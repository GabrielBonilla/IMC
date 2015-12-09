package com.example.joker.receita;

/**
 * Created by Joker on 05/12/2015.
 */
public class Receita {
    private String nome;
    private String ingrediente1;
    private String ingrediente2;
    private String ingrediente3;
    private String modoPreparo;

    public Receita(String nome, String ingrediente1, String ingrediente2, String ingrediente3,String modoPreparo){
        this.nome = nome;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3 = ingrediente3;
        this.modoPreparo = modoPreparo;


    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getModoPreparo() {return modoPreparo;}

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public String getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(String ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }



    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Receita receita1 = (Receita) o;

        if (nome != null ? !nome.equals(receita1.nome) : receita1.nome != null)
            return false;
        if (ingrediente1 != null ? !ingrediente1.equals(receita1.ingrediente1) : receita1.ingrediente1 != null)
            return false;
        if (ingrediente2 != null ? !ingrediente2.equals(receita1.ingrediente2) : receita1.ingrediente2 != null)
            return false;
        if (ingrediente3 != null ? !ingrediente3.equals(receita1.ingrediente3) : receita1.ingrediente3 != null)
            return false;
        return !(modoPreparo != null ? !modoPreparo.equals(receita1.modoPreparo) : receita1.modoPreparo != null);
    }

    @Override
    public String toString() {
        return "Receita{" +
                "  Nome ='" + nome + '\'' +
                ", Ingrediente 1='" + ingrediente1 + '\'' +
                ", Ingrediente 2='" + ingrediente2 + '\'' +
                ", Ingrediente 3='" + ingrediente3 + '\'' +
                ", Modo de preparo='" + modoPreparo + '\'' +
                '}';
    }


}


