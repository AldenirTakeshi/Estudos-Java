package Iniciante.Condicoes;
import java.util.Scanner;

public class ScannerUser {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Escreve aqui o nome do Ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é : " + nomeDoNinja);


        System.out.println("Escreva a idade do Ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do Ninja é: " + idadeDoNinja);
        caixaDeTexto.close();

        if(idadeDoNinja >= 18){
            System.out.println("Esse ninja tem mais de 18 anos");
        }else {
            System.out.println("Esse ninja é de menor");
        }

    }
}
