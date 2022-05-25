package Contas;

import Principais.Banco;
import Principais.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    public void calcularRendimento() {

        double rendimento = saldo*0.01;
        System.out.println("No final do mês, sua conta poupança renderá R$" + rendimento + ".");
    }
}
