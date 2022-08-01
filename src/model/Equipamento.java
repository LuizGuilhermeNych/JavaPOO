package model;

public class Equipamento {

    private String nome;
    
    private Integer modif;

//#region Construtor
public Equipamento(String nome, Integer modif) {
        this.nome = nome;
        this.modif = modif;
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
//#endregion

}
