package intermediario;

public class Hatake extends Ninja implements ShariganInterface, AnbuInterface, HokageInterface{

    public void boasVindas(){
            System.out.println("Meu nome é: " + nome +  " Eu sou um Hatake");
    }

    @Override
    public void ShariganAtivado() {
        System.out.println(nome+ " Ativou o Sharigan!");
    }

    @Override
    public void NinjaDeElite() {
        System.out.println("Sou " + nome +  " um ninja de Elite, Sou um Anbu");
    }

    @Override
    public void hogakeAtivo() {
        System.out.println("Me chamo " +nome + " e sou um Hogake");
    }
}
