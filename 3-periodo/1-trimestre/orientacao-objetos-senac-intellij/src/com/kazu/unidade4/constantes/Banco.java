package com.kazu.unidade4.constantes;

public class Banco {

    private final Long NUMERO;
    private String nome;
    private String nomePresidente;

    public Banco(Long numero, String nome, String nomePresidente) {
        this.NUMERO = numero;
        this.nome = nome;
        this.nomePresidente = nomePresidente;
    }

    public Long getNUMERO() {
        return NUMERO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePresidente() {
        return nomePresidente;
    }

    public void setNomePresidente(String nomePresidente) {
        this.nomePresidente = nomePresidente;
    }
}
