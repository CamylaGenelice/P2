/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatbot;
/*Bibliotecas Usadas*/
import java.util.Scanner;


/**
 * Scanner é uma classe.
 * @author milrs
 */
/*Função que exibe a mensagem do suporte na tela*/
public class ChatBot {
    public static void mostrar_mensagem_suporte(String numero){
        System.out.println("Prontinho agora você tem suporte 24 horas via WhatsApp");
    }

    public static void main(String[] args) /*Metodo*/ {
        Scanner ler  = new Scanner(System.in); /*Criando um objeto da classe Scanner*/
        
        System.out.println("Olá me chamo Blu, vamos dar inicio ao seu cadastro ");
        System.out.println("Por favor me infomer o seu nome: ");
        String nome = ler.next();
        System.out.println("É um prazer ajudar você "+ nome+ ", aqui na Funerária Santa Clara, trabalhamos com planos de acordo com a sua idade, então por favor digite sua idade: ");
        int idade = ler.nextInt();
        
        /*Condicionais*/
        if ( idade >= 50) {
            System.out.println("Temos duas opções de planos que você pode solicitar " );
            System.out.println("|1|Plano Familiar \n|2|Plano Ideal: ");
            System.out.println("Agora me informe o seu número de WhatsApp para você ter acesso ao suporte: ");
            String numero = ler.next();
            mostrar_mensagem_suporte(numero);
            
            
        }
        else if(idade >= 18 && idade < 50){
            System.out.println("Temos um plano especial para você... " +nome);
            System.out.println("Agora me informe o seu número de WhatsApp para você ter acesso ao suporte: ");
            String numero = ler.next();
            mostrar_mensagem_suporte(numero);
        }
        else{
            System.out.println("Humm... Você é menor de idade, vou estar encerrando a nossa conversa, so maiores de idade podem fazer o cadastro na nossa plataforma ");
        }
    }
}
