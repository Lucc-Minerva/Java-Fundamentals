package br.com.fiap.banco;

public class Conta {

    protected int agencia;
    int numero;
    double saldo;

    // construtor xuxu
    public Conta() {

    }

    public Conta(int agencia, int numero, double saldo) {

        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {

        this.saldo += valor;
    }

    public void retirar(double valor) {

        this.saldo -= valor;
    }

    public double verificarSaldo() {

        return this.saldo;
    }
}
