public class Conta {

    /*variaveis da classe*/
    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
    }
}
