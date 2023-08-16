public class Conta {

    /*variaveis da classe*/
    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que 0");
        }
        saldo = saldo + valor;
    }

    void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que 0");
        }

        if (saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo = saldo - valor;
    }

    //Sobrecarga (Overloading) do método sacar
    void sacar(double valor, double taxaSaque){
        sacar(valor + taxaSaque);
    }
}
