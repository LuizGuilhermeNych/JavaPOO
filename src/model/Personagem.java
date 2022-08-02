package model;

import java.util.ArrayList;

public class Personagem {
    
    protected String nome;

    protected static Integer vida;

    protected Integer ataque;

    protected Integer defesa;

//#region Construtor    
public Personagem(String nome, Integer vida, Integer ataque, Integer defesa) {
        this.nome = nome;
        Personagem.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;

        ArrayList bolsaPerso = new ArrayList<>();
    }
//#endregion

//#region Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVida() {
        return vida;
    }

    public static void setVida(Integer vida) {
        Personagem.vida = vida;
    }
    
    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }
//#endregion
   
public Integer ataca(Integer ataque, Integer vida){
    ataque = ataque - vida;
    Personagem.setVida(vida);
    return vida;
}

}
