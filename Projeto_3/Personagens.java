import java.util.Scanner;
/* Classe que contém os metedos e os atributos dos personagens. Os metodos são as ações que cada personagem realiza na hora da batalha.  */
public class Personagens {
    /*Atriubutos */
    int energiaVagalume;
    int vidaMaxAurora;
    int vidaMinAurora;
    int vidaAtual_Aurora;
    int ataqueBasico;
    int vidaGargola;
    int dano_Do_Golen;
    int vidaGolen;
    int vidaAtualGolen;
    String monstro;
    int pocaoAzul;
    int pocaoVermelha;

    public Personagens(){
     /*Construtor Padrão */
    }
    public Personagens(int energiaVagalume,
    int vidaMaxAurora,
    int vidaMinAurora,
    int vidaAtual_Aurora,
    int ataqueBasico,
    int vidaGargola,
    int dano_Do_Golen,
    int vidaGolen,
    int vidaAtualGolen,
    int pocaoAzul,
    int pocaoVermelha)
    {

        this.energiaVagalume = 7;
        this.vidaMaxAurora = 14;
        this.vidaMinAurora = 7;
        this.vidaAtual_Aurora = 1;
        this.ataqueBasico = 5;
        this.vidaGolen = 10;
        this.vidaAtualGolen = 1;
        this.dano_Do_Golen = 2;
        this.pocaoAzul = 7;
    }
    
   
   public void funcao_AtaqueBasico(){
        int subtrair = vidaGolen - ataqueBasico;
        vidaAtualGolen = subtrair;
        System.out.println("\u001B[41m ATAQUE REALIZADO COM SUCESSO: \u001B[0m " +ataqueBasico);
        

   }
   public void funcao_ataquedoGolen(){
        int subtrair = vidaMaxAurora - dano_Do_Golen;
        vidaAtual_Aurora = subtrair;
        /*System.out.println("\u001B[41mO SUA VIDA ATUAL: \u001B[0m "+vidaAtual_Aurora);*/
        

   }
   public void funcao_Defender(){
     int subtrair = vidaMaxAurora - 1;
     vidaAtual_Aurora = subtrair;
     
   }

   public void funcao_Habilidade_Especial(){
     int ataqueEspecial = ataqueBasico + 1;
     int subtrair = vidaGolen - ataqueEspecial;
     vidaAtualGolen = subtrair;
        System.out.println("\u001B[41m ATAQUE COM REALIZADO COM SUCESSO: \u001B[0m"+ataqueEspecial);
   }
   public void funcao_BeberPocaoAzul(int vidaAtual){
     if (vidaAtual <= vidaMinAurora){
          int beber = vidaAtual + pocaoAzul;
          vidaAtual = beber;
          System.out.println("Sua vida atual: "+vidaAtual);

     }
     else{
          System.out.println("Impossivel beber a poção, sua vida não esta no límite.");
     }
}
     public  void funcao_BeberPocaoVermelha(int vidaAtual){
          if (vidaAtual >= vidaMinAurora && vidaAtual < vidaMaxAurora){
               int subtrair = vidaMaxAurora - vidaAtual;
               int somar_para_complementar = vidaAtual + subtrair;
               System.out.println("Sua vida foi restaurada com sucesso "+somar_para_complementar);
          }
          else{
               System.out.println("Algo deu errado, ops ;$");
          }
     }
     
     public int funcao_UsarItem(int escolha, int vidaAtual){
     try {
          if (escolha == 1){
               funcao_BeberPocaoAzul(vidaAtual);
          }
          else if (escolha == 2) {
               funcao_BeberPocaoVermelha(vidaAtual);
               
          }
          else{
               System.out.println("Sinto muito, algo deu errado.");
          }
     } catch (NumberFormatException e) {
          // TODO: handle exception
          System.out.println("Você digitou algo fora da minha programação");
          
     }
     return escolha;}
     public void funcao_AtualizarEnergia(int vidaAtual){
          System.out.println(vidaAtual);
          }
     }


