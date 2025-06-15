package intermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        NinjaBasico ninjaBasico = new NinjaBasico();
        ninjaBasico.nome = "Naaruto Uzumaki";
        ninjaBasico.idade = 17;
        ninjaBasico.habilidade = "Naaruto Uzumaki";

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi";
        kakashi.aldeia = "Aldeni da Folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.ShariganAtivado();
        kakashi.NinjaDeElite();
        kakashi.hogakeAtivo();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.aldeia = "Aldenia da Folha";
        sasuke.idade = 16;
        sasuke.ShariganAtivado();

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.aldeia = "Aldenia da Folha";
        naruto.idade = 16;
        naruto.rank = NivelNinja.GENIN;
        naruto.modoSabio();

        Uchiha madara = new Uchiha();
        madara.nome = "Madara";
        madara.aldeia = "Aldenia da Folha";
        madara.idade = 100;
        madara.ShariganAtivado();






        /*Hokages Hashirama = new Hokages();
        System.out.println(Hashirama.nome);

        System.out.println("=========================================");

        Hokages Tobirama =  new Hokages();
        System.out.println(Tobirama.nome);

        System.out.println("=========================================");


        Hokages Hiruzem = new Hokages();
        System.out.println("Idade do Hiruzem é : " + Hiruzem.idade);

        System.out.println("=========================================");


        Hokages Minato = new Hokages("Minato Namikazi", 30, false);
        System.out.println(Minato.nome);
        System.out.println(Minato.idade);
        System.out.println(Minato.vivoOuNao);

        System.out.println("=========================================");

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();*/

       /* Scanner scanner = new Scanner(System.in);

        int NUMBER_MAX = 5;
        String[] ninjas = new String[NUMBER_MAX];
        int QuantidadeNinjas = 0;
        int opcao = 0;


        while (opcao != 3){

            System.out.println("Escolha umas da opções a seguir!");
            System.out.println("1- Cadastrar um novo Ninja");
            System.out.println("2- Listar os ninjas");
            System.out.println("3- Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    int opcaoCla = 0;
                    System.out.println("De qual clã deseja criar o ninja ?");
                    System.out.println("1- Uzumaki");
                    System.out.println("2- Uchiha");
                    System.out.println("3- Haruno");
                    opcaoCla = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcaoCla){
                        case 1:
                            System.out.println("Escreva o Nome do Novo Uzumaki:");
                            String novoUzumaki = scanner.nextLine();
                            Uzumaki uzumaki = new Uzumaki();
                            uzumaki.nome = novoUzumaki;
                            System.out.println("Você Criou um Uzumaki: " + uzumaki.nome);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Opcao 2");

                    break;
                case 3:
                    System.out.println("Opcao 3");

                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;

            }
        }*/


    /*Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.modoSabio();


        System.out.println("========================");

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 27;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.ShariganAtivado();

        System.out.println("========================");

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.ativarCura();

        System.out.println("========================");

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 18;
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.byakugan();

        System.out.println("========================");

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto HyugaUzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;
        Boruto.modoSabio();
        Boruto.AtivarOKarca();
        Boruto.AtivarJougan();*/
    }
}
