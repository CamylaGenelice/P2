
import java.util.Scanner;

public class Capitulo {
   
    Scanner entrada = new Scanner(System.in);
    /*Atributos */
    String nomeCapitulo;
    String texto1;
    String texto2;
    String texto3;
    String texto4;
    String escolha1;
    String escolha2;
    String escolha3;
    int incrementoPersonagem;
    int alteracaoEnergia;

    /*Construtor */
    public Capitulo(){
        /*CONTRUTOR PADRÃO QUE NÃO RECEBE NADA */
    }
    public Capitulo(String nomeCapitulo,String texto1, String texto2,String texto3,String texto4,String escolha1, String escolha2, String escolha3){
        this.nomeCapitulo = nomeCapitulo;
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.texto3 = texto3;
        this.texto4 = texto4;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.escolha3 = escolha3;

    } 
    /*Funções  */
    public void funcaoExibir_Introducao(){
        System.out.println("\nEra uma vez um reino chamado Lemúria, que era governado pelo rei Augusto que se casou com uma duquesa desconhecida e juntos tiveram Aurora. Meses depois a duquesa veio a falecer.\nAugusto teve que criar sozinho a sua filha. Os dois sempre vivendo em união, até o rei se sentir solitário e perder o rumo do seu coraçaõ, se cansando novamente.\nEm 1895, véspera da páscoa, quando Aurora adormeceu o fogo do seu coração se desfez e então seu corpo foi tomado pelo frio, e sua pele fria como a neve se fez.\nNa manhã eles a encontraram Aurora vazia perdera sua luz clara.\nSeu pai chorava e suplicava, não havia dúvidas que sua hora chegara.\nNão havia como negar, Auora morta estava.\nAinda assim como num conto de fadas, em uma terra estranha Aurora acordava.\n |Sua missão é ajudar Aurora a descobrir onde ela estar e como voltar para casa.|\n ");
    }

    public int funcao_Escolher(){
        Scanner entrada = new Scanner(System.in);
        int resultado = 0;
        String escolha;
        boolean escolhaValida = false;

        while (!escolhaValida) {
            escolha = entrada.nextLine();
            if (escolha.equals(escolha1)) {
                escolhaValida = true;
                resultado = 1;
            }
            else if (escolha.equals(escolha2)) {
                resultado = 2;
                escolhaValida = true;
            }
            else {
                escolhaValida = false;
            }
        } return resultado;
        
       
        }

    
    public void funcao_ExibirCapitulo1(){
            Scanner entradaScanner = new Scanner(System.in);
            Capitulo objeto = new Capitulo("Cap.1 A GAROTA E VAGA-LUME","\nAurora, acorda sozinha em um lugar totalmente estranho, no meio das árvores.\nEla se levanta lentamente, sentindo-se desorientada e confusa. Ao redor dela, o silêncio da floresta é interrompido apenas pelo suave sussurro do vento.\nEla a vista uma placa e decide olhar.","\n|A direita o velho monastério --> |\nAperte Enter para continuar.","Aurora segue caminho pela floresta. A paisagem do lugar não era agradevel, tinham muitas árvores secas e troncos caidos. Aurora sentia que estava sendo observada.\n|Aurora:\u001B[34m  Este sonho...Espíritos sombrios sobrevoam, mas não consigo enxergar.\nNão! Acorde, acorde.\u001B[0m|\n|Aurora:\u001B[34m Pesadelo, deixe-me acordar.\u001B[0m|\nAurora cai no chão chorando e se lamentando. Enquanto ela chorava algo brilhava entre as árvores e seguia em direção da garota caida no chão.|Vaga-lume: \u001B[34m Por que choras, criança?.\u001B[0m|\n|Aurora:\u001B[34m Quem falou isso?.\u001B[0m|\nAurora levanta o rosto e olha e direção a voz.|Vaga-lume: \u001B[34m Fui eu, como é seu nome criança?\u001B[0m|\n|Aurora:\u001B[34m Me chamo Aurora, pode me ajudar? Estou nesse lugar horrivel e quero pra casa retornar.\u001B[0m|\n|Vaga-lume:\u001B[34m   Siga-me criança. Uma moça lhe aguarda. Com cabelos longos como rio afluente, com pele de mariposa e olhos reluzentes.\u001B[0m|\n\u001B[41mO Vaga-lume vai ajudar Aurora nos momentos dificies, ele pode iluminar o caminho e cegar os inimigos. Mas seu brilho não é infinito, ele precisa comer *DESEJOS* que são frutos de uma árvore de luz.\u001B[0m \nO vaga-lume e a garota seguem o caminho.\nLogo a frente eles encontram uma árvore que tinha uma porta.\n|Vaga-lume: \u001B[34m Hum...A porta está fechada, mas eu sei onde está a chave.\nAquele tronco tem um buraco no meio, é onde a chave está.\u001B[0m|\nA menina então se aproximou do tronco e, com cuidado, inseriu a mão no buraco. Ela sentiu algo frio e metálico, e com um sorriso de triunfo, retirou a chave.\nA chave ela enseriu na porta e com um passe de mágica a porta se abriu.\nAurora avistou uma estatúa de uma bela mulher e aos pés dela estava uma espada gravada na pedra.|Vaga-lume:\u001B[34m Essa é a senhora da floresta, Aurora. É ao encontro dela que eu estou te levando. \u001B[0m|\n|Aurora: \u001B[34m Veja senhor Vaga-lume, há uma espada aos pés da senhora. \u001B[0m|\nAurora se aproximou mais da espada e viu que algo nela brilhava.|Aurora:\u001B[34m Tem uma escritura na espada: 'A luz desta espada te guiará.'\u001B[0m|\n|Vaga-lume: \u001B[34m A espada a escolheu, pegue-a.\u001B[0m|\nAperte *ENTER* para pegar a espada.\n","Quando a menina colocou sua mão sobre a espada, um brilho forte emanou.\n|Aurora: \u001B[34m Parece real, vejá só como é reluzente.\u001B[0m|\nO Vaga-lume e Aurora seguiram caminho pela floresta escura. Aurora já não tinha medo, pois o brilho do vaga-lume acalentava o seucoração.\nOs dois caminharam pela floresta até que chegaram onde o caminho se abria em três.|Aurora: \u001B[34m E agora para onde vamos?\u001B[0m|\n",
             "\n|Caminho 1|", "\n|Caminho 2|", "\n|Caminho 3|");
            String nomeCapitulo = objeto.nomeCapitulo;
            String texto = objeto.texto1;
            String texto2 = objeto.texto2;
            String texto3 = objeto.texto3;
            String texto4 = objeto.texto4;

            System.out.println(nomeCapitulo);
            System.out.println(texto);
            System.out.println(texto2);
            entradaScanner.nextLine();
            System.out.println(texto3);
            entradaScanner.nextLine();
            System.out.println(texto4);
            System.out.println("|Caminho 1|\n|Caminho 2|\n|Caminho 3|");
            int resposta = entradaScanner.nextInt();
            funcaoEscolhasDoCapitulo1(resposta);
           
            
        }
    public void funcaoEscolhasDoCapitulo1(int resposta){
        while(resposta != 1 && resposta != 2 && resposta != 3){
             System.out.println("Por favor digite um número válido: ");
             resposta = entrada.nextInt();
            }
            if (resposta == 1){
                funcaoCaminho_A();
            }
            else if( resposta == 2){
                funcaoCaminho_B();
            }
            else if (resposta == 3) {
                funcaoCaminho_B();
            }
            }
    public void funcaoExibirHP(){ /*MÉTODO QUE VAI EXIBIR A VIDA DOS PERSONAGENS */
        Personagens objPersona = new Personagens(7,14,4,14,5,0,0,0,0,0,0);
        int hpVagalume = objPersona.energiaVagalume;
        int hpAurora = objPersona.vidaMaxAurora;
        System.out.println("HP AURORA: "+hpAurora+"\nENERGIA DO VAGA-LUME: "+hpVagalume);


    }

    public void funcaoCaminho_A(){
            Scanner objResposta = new Scanner(System.in);
            Jogador objJogador = new Jogador();

            System.out.println("|Vaga-lume:\u001B[34m  Vamos seguir pelo caminho da direita. \u001B[0m|\n");
            System.out.println("Aurora e o Vaga-lume seguiram caminho, pela trilha estreita que serpenteava pela densa floresta. ");
            System.out.println("|Vaga-lume: \u001B[34m Mais a frente tem uma ponte que é protegida por um troll. Vamos ter que negociar com ele para atravessar.\u001B[0m |\n");
            System.out.println("|Aurora: \u001B[34m O que vamos negociar com ele? '\u001B[0m|\n");
            System.out.println("Vaga-lume piscou suas asas, lançando um brilho reconfortante sobre Aurora enquanto eles se aproximavam da ponte guardada pelo troll.");
            System.out.println("|Vaga-lume:\u001B[34m  Não se preocupe, Aurora. Trolls podem parecer assustadores, mas eles são mais amigáveis do que parecem. Eles adoram trocar histórias e enigmas. Acho que podemos oferecer ao troll algo que ele valorize em troca da passagem segura.\u001B[0m|\n");
            System.out.println("Aurora assentiu, confiando na sabedoria do vaga-lume. Enquanto se aproximavam da ponte, o troll emergiu das sombras, sua figura imponente bloqueando o caminho. Seus olhos brilhavam com curiosidade enquanto observava Aurora e o vaga-lume se aproximarem.");
            System.out.println("|Troll:\u001B[34m Quem ousa atravessar minha ponte? \u001B[0m|\n grunhiu o troll, sua voz profunda ecoando pela noite.\nAurora deu um passo à frente, mantendo-se firme apesar da imponência do troll.");
            System.out.println("|Vaga-lume:\u001B[34m Somos viajantes, estamos indo ver a Senhora da Floresta, por favor nos deixe passar.\u001B[0m|");
            System.out.println("|Troll: \u001B[34m Para atravessar minha ponte, o enigma deve resolver.\nO que é, o que é Faço parte de tudo e estou no final do espaço e do tempo. Quem sou eu? \u001B[0m| |");
            
            String resposta = objResposta.nextLine();
            objJogador.condicionais(resposta);

            System.out.println("Cuidado existem muitas criaturas malignas dentro da floresta");
            System.out.println("O Vaga-lume e Aurora atravessaram a ponte do Trolll.\nE continuaram sua jornada ao encontro da senhora da floresta.");
            System.out.println("|Vaga-lume:\u001B[34m  Vamos parar aqui para descansar e comer um pouco. \u001B[0m|\n");
            System.out.println("|Aurora: \u001B[34m O que eu posso comer nesse horrivel pesadelo? Não vejo nada que poderia me alimentar. '\u001B[0m|\n");
            System.out.println("|Vaga-lume:\u001B[34m  Eu irei pegar um pouco de sonhos para que você possa comer. \u001B[0m|\n");
            System.out.println(" Quando o jovem vaga-lume se preparava para buscar comida para a garota algo horrivel surge das sombras da floresta, um Golen.\n ");
            funcaoExibirHP();
            System.out.println("Para você realizar uma ação você precisara jogar o dado.\nDIGITE OK");
           
            String ok = objResposta.nextLine();
            objJogador.batalhaComOGolen(ok);
            objResposta.close();

    }

    public void funcaoCaminho_B(){
        Scanner entrada = new Scanner(System.in);
        Jogador objJogador = new Jogador();
        System.out.println("|Vaga-lume: \u001B[34m Vamos seguir para o norte. \u001B[0m|\n");
        System.out.println("Na densa floresta, Aurora e o vaga-lume deslizavam entre as sombras das árvores. Seus passos eram suaves, ecoando apenas o sussurro da natureza ao redor. O vaga-lume, com sua luminescência delicada, iluminava o caminho à frente, enquanto Aurora o seguia com passos leves e curiosos.O silêncio foi interrompido por um ranger sinistro vindo das sombras. O vaga-lume, seu brilho diminuindo momentaneamente devido ao medo, percebeu a presença do Duende, uma criatura astuta e travessa que habitava os recantos mais sombrios da floresta.O Duende emergiu de entre as árvores, seu olhar faiscando com malícia enquanto avançava na direção de Aurora e do vaga-lume ");
        funcaoExibirHP();
        System.out.println("Para você realizar uma ação você precisara jogar o dado.\nDIGITE OK");
        String ok = entrada.nextLine();
        objJogador.batalhaComODuende(ok);

    }

}
