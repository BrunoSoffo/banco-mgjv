import java.util.Objects;

public class Conta {

    /*variaveis da classe*/
    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    //construtor
    Conta(Pessoa titular, int agencia, int numero){
        Objects.requireNonNull(titular); //exige q o parâmetro titular n seja nulo

//        associando os parâmetros do construtor
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    Conta(){ //construtor secundário para criações sem parâmetros
//        Isso é conhecido como sobrecarga de construtores
    }

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
