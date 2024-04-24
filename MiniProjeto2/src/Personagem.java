
import java.util.Random;
public class Personagem {

    
    public int ataque;
    public int elixir;
    public int vida;
    public int veneno;
    

    public Personagem(int ataque, int elixir, int vida, int veneno){
    Random random = new Random();

    this.ataque = random.nextInt(10) + 10;
    this.elixir = random.nextInt(10);
    this.veneno = random.nextInt(12)+5;
    this.vida = 50 ;



    }

}

   