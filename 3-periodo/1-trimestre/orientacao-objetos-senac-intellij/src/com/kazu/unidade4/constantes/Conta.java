package com.kazu.unidade4.constantes;

public class Conta {

    private String cliente;
    private Long numero = 0L;
    private Double saldo;

    public Conta(String cliente, Long numero, Double saldo) {
        this.cliente = cliente;
        this.numero++;
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
