package Iniciante.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Repetir até que uma condicao seja atinjida
        * while
        * for
        * */

        //While
        int numerodeClones = 0;
        int numeroMaximo = 40;

    /*    while (numerodeClones <= numeroMaximo){

            System.out.println("O naruto fez um clone das sombras numero : " + numerodeClones);
            numerodeClones++;
        }*/

        for (numerodeClones = 0; numerodeClones <= numeroMaximo ; numerodeClones++) {
            System.out.println(numerodeClones);
        }

        for (int i = 0; i <= 40 ; i++) {
            System.out.println(i);
        }
    }
}
