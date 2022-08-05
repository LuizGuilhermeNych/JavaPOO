package model;

public class Arma extends Equipamento{

    public Arma(String nome, Integer modif, Integer tipo) {
        super(nome, modif, tipo);
    }

    public static Arma espadaCurta = new Arma("Espada Curta", 10, 1);

}
