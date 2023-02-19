package com.kazu.unidade4.constantes;

public class Poupanca extends Conta{

    private Double taxaRendimento;

    public Poupanca(String cliente, Long numero, Double saldo, Double taxaRendimento) {
        super(cliente, numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public Double consultaSaldo(){
        return taxaRendimento * getSaldo();
    }
}