public class Main {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Bruno Soffo");
        titular1.setDocumento("4444444");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Lina");
        titular2.setDocumento("5555555");

        Conta minhaConta = new Conta(titular1, 123, 999);
//        minhaConta.titular = titular1;
//        minhaConta.agencia = 123;
//        minhaConta.numero = 999;
//        minhaConta.saldo = 15_000;
        minhaConta.depositar(15_000);
        minhaConta.sacar(1_000, 10);

        Conta suaConta = new Conta();
        suaConta.setTitular(titular2);
        suaConta.setAgencia(222);
        suaConta.setNumero(111);
//        suaConta.saldo = 25_000;
        suaConta.depositar( 25_000);

        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());
    }
}
