package com.exe.aula36a43;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    @Override
    public String toString() {
        return "\n*** Test Conta Poupança ***\");" +
                "\nDia do rendimento: ´" + this.diaRendimento + '\'' +
                super.toString();
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            this.setSaldo(this.getSaldo() * taxaRendimento);
            System.out.println("sim,"+ hoje.get(Calendar.HOUR));
            return true;
        }
        System.out.println("Não");

        return false;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
