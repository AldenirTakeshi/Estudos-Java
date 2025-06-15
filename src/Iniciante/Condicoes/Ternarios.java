package Iniciante.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios sao utilizados para reduzir código
        * variavel = (condicao) ? ValorVerdadeiro : ValorFalso;
        * */
        short numeroDeMissoes = 9;
        String Nivel = (numeroDeMissoes >= 10) ? "Este ninja esta com mais de 10 missões" : "Este ninja naoa presta";
        System.out.println(Nivel);
    }
}
