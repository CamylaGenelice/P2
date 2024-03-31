/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatbot;
import java.util.Scanner;
import com.vdurmont.emoji.EmojiParser;

/**
 * Scanner é uma classe.
 * @author milrs
 */
public class Chat {
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);
        String textComEmoji = "😊🌟";
        System.out.println("Olá me chamo Blu, vamos dar inicio ao seu cadastro "+textComEmoji);
        System.out.println("Por favor me infomer o seu nome: ");
        String nome = ler.next();
        System.out.println("É um prazer ajudar você "+ nome+ ", agora falta pouco para concluir. Por favor me informe sua idade: ");
        int idade = ler.nextInt();
        if ( idade >= 50) {
            System.out.println("Temos duas opções de planos que você pode solicitar " +textComEmoji);
            System.out.println("|1|... \n|2|...");
            System.out.println("Agora me informe o seu número de WhatsApp para você ter acesso ao suporte: ");
            String numero = ler.nextLine();
            System.out.println("Prontinho agora você tem suporte 24 horas via WhatsApp "+textComEmoji);
            
        }
        else if(idade >= 18 && idade < 50){
            System.out.println("Temos um plano especial para você... " +nome+textComEmoji);
            System.out.println("Agora me informe o seu número de WhatsApp para você ter acesso ao suporte: ");
            String numero = ler.nextLine();
            System.out.println("Prontinho agora você tem suporte 24 horas via WhatsApp "+textComEmoji);
        }
        else{
            System.out.println("Humm... Você é menor de idade, vou estar encerrando a nossa conversa, so maiores de idade pode fazer o cadastro na nossa plataforma "+textComEmoji );
        }
    }
}
