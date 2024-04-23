import java.util.Scanner;

public class MiniProjeto1 {
    public static void main(String[] args) {
        String mac = "machado";
        String arm = "arma";
        String mascara = "mascaragas";
        String venen = "veneno";
        String mangueira = "mangueiradeincendio";
        String cord = "corda";
        String chavedef = "chavedefenda";
        String chav = "chave";
        int porta1 = 1;
        int porta2 = 2;
        int porta3 = 3;

        System.out.println("Lucas está em um quarto fechado\n" +
        ", que apresenta 3 portas e cada porta leva a uma sala com\n" +
         "um obstáculoque precisa ser vencido. Depois de vencer o primeiro\n" +
          "obstáculo, Lucas encontrará outra porta que irá levá-lo a outra sala com outro obstáculo.\n"+
          "Certifique-se de pegar os materiais necessários na gaveta do quarto em que ele está para que vença cada obstáculo. \n" +
          "Agora escolha 2 dos 8 instrumentos que irão salvar Lucas, os instrumentos são\n" +
          ": machado, arma, mascaragas, veneno, chave, mangueiradeincendio, corda, chavedefenda"+ "\n \n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro instrumento: "+ "\n \n");

        String primeiroInstrumento = scanner.nextLine(); // Lê o primeiro instrumento

        System.out.println("Digite o segundo instrumento: " + "\n \n");

        String segundoInstrumento = scanner.nextLine(); // Lê o segundo instrumento

        System.out.println("Digite 1, 2 ou 3 para escolher a porta irá entrar: " + "\n \n");
        String porta = scanner.nextLine(); // Lê a porta
        System.out.println("Muito bem. Espero que tenha escolhido bem seus instrumentos, eles serão decisivos para vida ou morte do personagem.)"+ "\n \n");

        if (porta.equals(Integer.toString(porta1))) { // entre na porta 2
            System.out.println("Lucas entrou na porta 1. Na sala 1 existe um monstro e é preciso que Lucas tenha a arma para matá-lo."+ "\n \n");
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            if (primeiroInstrumento.equals(arm)) {
                System.out.println("Lucas conseguiu matar o monstro e passar para a porta seguinte. Nessa porta estará abarrotada de cobras para todos os lados, lucas precisa usar a arma para matar as cobras, com a chave a abrir a porta e se salvar."+ "\n \n");
                if (segundoInstrumento.equals(chav)) {
                  System.out.println("Parabens, Lucas, você conseguiu matar todas as cobras e abrir a segunda porta com a chave"+ "\n \n");}
                else {
                  System.out.println("Lucas está sem a chave, infelizmente o que lhe resta é esperar pelo seu fim"+ "\n \n");
                }
              }


                
            else  {
                System.out.println("Lucas morreu para monstro"+ "\n \n");
            } 
         }

        else if  (porta.equals(Integer.toString(porta2))) { // entre na porta 2
          System.out.println("Lucas escolheu a porta 2. Na sala de porta 2 está contaminada com um gás de toxico que pode matar em questão de segundos. Para se salvar Lucas precisa usar a mascara de gas e sair correndo até a porta 2.1 e atravessá-la com segurança.");
          System.out.println("-----------------------------------------------------------------------------------------------------------------");

          if (primeiroInstrumento.equals(mascara)) {
              System.out.println("Lucas conseguiu passar pelo gas toxico. Ele passou para porta 2.1. Na sala 2.1 existe um guardiao na porta de saída. Lucas precisa jogar o veneno nos olhos do guardião para despitá-lo.");
              if (segundoInstrumento.equals(venen)) {
                System.out.println("Parabens, Lucas,  conseguiu despistar o guardiao e sair vivo");}
              else {
                System.out.println("Como Lucas não tinha o veneno para jogar nos olhos do guardiao. O guardiao avistou Lucas e lhe pisoteou até a morte");
              }
            }

              
          else {
              System.out.println("Lucas morreu envenenado com o gas tóxico.");
          } 
       }
        else if  (porta.equals(Integer.toString(porta3))) { // entre na porta 2
         System.out.println("Você escolheu a porta 3. Na sala da porta 3 está acontecendo um incendio devastador. A unica opcao é tentar apagar o incendio para passar pela porta seguinte.");
         System.out.println("-----------------------------------------------------------------------------------------------------------------");

         if (primeiroInstrumento.equals(mangueira)) {
            System.out.println("Parabéns, você conseguiu amenizar o incendio e passar pela porta. agora outro desafio lhe esperar. na sala seguinte a porta está amarratoda de cordas e voce precisa cortar com um machado. caso contrario a sala começará a desabar e voce morrerá esmagado.");
            if (segundoInstrumento.equals(mac)) {
              System.out.println("Lucas cortou as cordas e conseguiu fugir a tempo de a sala desabar.");}
            else {
              System.out.println("Lucas não tinha o machado e não deu tempo de desatar as cordas, o teto veio a desabar e você morreu.");
              
            }
          }

            
          else {
            System.out.println("Como Lucas nao tinha a mangueira de incendio, ele morreu queimado.");
        } 
     }
         else
         System.out.println("escolha uma das 3 portas para  lucas entrar");
         System.out.println("-----------------------------------------------------------------------------------------------------------------");


        scanner.close();
    }
}
