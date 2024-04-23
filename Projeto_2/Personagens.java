public class Personagens {
    
    int energiaVagalume;
    int vidaAurora;
    int dano_DaEspada_Aurora;
    int vidaGargola;
    int dano_Do_Goeln;
    int vidaGolen;
    
    int pocaoAzul;
    int pocaoVermelha;

    public Personagens(){
        energiaVagalume = 16;
        vidaAurora = 14;
        dano_DaEspada_Aurora = 5;
        vidaGolen = 10;
        dano_Do_Goeln = 2;
        pocaoAzul = 7;
    }
   public void vagalumeFeixeDeLuz(){
    System.out.println(energiaVagalume);
   }
   public void abi_Dano_Espada(){
    System.out.println(vidaAurora);
    System.out.println(dano_DaEspada_Aurora);
   }
   public void ataquedoGolen(){
        dano_Do_Goeln = 2;
   }
}
