public class Personagens {
    /*Atriubutos */
    int energiaVagalume;
    int vidaAurora;
    int dano_DaEspada_Aurora;
    int vidaGargola;
    int dano_Do_Golen;
    int vidaGolen;
    
    int pocaoAzul;
    int pocaoVermelha;

    public Personagens(){
        energiaVagalume = 7;
        vidaAurora = 14;
        dano_DaEspada_Aurora = 5;
        vidaGolen = 10;
        dano_Do_Golen = 2;
        pocaoAzul = 7;
    }
   
   public void funcao_Dano_Espada(){
        System.out.println(vidaAurora);
        int subtrair = vidaGolen - dano_DaEspada_Aurora;
        System.out.println("\u001B[41m ATAQUE REALIZADO COM SUCESSO \u001B[0m");

   }
   public void funcao_ataquedoGolen(){
        int subtrair = vidaAurora - dano_Do_Golen;
        System.out.println("\u001B[41mO DANO RECEBIDO \u001B[0m");

   }

   


}
