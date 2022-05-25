package Principais;

import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Banco banco1 = new Banco();
        banco1.setNome("Banco DIO");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");

        // Contas do João
        Conta contaCorrente1 = new ContaCorrente(cliente1, banco1);
        Conta contaPoupanca1 = new ContaPoupanca(cliente1, banco1);
        System.out.println("CONTA CORRENTE ");
        contaCorrente1.informacoesConta();
        System.out.println();
        System.out.println("CONTA POUPANÇA ");
        contaPoupanca1.informacoesConta();

        // Contas da Maria
        /*Conta contaCorrente2 = new ContaCorrente(cliente2, banco1);
        Conta contaPoupanca2 = new ContaPoupanca(cliente2, banco1);
        contaPoupanca2.informacoesConta();
        contaCorrente2.informacoesConta();*/


        contaPoupanca1.depositar(500);
        ((ContaPoupanca) contaPoupanca1).calcularRendimento();
    }
}
