import java.util.Random;
import java.util.Scanner;
/*classe jogador so tem um metodo. O metodo que faz a parte da ação do game  */
public class Jogador {
   
    public static void lancarDado(String x){
        Scanner ler_entrada = new Scanner(System.in);
        Random dado = new Random();
        Personagens objeto = new Personagens();
        int resposta;
        int vidaAtual_Aurora = 14;
        int vidaAtualGolen = 10;

        
        while (vidaAtual_Aurora !=0 && vidaAtualGolen != 0) {
            int jogarDado = dado.nextInt(6) +1;
            System.out.println("\n\u001B[32mVocê tirou o número: \u001B[0m"+jogarDado);
            System.out.println("Com base ao número que você tirou escolha qual ação você deseja realizar:\n|3 Atacar| |4 Usar Habilidade| |3 Defender| |2 Usar Item| DIGITE ZERO PARA NENHUMA OPÇÃO A CIMA|\nDigite o número da ação: ");
            resposta = ler_entrada.nextInt();
           /*JOGADOR ESCOLHE QUAL AÇÃO VAI REALIZAR, SE VAI ATACAR OU DEFENDER */
            if (resposta == jogarDado && resposta == 3){
                System.out.println("Escolha uma das ações:\n|1 Atacar|\n|2 Defender|");
                int escolha = ler_entrada.nextInt();
                if (escolha == 1) {
                    objeto.funcao_AtaqueBasico();
                    vidaAtualGolen -= 5;
                    System.out.println(" Vida do Golen: "+vidaAtualGolen);
                    if (vidaAtualGolen <= 0) {
                        System.out.println("\u001B[46mVocê derrotou o Golen!\u001B[0m");
                        break;
                    }
                }
                else if (escolha == 2) {
                    objeto.funcao_Defender();
                    vidaAtual_Aurora -=1;
                    System.out.println("\u001B[41mSua vida atual:\u001B[0m "+vidaAtual_Aurora);
                }

        }
            else if (resposta == jogarDado && resposta == 4) {
                objeto.funcao_Habilidade_Especial();
                vidaAtualGolen -=6;
                System.out.println(" Vida do Golen: "+vidaAtualGolen);
                if (vidaAtualGolen <= 0) {
                    System.out.println("\n\u001B[46mVOCÊ DERROTOU O GOLEN!\u001B[0m");
                    break;
                }
            }
            
            else if (resposta == jogarDado && resposta == 2 ) {
                System.out.println("Escolha qual poção você vai utilizar:\n|1 Poção Azul||2 Poção Vermelha|");
                int resposta_da_pocao = ler_entrada.nextInt();
                objeto.funcao_UsarItem(resposta_da_pocao,vidaAtual_Aurora);
            }
            else{
                objeto.funcao_ataquedoGolen();
                vidaAtual_Aurora -=2;
                System.out.println("\u001B[41mVocê recebeu 2 de dano \u001B[0m");
                System.out.println("Vida atual: "+vidaAtual_Aurora);
                
                if (vidaAtual_Aurora <= 4 && vidaAtual_Aurora > 2) {
                    System.out.println("\u001B Você está com pouca vida, cuidado!\u001B[0m");
                    
                }
                if (vidaAtual_Aurora == 0){
                    System.out.println("\u001B[33mGAMER OVER\u001B[0m");
                }
                
            }
            
         
        
        }
        ler_entrada.close();
        
}


/*Método do enigma */
    public static void condicionais(String x){
       int contador = 0;
       Scanner ler = new Scanner(System.in);
        while (contador != 2) {
            if (x.equals("a letra o")) {
                System.out.println("PARABENS VOCÊ ACERTOU");
                contador +=2;
                break;
            }
            else{
               
                    System.out.println("O que é, o que é, faço parte de tudo e estou no final do espaço e do tempo. Quem sou eu?");
                    String resposta = ler.nextLine();
                    if (resposta.equals("a letra o")) {
                        System.out.println("Resposta Certa");
                        break;
                    }
                    contador +=1;
                    
               
                
            }
        }  
        
}

public static void main(String[] args) {
    

}


}
