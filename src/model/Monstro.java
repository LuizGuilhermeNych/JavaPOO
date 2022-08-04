package model;

public class Monstro extends Personagem{

    public Monstro(String nome, Integer vida, Integer ataque, Integer defesa) {
        super(nome, vida, ataque, defesa);
}

    public static Monstro esqueleto = new Monstro("Esqueleto", 10, 10, 8);

    @Override
    public Integer ataca(Integer ataque, Integer vida, Personagem vidaFinal) {
        // TODO Auto-generated method stub
        return null;
    }


    
}
