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

    public Integer setVida(Integer vida) {
        this.vida = vida;
        return vida;
    }
    
    public Integer getAtaque() {
        return ataque;
    }

    public Integer setAtaque(Integer ataque) {
        this.ataque = ataque;
        return ataque;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public Integer setDefesa(Integer defesa) {
        this.defesa = defesa;
        return defesa;
    }
//#endregion


//#region Métodos
/**
 * @param ataque do personagem que está realizando o golpe.
 * @param vida do personagem alvo.
 * @param vidaFinal onde definimos qual será o personagem atacado (Ex: Monstro.esqueleto)
 * @return a vida do personagem após ter sido atacado.
 */
public abstract Integer ataca(Integer ataque, Integer vida, Personagem vidaFinal);

/**
 * @param base valor base do personagem que está equipando (Ex: ).
 * @param modEquip é o modificador do equipamento que será equipado (Ex: Arma.espada.getModif())
 * @param tipo da arma para que o programa possa identificar onde deve aplicar o modificador.
 * @param valorFinal é o valor calculado do valor base com o equipamento sendo equipado.
 * @return
 */
public abstract Integer equipa(Integer base, Integer modEquip, Integer tipo, Personagem valorFinal);
//#endregion

}
