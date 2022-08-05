package model;

public class Equipamento {

    private String nome;
    
    private Integer modif;

    private Integer tipo;

//#region Construtor
public Equipamento(String nome, Integer modif, Integer tipo) {
    this.nome = nome;
    this.modif = modif;
    this.tipo = tipo;
}
//#endregion

//#region Métodos  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getModif() {
        return modif;
    }

    public void setModif(Integer modif) {
        this.modif = modif;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
//#endregion

}
