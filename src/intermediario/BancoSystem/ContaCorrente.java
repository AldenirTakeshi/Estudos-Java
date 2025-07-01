package intermediario.BancoSystem;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldoInicial, TipoConta tipoConta) {
        super(saldoInicial, TipoConta.CORRENTE);
    }

    @Override
    public double consultarSaldo() {
        System.out.println("");
        return 0;
    }

    @Override
    public double depositar(double valor) {
        return 0;
    }
}
