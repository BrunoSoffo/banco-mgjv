public class Main {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.nome = "Bruno Soffo";
        titular1.documento = "4444444";

        Pessoa titular2 = new Pessoa();
        titular2.nome = "Maria Lina";
        titular2.documento = "5555555";

        Conta minhaConta = new Conta();
        minhaConta.titular = titular1;
        minhaConta.agencia = 123;
        minhaConta.numero = 999;
//        minhaConta.saldo = 15_000;
        minhaConta.depositar(15_000);
        minhaConta.sacar(1_000, 10);

        Conta suaConta = new Conta();
        suaConta.titular = titular2;
        suaConta.agencia = 222;
        suaConta.numero = 111;
//        suaConta.saldo = 25_000;
        suaConta.depositar( 25_000);

        System.out.println("Titular: " + minhaConta.titular.nome);
        System.out.println("Saldo: " + minhaConta.saldo);

        System.out.println("Titular: " + suaConta.titular.nome);
        System.out.println("Saldo: " + suaConta.saldo);
    }
}
