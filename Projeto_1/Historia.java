/**
 * A classe Historia é onde vai rodar a história do jogo. 
 */
import java.util.Scanner;
public class Historia {

    public static void exibir_historia(){
        System.out.println("\nEra uma vez um reino chamado Lemúria, que era governado pelo rei Augusto que se casou com uma duquesa desconhecida e juntos tiveram Aurora. Meses depois a duquesa veio a falecer.\nAugusto teve que criar sozinho a sua filha. Os dois sempre vivendo em união, até o rei se sentir solitário e perder o rumo do seu coraçaõ, se cansando novamente.\nEm 1895, véspera da páscoa, quando Aurora adormeceu o fogo do seu coração se desfez e então seu corpo foi tomado pelo frio, e sua pele fria como a neve se fez.\nNa manhã eles a encontraram Aurora vazia perdera sua luz clara.\nSeu pai chorava e suplicava, não havia dúvidas que sua hora chegara.\nNão havia como negar, Auora morta estava.\nAinda assim como num conto de fadas, em uma terra estranha Aurora acordava.\n |Sua missão é ajudar Aurora a descobrir onde ela estar e como voltar para casa.|\n ");
    }
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        /*Variaveis */
        String caminhoA;
        String caminhoB;
        String caminhoC;

        exibir_historia();
        System.out.println("\n|Cap.1 A GAROTA E O VAGALUME |\n");
        System.out.println("Aurora, acorda sozinha em um lugar totalmente estranho, no meio das árvores.\nEla se levanta lentamente, sentindo-se desorientada e confusa. Ao redor dela, o silêncio da floresta é interrompido apenas pelo suave sussurro do vento.\nEla a vista uma placa e decide olhar.\n  ");
        System.out.println("|A direita o velho monastério --> |\nAperte Enter para continuar ");
        entradaDados.nextLine(); /*Chamada de metodo */
        System.out.println("Aurora segue caminho pela floresta. A paisagem do lugar não era agradevel, tinham muitas árvores secas e troncos caidos. Aurora sentia que estava sendo observada\n ");
        System.out.println("|Aurora: Este sonho...Espíritos sombrios sobrevoam, mas não consigo enxergar.|");
        System.out.println("|Aurora: Não! Acorde, acorde.|");
        System.out.println("|Aurora: Pesadelo, deixe-me acordar.|\n");
        System.out.println("Aurora cai no chão chorando e se lamentando. Enquanto ela chorava algo brilhava entre as árvores e seguia em direção da garota caida no chão.");
        System.out.println("|Vaga-lume: Por que choras, criança?.|\n");
        System.out.println("|Aurora: Quem falou isso?.|\n");
        System.out.println("Aurora levanta o rosto e olha e direção a voz.");
        System.out.println("|Vaga-lume: Fui eu, como é seu nome criança?|\n ");
        System.out.println("|Aurora: Me chamo Aurora, pode me ajudar? Estou nesse lugar horrivel e quero pra casa retornar.|\n");
        System.out.println("|Vaga-lume: Siga-me criança. Uma moça lhe aguarda. Com cabelos longos como rio afluente, com pele de mariposa e olhos reluzentes.|\n");
        System.out.println("O Vaga-lume vai ajudar Aurora nos momentos dificies, ele pode iluminar o caminho e cegar os inimigos. Mas seu brilho não é infinito, ele precisa comer *DESEJOS* que são frutos de uma árvore de luz.\n");
        System.out.println("O vaga-lume e a garota seguem o caminho.\nLogo a frente eles encontram uma árvore que tinha uma porta.\n");
        System.out.println("|Vaga-lume: Hum...A porta está fechada, mas eu sei onde está a chave.\nAquele tronco tem um buraco no meio, é onde a chave está.|\n");
        System.out.println(" A menina então se aproximou do tronco e, com cuidado, inseriu a mão no buraco. Ela sentiu algo frio e metálico, e com um sorriso de triunfo, retirou a chave.\nA chave ela enseriu na porta e com um passe de mágica a porta se abriu.\nAurora avistou uma estatúa de uma bela mulher e aos pés dela estava uma espada gravada na pedra.");
        System.out.println("|Vaga-lume:Essa é a senhora da floresta, Aurora. É ao encontro dela que eu estou te levando. |\n");
        System.out.println("|Aurora: Veja senhor Vaga-lume, há uma espada aos pés da senhora. |\n");
        System.out.println("Aurora se aproximou mais da espada e viu que algo nela brilhava.");
        System.out.println("|Aurora: Tem uma escritura na espada: 'A luz desta espada te guiará.'|\n");
        System.out.println("|Vaga-lume: A espada a escolheu, pegue-a.|\nAperte *ENTER* para pegar a espada.\n");
        entradaDados.nextLine();
        System.out.println("Quando a menina colocou sua mão sobre a espada, um brilho forte emanou.");
        System.out.println("|Aurora: Parece real, vejá só como é reluzente.|\n");
        System.out.println("O Vaga-lume e Aurora seguiram caminho pela floresta escura. Aurora já não tinha medo, pois o brilho do vaga-lume acalentava o seu coração.\nOs dois caminharam pela floresta até que chegaram onde o caminho se abria em três. ");
        System.out.println("|Aurora: E agora para onde vamos?|\n");
        System.out.println("|Caminho A|\n |Caminho B|\n |Caminho C|");
        caminhoA = entradaDados.nextLine();
        /* Instruções condicionais com o metodo de comparação */
        if (caminhoA.equals("a")) {
            System.out.println("|Vaga-lume: Vamos seguir pelo caminho da direita. |\n");
        }
        else if(caminhoA.equals("b")){
            System.out.println("|Vaga-lume: Vamos seguir reto. |\n");
        }
        else if (caminhoA.equals("c")) {
            System.out.println("|Vaga-lume: Vamos seguir pelo caminho da esquerda. |\n");
        }
        else{
            System.out.println("Desculpe, não entendi o que você digitou, eu so consigo ler a,b e c. ");
        }


    }
    
}