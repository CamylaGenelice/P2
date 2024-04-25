import java.util.Random;
import java.util.Scanner;

public class Jogador {
    public static void lancarDado(String x){
        Random dado = new Random();
        Personagens objeto = new Personagens();
        int resposta;
        int jogarDado = dado.nextInt(7) +1;
        System.out.println("Você tirou o número: "+jogarDado);
        System.out.println("Com base ao número que você tirou escolha qual ação você deseja realizar:\n|3 Atacar 4 Usar Habilidade 3 Defender 2 Usar Item |\nDigite o número da ação: ");
        resposta = dado.nextInt();
        if (resposta == 3){
            objeto.funcao_AtaqueBasico(); 
        }
}


/*Método do enigma */
    public static void condicionais(String x){
       int contador = 0;
       Scanner ler = new Scanner(System.in);
        while (contador != 2) {
            if (x.equals("a letra o")) {
                System.out.println("PARABENS VOCE ACERTOU");
                contador +=2;
                break;
            }
            else{
                try {
                    
                    System.out.println("Você tem "+contador+" tentativas para responde");
                    System.out.println("O que é, o que é Faço parte de tudo e estou no final do espaço e do tempo. Quem sou eu?");
                    String resposta = ler.nextLine();
                    if (resposta.equals("a letra o")) {
                        System.out.println("Resposta Certa");
                    }
                    contador +=1;
                    
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    System.out.println("Tentativa invalida");
                }
            }
        }  
}




}
