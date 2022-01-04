package com.exe.aula36a43;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    @Override
    public String toString() {
        return "\n*** Test Conta Corrente ***\");" +
                "Nome do Cliente: ´" + nomeCliente + '\'' +
                "\nNumero da Conta: '" + numConta + '\'' +
                "\nSaldo: " + saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("\nDepósito de: $%,.2f\n", valor);
    }

    public boolean sacar(double valor) {
        System.out.printf("\nSolicitação de saque de: $%,.2f\n", valor);
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            System.out.printf("Confirmado, saque de: $%,.2f\n", valor);
            return true;
        }

        return false;
    }
}
