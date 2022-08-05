import model.Arma;
import model.Heroi;
import model.Monstro;

public class App {
   
    
    public static void main(String[] args) {

        System.out.println("[----- Testando atacar -----]");

    System.out.println("Vida do monstro antes: " + Monstro.esqueleto.getVida());
    Heroi.nych.ataca(Heroi.nych.getAtaque(), Monstro.esqueleto.getVida(), Monstro.esqueleto);
    System.out.println("Vida do monstro depois: " + Monstro.esqueleto.getVida());

        System.out.println("[----- Testando equipar -----]");

    System.out.println("Ataque do herói antes: " + Heroi.nych.getAtaque());
    Heroi.nych.equipa(Heroi.nych.getAtaque(), Arma.espadaCurta.getModif(), Arma.espadaCurta.getTipo(), Heroi.nych);
    System.out.println("Ataque do herói depois: " + Heroi.nych.getAtaque());
    }

}
