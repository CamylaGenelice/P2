/*
      
 * A classe Historia é onde vai rodar a história do jogo. 
 */
import java.util.Scanner;
import java.util.Random;
public class Historia {

    public static void lancarDado(String x){
        Random dado = new Random();
        Personagens objeto = new Personagens();
        int resposta;
        int jogarDado = dado.nextInt(7) +1;
        System.out.println("Você tirou o número: "+jogarDado);
        System.out.println("Com base ao número que você tirou escolha qual ação você deseja realizar:\n|3 Atacar 4 Usar Habilidade 3 Defender 2 Usar Item |\nDigite o número da ação: ");
        resposta = dado.nextInt();
        if (resposta == 3){
            objeto.funcao_Dano_Espada();
        }

    }
    public static void Inicio_da_Batalha(){ /*MÉTODO QUE VAI EXIBIR A VIDA DOS PERSONAGENS */
        Personagens habilidadesVagalume = new Personagens();
        Personagens habilidadesDeAurora = new Personagens();
        
        int hpAurora = habilidadesDeAurora.vidaAurora;
        int hpVagalume = habilidadesVagalume.energiaVagalume;
        System.out.println("HP AURORA: "+hpAurora+"\nENERGIA DO VAGA-LUME: "+hpVagalume);


    }
    public static void condicionais(String x){
       int contador = 0;
       Scanner ler = new Scanner(System.in);
        while (contador != 2) {
            if (x.equals("a letra o")) {
                System.out.println("PARABENS VOCE ACERTOU");
                contador +=2;
                break;
            }
            else{
                try {
                    
                    System.out.println("Você tem "+contador+" tentativas para responde");
                    System.out.println("O que é, o que é Faço parte de tudo e estou no final do espaço e do tempo. Quem sou eu?");
                    String resposta = ler.nextLine();
                    if (resposta.equals("a letra o")) {
                        System.out.println("Resposta Certa");
                    }
                    contador +=1;
                    
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    System.out.println("Tentativa invalida");
                }
            }
        }    
        
        
    }
    public static void exibir_historia(){
        System.out.println("\nEra uma vez um reino chamado Lemúria, que era governado pelo rei Augusto que se casou com uma duquesa desconhecida e juntos tiveram Aurora. Meses depois a duquesa veio a falecer.\nAugusto teve que criar sozinho a sua filha. Os dois sempre vivendo em união, até o rei se sentir solitário e perder o rumo do seu coraçaõ, se cansando novamente.\nEm 1895, véspera da páscoa, quando Aurora adormeceu o fogo do seu coração se desfez e então seu corpo foi tomado pelo frio, e sua pele fria como a neve se fez.\nNa manhã eles a encontraram Aurora vazia perdera sua luz clara.\nSeu pai chorava e suplicava, não havia dúvidas que sua hora chegara.\nNão havia como negar, Auora morta estava.\nAinda assim como num conto de fadas, em uma terra estranha Aurora acordava.\n |Sua missão é ajudar Aurora a descobrir onde ela estar e como voltar para casa.|\n ");
    }
    public static void main(String[] args) {
        Scanner entradaA = new Scanner(System.in);
        /*Personagens vagalume = new Personagens();
        Personagens habilidadesDeAurora = new Personagens();*/
        /*Variaveis */
        String caminhoA;
        String teste;
        String jogarDado;
        /*Metodos */
        exibir_historia();
        
        System.out.println("\n|Cap.1 A GAROTA E O VAGALUME |\n");
        System.out.println("Aurora, acorda sozinha em um lugar totalmente estranho, no meio das árvores.\nEla se levanta lentamente, sentindo-se desorientada e confusa. Ao redor dela, o silêncio da floresta é interrompido apenas pelo suave sussurro do vento.\nEla a vista uma placa e decide olhar.\n  ");
        System.out.println("|A direita o velho monastério --> |\nAperte Enter para continuar ");
        entradaA.nextLine();

        System.out.println("Aurora segue caminho pela floresta. A paisagem do lugar não era agradevel, tinham muitas árvores secas e troncos caidos. Aurora sentia que estava sendo observada\n ");
        System.out.println("|Aurora:\u001B[34m  Este sonho...Espíritos sombrios sobrevoam, mas não consigo enxergar.\nNão! Acorde, acorde.\u001B[0m|");
        System.out.println("|Aurora:\u001B[34m   Pesadelo, deixe-me acordar.\u001B[0m|\n");
        System.out.println("Aurora cai no chão chorando e se lamentando. Enquanto ela chorava algo brilhava entre as árvores e seguia em direção da garota caida no chão.");
        System.out.println("|Vaga-lume: \u001B[34m  Por que choras, criança?.\u001B[0m|\n");
        System.out.println("|Aurora:\u001B[34m   Quem falou isso?.\u001B[0m|\n");
        System.out.println("Aurora levanta o rosto e olha e direção a voz.");
        System.out.println("|Vaga-lume: \u001B[34m  Fui eu, como é seu nome criança?\u001B[0m|\n ");
        System.out.println("|Aurora:\u001B[34m   Me chamo Aurora, pode me ajudar? Estou nesse lugar horrivel e quero pra casa retornar.\u001B[0m|\n");
        System.out.println("|Vaga-lume:\u001B[34m   Siga-me criança. Uma moça lhe aguarda. Com cabelos longos como rio afluente, com pele de mariposa e olhos reluzentes.\u001B[0m|\n");
        System.out.println("\u001B[41mO Vaga-lume vai ajudar Aurora nos momentos dificies, ele pode iluminar o caminho e cegar os inimigos. Mas seu brilho não é infinito, ele precisa comer *DESEJOS* que são frutos de uma árvore de luz.\u001B[0m \n");
        System.out.println("O vaga-lume e a garota seguem o caminho.\nLogo a frente eles encontram uma árvore que tinha uma porta.\n");
        System.out.println("|Vaga-lume: \u001B[34m Hum...A porta está fechada, mas eu sei onde está a chave.\nAquele tronco tem um buraco no meio, é onde a chave está.\u001B[0m|\n");
        System.out.println(" A menina então se aproximou do tronco e, com cuidado, inseriu a mão no buraco. Ela sentiu algo frio e metálico, e com um sorriso de triunfo, retirou a chave.\nA chave ela enseriu na porta e com um passe de mágica a porta se abriu.\nAurora avistou uma estatúa de uma bela mulher e aos pés dela estava uma espada gravada na pedra.");
        System.out.println("|Vaga-lume:\u001B[34m Essa é a senhora da floresta, Aurora. É ao encontro dela que eu estou te levando. \u001B[0m|\n");
        System.out.println("|Aurora: \u001B[34m Veja senhor Vaga-lume, há uma espada aos pés da senhora. \u001B[0m|\n");
        System.out.println("Aurora se aproximou mais da espada e viu que algo nela brilhava.");
        System.out.println("|Aurora:\u001B[34m Tem uma escritura na espada: 'A luz desta espada te guiará.'\u001B[0m|\n");
       
        System.out.println("|Vaga-lume: \u001B[34m A espada a escolheu, pegue-a.\u001B[0m|\nAperte *ENTER* para pegar a espada.\n");
        entradaA.nextLine();
        System.out.println("Quando a menina colocou sua mão sobre a espada, um brilho forte emanou.");
        System.out.println("|Aurora: \u001B[34m Parece real, vejá só como é reluzente.\u001B[0m|\n");
        System.out.println("O Vaga-lume e Aurora seguiram caminho pela floresta escura. Aurora já não tinha medo, pois o brilho do vaga-lume acalentava o seucoração.\nOs dois caminharam pela floresta até que chegaram onde o caminho se abria em três. ");
        System.out.println("|Aurora: \u001B[34m E agora para onde vamos?\u001B[0m|\n");
        System.out.println("|Caminho A|\n|Caminho B|\n|Caminho C|");
        caminhoA = entradaA.nextLine();

         /* Instruções condicionais com o metodo de comparação */

        if (caminhoA.equals("a")) {
            System.out.println("|Vaga-lume:\u001B[34m  Vamos seguir pelo caminho da direita. \u001B[0m|\n");
            System.out.println("Aurora e o Vaga-lume seguiram caminho, pela trilha estreita que serpenteava pela densa floresta. ");
            System.out.println("|Vaga-lume: \u001B[34m Mais a frente tem uma ponte que é protegida por um troll. Vamos ter que negociar com ele para atravessar.\u001B[0m |\n");
            System.out.println("|Aurora: \u001B[34m O que vamos negociar com ele? '\u001B[0m|\n");
            System.out.println("Vaga-lume piscou suas asas, lançando um brilho reconfortante sobre Aurora enquanto eles se aproximavam da ponte guardada pelo troll.");
            System.out.println("|Vaga-lume:\u001B[34m  Não se preocupe, Aurora. Trolls podem parecer assustadores, mas eles são mais amigáveis do que parecem. Eles adoram trocar histórias e enigmas. Acho que podemos oferecer ao troll algo que ele valorize em troca da passagem segura.\u001B[0m|\n");
            System.out.println("Aurora assentiu, confiando na sabedoria do vaga-lume. Enquanto se aproximavam da ponte, o troll emergiu das sombras, sua figura imponente bloqueando o caminho. Seus olhos brilhavam com curiosidade enquanto observava Aurora e o vaga-lume se aproximarem.");
            System.out.println("|Troll:\u001B[34m Quem ousa atravessar minha ponte? \u001B[0m|\n grunhiu o troll, sua voz profunda ecoando pela noite.\nAurora deu um passo à frente, mantendo-se firme apesar da imponência do troll.");
            System.out.println("|Vaga-lume:\u001B[34m Somos viajantes, estamos indo ver a Senhora da Floresta, por favor nos deixe passar.\u001B[0m|");
            System.out.println("|Troll: \u001B[34m Para atravessar minha ponte, o enigma deve resolver.\nO que é, o que é Faço parte de tudo e estou no final do espaço e do tempo. Quem sou eu? |");
            teste = entradaA.nextLine();
            condicionais(teste);
            System.out.println("Cuidado existem muitas criaturas malignas dentro da floresta");
            System.out.println("O Vaga-lume e Aurora atravessaram a ponte do Trolll.\nE continuaram sua jornada ao encontro da senhora da floresta.");
            System.out.println("|Vaga-lume:\u001B[34m  Vamos parar aqui para descansar e comer um pouco. \u001B[0m|\n");
            System.out.println("|Aurora: \u001B[34m O que eu posso comer nesse horrivel pesadelo? Não vejo nada que poderia me alimentar. '\u001B[0m|\n");
            System.out.println("|Vaga-lume:\u001B[34m  Eu irei pegar um pouco de sonhos para que você possa comer. \u001B[0m|\n");
            System.out.println(" Quando o jovem vaga-lume se preparava para buscar comida para a garota algo horrivel surge das sombras da floresta, um Golen.\n ");
            
            Inicio_da_Batalha();
            System.out.println("Para você realizar uma ação você precisara jogar o dado.\nDIGITE OK");
            jogarDado = entradaA.nextLine();
            lancarDado(jogarDado);
           /*  habilidadesDeAurora.Dano_Espada();*/

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