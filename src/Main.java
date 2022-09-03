//import java.util.Scanner;
//
//public class Main{
//   public static void main(String[] args) throws Exception {
//        GaragemLocomotivas gl = new GaragemLocomotivas();
//
//        Locomotiva l1 = new Locomotiva(222, 40, 200);
//        gl.entra(l1);
//        gl.entra(new Locomotiva(414, 40, 2));
//        gl.entra(new Locomotiva(112, 20, 50));
//        System.out.println(gl);
//
//       Vagao v1 = new Vagao(10,1000);
//        Vagao v2 = new Vagao(20,1000);
//        Vagao v3 = new Vagao(30,1000);
//        
//        Locomotiva l = gl.sai(414);
//
//        System.out.println("\nFicaram na garagem:\n"+gl);
//        System.out.println("\nSaiu: "+l);
//
//        Trem t = new Trem(666,l);
//        t.engataVagao(v2);
//        t.engataVagao(v1);
//        t.engataVagao(v3);
//        System.out.println("Trem: "+t);
//    }
//}


//importação do Scanner
import java.util.Scanner;


//classe Main
public class Main {


//OPÇÃO 1)    
//método Criar Um Trem
//Esse método cria um trem a partir de um identificardo, 
//que o usuário irá criar.
//Junto da criação do Trem, uma locomotiva será criada também
//e esta nunca pode ser removida.
public static void criarUmTrem(){
    Scanner in = new Scanner(System.in);
    System.out.println("Um trem será criado!");
    System.out.println("Por favor, digite o IDENTIFICADOR do trem!");
    int identificadorTrem = in.nextInt();
    System.out.println();
    System.out.printf("[Novo Trem] -> ID:[%d] ", identificadorTrem);
    System.out.println();
    System.out.println("Por favor, digite o IDENTIFICADOR da locomotiva!");
    int identificadorLocomotiva = in.nextInt();
    System.out.println();
    System.out.printf("[Nova Locomotiva] -> ID:[%d] ", identificadorLocomotiva);
    System.out.println();
    


    System.out.println("Fim Do Método");
}


//OPÇÃO 2)
//método Editar Um Trem
//Esse método edita um trem a partir de um identificador,
//que o usuário irá escrever.
/* AS SEGUINTES OPÇÕES SERÃO LIBERADAS
 * 
 * 1) inserir uma locomotiva(informar identificador) respeitando as restrições
 * 2) inserir um vagão(informar identificador) respeitando as restrições
 * 3) remover o último elemento do trem
 * 4) listar locomotivas livres
 * 5) listar vagões livres
 * 6) encerrar a edição do trem
 * 
 */
public static void editarUmTrem(){
    boolean continuar;
    int go = 2;
    Scanner in = new Scanner(System.in);
    System.out.println("Por favor, Escreva o IDENTIFICADOR do Trem a ser editado!");
    int identificadorDoTrem = in.nextInt();
    System.out.println("O IDENTIFICADOR do Trem é: " + identificadorDoTrem);
    System.out.println("Agora, Por favor, Escolha uma das opções de edição");

    do{

    System.out.println();
    System.out.println("==========================================================");
    System.out.println("||                                                      ||");
    System.out.println("||   1) inserir uma locomotiva(informar identificador)  ||");
    System.out.println("||   2) inserir um vagão(informar identificador)        ||");
    System.out.println("||   3) remover o último elemento do trem               ||");
    System.out.println("||   4) listar locomotivas livres                       ||");
    System.out.println("||   5) listar vagões livres                            ||");
    System.out.println("||   6) encerrar a edição do trem                       ||");
    System.out.println("||                                                      ||");
    System.out.println("==========================================================");
    System.out.println();
    System.out.println("Escolha uma das opções");
    int opcao = in.nextInt();




    switch(opcao){
        
        case 1:
            System.out.println("Opçaõ: " + opcao);
            System.out.println("Uma locomotiva será inserida");
            System.out.println("Por favor, digite o IDENTIFICADOR da locomotiva");
            int idLocomotiva = in.nextInt();
            System.out.println();
            System.out.printf("[Locomotiva inserida] -> ID:[%d] ", idLocomotiva);
            System.out.println();

            //SERÁ CRIADO UMA LOCOMOTIVA COM ESSE ID E SERÁ ADICIONADA AO TREM
            break;

        case 2:
            System.out.println("Opçaõ: " + opcao);
            System.out.println("Um vagão será inserido");
            System.out.println("Por favor, digite o IDENTIFICADOR do vagão");
            int idVagao= in.nextInt();
            System.out.println();
            System.out.printf("[Vagão inserido] -> ID:[%d] ", idVagao);
            System.out.println();

            //SERÁ CRIADO UM VAGÃO COM ESTE ID E ADICIONADO AO TREM
            
            break;

        case 3:
             System.out.println("Opçaõ: " + opcao);

            //CÓDIGO QUE ELIMINA A ULTIMO ELEMENTO DO TREM

            break;

        case 4:
            System.out.println("Opçaõ: " + opcao);
            System.out.println(GaragemLocomotivas.toString());
            break;
        
        case 5:
            System.out.println("Opçaõ: " + opcao);
            System.out.println(GaragemVagoes.toString());
               break;

        case 6:
            System.out.println("Opçaõ: " + opcao);
            go = 2;
            break;
            
    }

        System.out.println();
        System.out.println("Deseja continuar?");
        System.out.println("Sim -> 1");
        System.out.println("Não -> 2");
        int continuarSimOuNao = in.nextInt();
        
        if(continuarSimOuNao == 1)
        {
            continuar = true;
            continue;
        }
        else if (continuarSimOuNao == 2)
        {
            continuar = false;
            continue;
        }
        

        
    }while(continuar == true);
}


//OPÇÃO 3)
//método Listar Todos Os Trens Criados
//Esse método cria uma lista com Todos os Trens
//que estão no pátio
public static String listarTodosOsTrensCriados(){
    PatioTrens.toString();
}


//OPÇÃO 4)
//método Desfazer Um Trem
//Esse método Desfaz um trem já criado
public static void desfazerUmTrem(){
    Scanner in = new Scanner(System.in);
    System.out.println("Um trem será desfeito!");
    System.out.println("Por favor, digite o IDENTIFICADOR do trem!");
    int identificadorTrem = in.nextInt();
    System.out.println();
    System.out.printf("[Trem desfeito] -> ID:[%d] ", identificadorTrem);
    System.out.println();

    // ESCREVER AQUI CÓDIGO PARA FAZER O TREM, CUJO ID FOI ESCRITO, SEJA APAGADO
}


//OPÇÃO 5)
//método Encerrar Programa
//Esse método encerra o programa Sistema de Composição de Trens
public static void encerrarPrograma(){
    System.out.println("O programa será fechado!");
    System.out.println("Fim do programa...");
    System.exit(1);
}


    public static void main(String[] args) throws Exception {
        boolean continuar = true;
        Scanner in = new Scanner(System.in);
        System.out.println("==INICIO==");
        System.out.println();
        System.out.println("===================================================");
        System.out.println("||                                               ||");
        System.out.println("||             Gerenciador de trens              ||");        
        System.out.println("||                                               ||");
        System.out.println("===================================================");
        System.out.println("Bem vindo ao gerenciador de trens!");
        

        do{
        System.out.println();
        System.out.println("=====================================================================================");
        System.out.println("||                                 Escolha uma opção                               ||");
        System.out.println("||                                                                                 ||");
        System.out.println("||   1) Criar um trem                                                              ||");
        System.out.println("||   2) Editar um trem                                                             ||");
        System.out.println("||   3) Listar todas os trens já criados (todos os trens que estão no pátio)       ||");
        System.out.println("||   4) Desfazer um trem                                                           ||");
        System.out.println("||   5) Fim (encerrar programa)                                                    ||");
        System.out.println("||                                                                                 ||");
        System.out.println("=====================================================================================");
        System.out.println();
        System.out.println("Por favor escolha uma opção!");
        int opcao = in.nextInt();

        switch(opcao){

            case 1: //Criar um trem
                System.out.println("Você escolheu: " + opcao);
                criarUmTrem();
                System.out.println("Fim Do Case 1");
                break;

            case 2: //Editar um trem
                System.out.println("Você escolheu: " + opcao);
                editarUmTrem();
                System.out.println("Fim Do Case 2");
                break;

            case 3: //Listar todos os trens já criados
                System.out.println("Você escolheu: " + opcao);
                listarTodosOsTrensCriados();
                System.out.println("Fim Do Case 3");
                break;

            case 4: //Desfazer um trem
                System.out.println("Você escolheu: " + opcao);
                desfazerUmTrem();
                System.out.println("Fim Do Case 4");
                break;

            case 5: //Fim (Encerrar programa)
                System.out.println("Você escolheu: " + opcao);
                encerrarPrograma();
                System.out.println("Fim Do Case 5");
                break;

            default:
                 System.out.println("Ops! Ocorreu algum erro!");
                continue;
        }

        System.out.println();
        System.out.println("Deseja continuar?");
        System.out.println("Sim -> 1");
        System.out.println("Não -> 2");
        int continuarSimOuNao = in.nextInt();
        
        if(continuarSimOuNao == 1)
        {
            continuar = true;
            continue;
        }
        else if (continuarSimOuNao == 2)
        {
            continuar = false;
            continue;
        }
        

        
    }while(continuar == true);



        System.out.println();
        System.out.println("==FIM==");
    }
}