public class Personagens {
    /*Atriubutos */
    int energiaVagalume;
    int vidaMaxAurora;
    int vidaMinAurora;
    int ataqueBasico;
    int vidaGargola;
    int dano_Do_Golen;
    int vidaGolen;
    
    int pocaoAzul;
    int pocaoVermelha;

    public Personagens(){
        energiaVagalume = 7;
        vidaMaxAurora = 14;
        vidaMinAurora = 7;
        ataqueBasico = 5;
        vidaGolen = 10;
        dano_Do_Golen = 2;
        pocaoAzul = 7;
    }
   
   public void funcao_AtaqueBasico(){
        
        int subtrair = vidaGolen - ataqueBasico;
        System.out.println("\u001B[41m ATAQUE REALIZADO COM SUCESSO \u001B[0m");

   }
   public void funcao_ataquedoGolen(){
        int subtrair = vidaMaxAurora - dano_Do_Golen;
        System.out.println("\u001B[41mO DANO RECEBIDO \u001B[0m");

   }

   public void funcao_Habilidade_Especial(){
     int subtrair = vidaGolen - (ataqueBasico + 1);
        System.out.println("\u001B[41m ATAQUE REALIZADO COM SUCESSO \u001B[0m");
   }
   public void funcao_BeberPocaoAzul(int vidaAtual){
     if (vidaAtual < vidaMinAurora){
          int beber = vidaAtual + pocaoAzul;
          vidaAtual = beber;
          System.out.println(vidaAtual);

     }
     else{
          System.out.println("Impossivel beber a poção, sua vida não esta no límite.");
     }
}
     public void funcao_BeberPocaoVermelha(int vidaAtual){
          if (vidaAtual < vidaMinAurora){
               int beber = vidaAtual + pocaoVermelha;
               vidaAtual = beber;
               System.out.println(vidaAtual);
          }
          else{
               System.out.println("Algo deu errado, ops ;$");
          }
     }
     public int funcao_UsarItem(int escolha){
     if (escolha == 1){
          funcao_BeberPocaoAzul(vidaAtual);
     }
     else if (escolha == 2) {
          funcao_BeberPocaoVermelha(vidaAtual);
          
     }
     else{
          System.out.println("Sinto muito, algo deu errado.");
     }
     return escolha;
}
}

