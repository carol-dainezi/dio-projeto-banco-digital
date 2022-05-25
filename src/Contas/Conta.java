package Contas;

import Principais.Banco;
import Principais.Cliente;

public abstract class Conta implements MetodosContas {

    protected static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL_CONTA = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Cliente cliente, Banco banco) {

        this.numeroConta = SEQUENCIAL_CONTA++;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.cliente = cliente;
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {

        return saldo;
    }

    @Override
    public void informacoesConta() {
        System.out.println("Banco: " + this.banco.getNome());
        System.out.println("Proprietário da conta: " + this.cliente.getNome());
        System.out.println("Agência da conta: " + this.getAgencia());
        System.out.println("Número da conta: " + this.getNumeroConta());
        System.out.println("Saldo disponível: R$" + this.getSaldo());
    }

    @Override
    public void sacar(double valor) {

        if (this.saldo < valor)
            System.out.println("Fundos insuficientes.");
        else
            this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public double depositar(double valor) {

        return this.saldo += valor;
    }
}

