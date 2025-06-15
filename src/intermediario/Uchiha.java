package intermediario;

public class Uchiha extends Ninja implements ShariganInterface{
    public Uchiha(){
        super();
    }

    public Uchiha(String nome, int idade, String missao, String nivelDeDificuldade, String statusDaMissao, String aldeia, String habilidadeEspecial) {
        super(nome, idade, missao, nivelDeDificuldade, statusDaMissao, aldeia);

    }

    public Uchiha(String nome, int idade, String missao, String nivelDeDificuldade, String statusDaMissao, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank, String habilidadeEspecial) {
        super(nome, idade, missao, nivelDeDificuldade, statusDaMissao, aldeia, numeroDeMissoesConcluidas, rank);

    }

    String habilidadeEspecial;

    @Override
    public void ShariganAtivado() {
        System.out.println(nome + " Ativou o Sharigan");
    }

    public void exibirHabilidadeSpecial(){
        System.out.println(habilidadeEspecial);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + ", e esse é meu Ataque Uchiha, um ataque de Fogo!");
    }
}
