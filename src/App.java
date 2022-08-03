import model.Personagem;
import model.Heroi;
import model.Monstro;

public class App {
   
    public static void main(String[] args) {

    System.out.println("Vida do monstro antes: " + Monstro.esqueleto.getVida());
    Monstro.esqueleto.setVida(Heroi.nych.ataca(Heroi.nych.getAtaque(), Monstro.esqueleto.getVida()));
    System.out.println("Vida do monstro depois: " + Monstro.esqueleto.getVida());
    System.out.println("Vida do herói: " + Heroi.nych.getVida());

    }

}