package Contas;

import Principais.Banco;
import Principais.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }
}
