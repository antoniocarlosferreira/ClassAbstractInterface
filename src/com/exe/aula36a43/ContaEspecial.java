package com.exe.aula36a43;

public class ContaEspecial extends ContaBancaria {
    private double limites;

    @Override
    public String toString() {
        return "\n*** Test Conta Especial ***\");" +
                "Nome do Cliente: ´" + limites + '\'' +
                super.toString();
    }

    public double getLimites() {
        return limites;
    }

    public void setLimites(double limites) {
        this.limites = limites;
    }

    @Override
    public boolean sacar(double valor) {
        System.out.printf("\nSolicitação de saque de: $%,.2f\n", valor);
        if ((this.getSaldo() < valor) && (this.getSaldo() + limites > valor)) {
            System.out.println("Entrou no Cheque expecial!");
            double limiteSaldo = this.getSaldo() + this.limites;
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        if ((this.getSaldo() - valor) >= 0) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.printf("Confirmado, saque de: $%,.2f\n", valor);
            return true;
        }

        return false;
    }
}
