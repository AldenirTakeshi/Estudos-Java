package Iniciante.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
            /*Strings: Texto e manipulação de cadeias de caracteres.
            Arrays: Estruturas para armazenar múltiplos valores em uma única variável.
            Objetos: Instâncias de classes que encapsulam dados e comportamentos.*/
        String nome = "Naruto Uzumaki";
        String nomeToUpperCase = nome.toUpperCase();
        System.out.println("Nome em Capslock: " +nomeToUpperCase);
        System.out.println(nome);


        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaToLowerCase =  aldeia.toLowerCase();

        System.out.println(aldeiaToLowerCase);
    }
}
