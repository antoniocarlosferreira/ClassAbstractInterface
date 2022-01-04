package com.exe.aula36a43;

public class ContaBancariaTest {

    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaEspecial contaEspecial = new ContaEspecial();

        contaPoupanca.setNomeCliente("Cliente conta Poupança");
        contaPoupanca.setNumConta("22222");

        contaEspecial.setLimites(500);
        contaPoupanca.depositar(100);

        contaPoupanca.setDiaRendimento(13);

        if (contaPoupanca.calcularNovoSaldo(1.5)){
            System.out.printf("Rendimento é: $%,.2f",contaPoupanca.getSaldo());
        }else{
            System.out.println("Hoje não é dia de rendimento!");
        }



        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 130);


        System.out.println(contaPoupanca);
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor))
            System.out.println("Saque efetuado com sucesso!");
        else
            System.out.println("Saldo indisponível para saque!");

    }
}
