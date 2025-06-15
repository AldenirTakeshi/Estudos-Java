package Iniciante.Arrays;

public class Arrays2D {
    public static void main(String[] args) {

        String[] ninjas = new String[3];
        System.out.println(ninjas);
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        System.out.println(ninjas[0]);
        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }
    }
}
