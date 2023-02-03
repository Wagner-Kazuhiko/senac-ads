package com.kazu.unidade1.aula2;

public class Pessoa {

    private String nome;
    private int cpf;
    private String email;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private boolean validarCpf(int cpf){
        //API com o sistema da Receita Federal
        return  true;
    }
}
