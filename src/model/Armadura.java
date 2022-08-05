package model;

public class Armadura extends Equipamento{

    public Armadura(String nome, Integer modif, Integer tipo) {
        super(nome, modif, tipo);
    }

    public static Armadura armDeCouro = new Armadura("Armadura de Couro", 10, 2);

}
