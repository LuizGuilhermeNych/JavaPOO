package model;

public class Heroi extends Personagem{

    public Heroi(String nome, Integer vida, Integer ataque, Integer defesa) {
        super(nome, vida, ataque, defesa);        
}

    public static Heroi nych = new Heroi("Nych", 10, 10, 10);
    
    @Override
    public Integer ataca(Integer ataque, Integer vida, Personagem vidaFinal) {
        return vidaFinal.setVida(ataque - vida);
    }

    @Override
    public Integer equipa(Integer base, Integer modEquip, Integer tipo, Personagem valorFinal) {
        if (tipo == 1){
            return valorFinal.setAtaque(base + modEquip);
        } else {
            return valorFinal.setDefesa(base + modEquip);
        }
        
    }

}
