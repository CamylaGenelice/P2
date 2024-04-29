/*
      
 * A classe Historia é onde vai rodar a história do jogo. 
 */
import java.util.Scanner;
import java.util.Random;
public class Historia {
    public static void main(String[] args) {
        Scanner entradaA = new Scanner(System.in);
        Jogador obJogador = new Jogador();
        Capitulo objCapitulo = new Capitulo();
        
        /*Variaveis */
        String caminhoA;
        
        /*Metodos */
        objCapitulo.funcao_ExibirCapitulo1();

        caminhoA = entradaA.nextLine();
    
         /* Instruções condicionais com o metodo de comparação */

        if (caminhoA.equals("a")) {
            objCapitulo.funcaoCaminho_A();
            
        }
        else if(caminhoA.equals("b")){
            System.out.println("|Vaga-lume: \u001B[34m Vamos seguir reto. \u001B[0m|\n");
            System.out.println("Aurora e o Vaga-lume seguiram caminho");
        }
        else if (caminhoA.equals("c")) {
            System.out.println("|Vaga-lume:\u001B[34m  Vamos seguir pelo caminho da esquerda. \u001B[0m|\n");
            System.out.println("Aurora e o Vaga-lume seguiram caminho");
        }
        else{
            System.out.println("Desculpe, não entendi o que você digitou, eu so consigo ler a,b e c. ");
        }
        
       entradaA.close();
    }
    
}
