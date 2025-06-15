package Iniciante.desafioIniciante;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        int NUMBER_MAX = 5;
        String[] ninjas = new String[NUMBER_MAX];

        int ninjasCadastrados = 0;
        int opcao = 0;

        while ( opcao != 4 ){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if (ninjasCadastrados < NUMBER_MAX){
                        System.out.println("Digine o nome do novo Ninja:");
                        String novoNinjas = scanner.nextLine();
                        ninjas[ninjasCadastrados] = novoNinjas;
                        ninjasCadastrados++;
                        System.out.println("Ninja Cadastrado com Success!");
                    }else {
                        System.out.println("Quantidade Maxima de Ninjas Cadastrados!");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados ==  0){
                        System.out.println("Nenhum Ninja Cadastrado");
                    }else {
                        System.out.println("Lista de Ninjas Cadastrados:");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Escreva o nome do ninja a ser deletado:");
                    String ninjaDel = scanner.nextLine();

                    break;
                default:
                    System.out.println("============================");
                    System.out.println("Opção Invalida!");
                    break;
            }
        }


    }
}
