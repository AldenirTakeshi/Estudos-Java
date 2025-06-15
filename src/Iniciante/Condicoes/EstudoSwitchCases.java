package Iniciante.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        * Switch Cases que serve para gerar casos especificos
        * Objetivo: Usuário Escolher entre os ninjas
        * Switch case
        * */
        //Abrir o Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um personagem:");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sask");
        System.out.println("3 - Sakura");


        int escolhaDoUsuário = scanner.nextInt();

        System.out.println("Vc Digitou o numero: " + escolhaDoUsuário);

        switch (escolhaDoUsuário){
            case 1:
                System.out.println("Usuário escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Usuário escolheu o Sask Utirra");
                break;
            case 3:
                System.out.println("Usuário escolheu o Sakura Haruno");
                break;
            default:
                System.out.println("Esta opção nao é valida!");
        }

        //Fechar Scanner
        scanner.close();


    }
}
