package intermediario;

public class NinjaBasico implements Shinobi{
    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    String nome;
    int idade;
    String habilidade;

    @Override
    public void mostrarInfo() {

    }

    @Override
    public void executarHabilidade() {
        System.out.println(habilidade);
    }


}
