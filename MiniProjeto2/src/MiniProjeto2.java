import java.util.Scanner;

public class MiniProjeto2 {
    public static void main(String[] args) {
        Personagem personagem = new Personagem(0, 0, 50, 0);
        Monstro monstro = new Monstro(50, 0 );
      
        String mac = "machado";
        String arm = "arma";
        String mascara = "mascaradegas";
        String venen = "veneno";
        String adicionar;
        
        Scanner ad = new Scanner(System.in);

        System.out.println("Digite o nome do seu: \n");
        String nomepersonagem = ad.nextLine(); // Lê o nome do personagem
       
        
        System.out.println(nomepersonagem + ", voce se encontra dentro de um abismo, você precisa sair desse abismo através de duas\n" +
                           " passagens que estão logo à sua frente. Mas algo irá tentar lhe impedir. Em cada passagem\n" + 
                           "há um obstáculo a ser vencido. No começo do abismo, onde vc está, há uma caixa de instrumentos.\n" + 
                           "Certifique-se de escolher bem os instrumentos que garantirão sua sobrevivência .\n" +
                           "instrumentos são: machado, veneno, arma e mascaradegas"); 

        

        System.out.println("Digite o primeiro instrumento: \n");
        String primeiroInstrumento = ad.nextLine(); // Lê o primeiro instrumento

        System.out.println("Digite o segundo instrumento: \n");
        String segundoInstrumento = ad.nextLine(); // Lê o segundo instrumento

        System.out.println("Muito bem. Espero que tenha escolhido bem seus instrumentos, eles serão decisivos para a vida ou morte do personagem.\n" + "Aparte  1 para prosseguir");
        int prosseguir = ad.nextInt();
        System.out.println(" O monstro apareceu, voce precisa derrotá-lo");
    
        if (primeiroInstrumento.equals(arm) || segundoInstrumento.equals(venen)) {
            while(true) {
                System.out.println("1 para atirar com a arma" + "\n" + "2 tomar elixir para recuperar vida" + "\n" + "3 para jogar veneno no monstro" );
                adicionar = ad.nextLine();

                if (adicionar.equals("1")) {
                    System.out.println("O dano da arma foi de: " + personagem.ataque + "\n");
                    System.out.println(nomepersonagem + " Voce atirou no monstro. A vida do monstro foi para:  " + (monstro.hp -= personagem.ataque) );
                    System.out.println("O monstro contra atacou, o dano do monstro foi de:  " + monstro.dano);
                    System.out.println(nomepersonagem + " sua vida foi para:  " + (personagem.vida -= monstro.dano));
                    System.out.println("----------------------------------------------------------------------");
                    if (monstro.hp <= 0){
                      System.out.println(nomepersonagem + " conseguiu matar o monstro. Mas ainda falta um obstáculo, O Guardiao da porta seguinte lhe espera para um combate ainda mais insano");
                      break;}
                    if (personagem.vida <=0){
                    System.out.println(nomepersonagem + " morreu.");
                      break;
                    

                    }
                } 
               else if (adicionar.equals("2")){

                System.out.println(nomepersonagem  + " sua vida foi para: " + (personagem.vida += personagem.elixir));
               }

               else if (adicionar.equals("3")){
                  System.out.println("O dano do veneno foi de: " + personagem.veneno + "\n");
                  System.out.println("A vida do monstro foi para:  " + (monstro.hp -= personagem.veneno) );
                  if (monstro.hp <= 0){
                    System.out.println(nomepersonagem + " conseguiu matar o monstro. Mas ainda falta um obstáculo, O Guardiao da porta seguinte lhe espera para um combate ainda mais insano");
                      break;}
                  System.out.println("O monstro contra atacou, o dono do monstro foi de:  " + monstro.dano);
                  System.out.println(nomepersonagem + " sua vida foi para:  " + (personagem.vida -= monstro.dano));
                  System.out.println("----------------------------------------------------------------------");
                 
                 if (personagem.vida <=0){
                     System.out.println(nomepersonagem + " morreu.");
                      break;
                      
               }
            }
            }
        }
        
        else {
            System.out.println(nomepersonagem + " morreu para o monstro\n");
        }
        
        ad.close(); // Fechando o scanner
    }
}
