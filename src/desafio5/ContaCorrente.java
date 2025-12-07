package desafio5;

public class ContaCorrente extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        double valorFinal = valor - (valor * 0.01);
        saldo = saldo+valorFinal;
    }
}
