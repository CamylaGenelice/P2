public class Personagens {
    int energiaVagalume;
    int vidaAurora;
    int dano_DaEspada_Aurora;
    int vidaGargola;
    int vidaGolen;
    

    public Personagens(){
        energiaVagalume = 50;
        vidaAurora = 100;
        dano_DaEspada_Aurora = 35;
    }
   public void vagalumeFeixeDeLuz(){
    System.out.println(energiaVagalume);
   }
   public void abi_Dano_Espada(){
    System.out.println(vidaAurora);
    System.out.println(dano_DaEspada_Aurora);
   }

}
