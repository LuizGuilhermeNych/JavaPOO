package model;

public abstract class Personagem {
    
    private String nome;

    private Integer vida;

    private Integer ataque;

    private Integer defesa;

//#region Construtor    
public Personagem(String nome, Integer vida, Integer ataque, Integer defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
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

    public void setVida(Integer vida) {
        this.vida = vida;
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
   
public abstract Integer ataca(Integer ataque, Integer vida);
}
