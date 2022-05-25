package Contas;

public interface MetodosContas {

    void sacar(double valor);

    void transferir(double valor, Conta contaDestino);

    double depositar(double valor);

    void informacoesConta();
}
