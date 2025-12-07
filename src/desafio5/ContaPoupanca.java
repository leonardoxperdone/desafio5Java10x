package desafio5;

public class ContaPoupanca extends ContaBancaria {

    @Override
    public void depositar(double valor) {
        saldo = saldo+valor;
        System.out.println(saldo);
    }
}
