package desafio5;

public class Main {
    public static void main(String[] args) {

        ContaCorrente correte = new ContaCorrente();

        correte.depositar(900);
        correte.depositar(900);
        correte.depositar(900);
        correte.consultarSaldo();
    }
}
