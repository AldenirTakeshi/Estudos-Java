package intermediario;

public class NinjaAvancado implements Shinobi{
    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    String nome;
    int idade;
    String habilidade;

    public void especialidade(){
        System.out.println("Habilidade especial do Ninja");
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(habilidade);
    }
}
