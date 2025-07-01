package intermediario.BancoSystem;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial, TipoConta.POUPANCA);
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public double depositar(double valor) {
        double valorComDesconto = valor * 0.99;
        this.saldo += valorComDesconto;
        return saldo;
    }
}
