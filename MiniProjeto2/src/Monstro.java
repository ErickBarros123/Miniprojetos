
import java.util.Random;

public class Monstro {

    int hp;
    int dano;
    




    public Monstro(int hp, int dano){
    Random random = new Random();

    this.hp = 50;
    this.dano = random.nextInt(5) + 5;


    }   
}
