package intermediario.BancoSystem;

public abstract class ContaBancaria implements Conta {
    double saldo;

    public ContaBancaria(double saldoInicial, TipoConta tipoConta) {
    }

    @Override
    public double depositar(double valor) {
        this.saldo+=valor;
        return saldo;
    }

    @Override
    public abstract double consultarSaldo();
}
