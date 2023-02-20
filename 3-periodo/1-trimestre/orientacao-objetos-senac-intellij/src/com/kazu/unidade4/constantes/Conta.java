package com.kazu.unidade4.constantes;

public class Conta {

    private String cliente;
    private Long numero = 0L;
    private Double saldo;
    private static Long totalContas = 1L;

    public Conta(String cliente, Double saldo) {
        this.cliente = cliente;
        this.numero = Conta.totalContas++;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double consultaSaldo(){
        return saldo;
    }
}
