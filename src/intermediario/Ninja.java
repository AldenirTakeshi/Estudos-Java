package intermediario;

public class Ninja implements EstrategiaDeBatalha{

     //TODO: Incluir 2 novos Atributos: numeroDeMissoesConcluidas, Rank

     String nome;
     int idade;
     String missao;
     String nivelDeDificuldade;
     String statusDaMissao;
     String aldeia;
     int numeroDeMissoesConcluidas;
     NivelNinja rank;

     public Ninja() {
     }

     public Ninja(String nome, int idade, String missao, String nivelDeDificuldade, String statusDaMissao, String aldeia) {
          this.nome = nome;
          this.idade = idade;
          this.missao = missao;
          this.nivelDeDificuldade = nivelDeDificuldade;
          this.statusDaMissao = statusDaMissao;
          this.aldeia = aldeia;
     }

     //TODO: Sobrecarga do construtor chamando os novos atributos
     //Sobrecarga de metodos vc nao precisa redeclara os metodos apenas os novos atributos.
     public Ninja(String nome, int idade, String missao, String nivelDeDificuldade, String statusDaMissao, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
          this(nome, idade, missao, nivelDeDificuldade, statusDaMissao, aldeia);
          this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
          this.rank = rank;
     }

     public void mostraTodasAsInfo(){
          System.out.println("Nome do Ninja: " + nome);
          System.out.println("Idade do Ninja: " + idade);
          System.out.println("Nome da Missao: " + missao);
          System.out.println("Nivel de Difuculdade da Missao: " + nivelDeDificuldade);
          System.out.println("Status: " + statusDaMissao);
          System.out.println("Aldeia: " + aldeia);
     }

     public void habilidadeEspecial(){
          System.out.println("Meu nome é " + nome + ", e esse é meu Ataque Especial!");
     }

     public void estrategiaDeBatalhaNinja(){
          System.out.println("Meu nome é " + nome + ", e esse é minha Estrategia de Combate!");
     }

     //S obrecarga de metodo - Inteligencia de combate
     public void  inteligenciaDeCombate(){
          System.out.println("Meu nome é " + nome + ", e esse é minha Inteligencia de Combate!"     );
     }

     public void  inteligenciaDeCombate(int qi){
          if(qi > 150){
               System.out.println("Seu QI é " + qi + " e vc é um genio!" );
          }else if (qi >=130 ){
               System.out.println("Seu QI é " + qi + " e vc é um ninja promissor!" );
          }else {
               System.out.println("Seu QI é " + qi + " e vc precisa treinar suas estrategias!" );
          }
     }
}
