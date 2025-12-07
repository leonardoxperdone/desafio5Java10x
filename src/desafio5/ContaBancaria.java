package desafio5;

public abstract class ContaBancaria implements Conta {

    double saldo;

    @Override
    public void consultarSaldo() {
        System.out.println(saldo);
    }


    @Override
    public abstract void depositar(double valor) ;
}
