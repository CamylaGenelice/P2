/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chatbot;
import java.util.Scanner;
import java.time.LocalTime;
/**
 *
 * @author milrs
 */
public class ChatBot {

    public static void main(String[] args) {
        /*Entrada de dados */
        LocalTime horaAtual = LocalTime.now();
        LocalTime meioDia = LocalTime.of(12, 0);
        Scanner ler = new Scanner(System.in);
        String nome = ler.nextLine();
        int idade = ler.nextInt();
        int horaat = horaAtual.getHour();
        int meiodia = meioDia.getHour();
        int noite = meioDia.getHour();
        /*Se horaAtual for menor ou igual a doze horas, então é bom dia, se for maior que doze é boa tarde, se for maior que cinco horas então é boa noite*/
        System.out.println(horaat);
        System.out.println(meiodia);   
        System.out.println(noite);
        System.out.println("Ola mundoi!!!!!!!");
             
    }
}
