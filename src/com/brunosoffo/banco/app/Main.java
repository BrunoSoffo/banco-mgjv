package com.brunosoffo.banco.app;

import com.brunosoffo.banco.modelo.Conta;
import com.brunosoffo.banco.modelo.Pessoa;

public class Main {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Bruno Soffo");
        titular1.setDocumento("4444444");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Lina");
        titular2.setDocumento("5555555");

        Conta minhaConta = new Conta(titular1, 123, 999);
        minhaConta.depositar(15_000);
        minhaConta.sacar(1_000, 10);

        Conta suaConta = new Conta(titular2, 222, 111);
        suaConta.depositar( 25_000);

        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());
    }
}
