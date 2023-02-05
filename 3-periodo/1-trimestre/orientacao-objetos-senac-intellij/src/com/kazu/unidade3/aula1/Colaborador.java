package com.kazu.unidade3.aula1;

public abstract class Colaborador {
    private String nome;
    private String departamento;

    public Colaborador(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public abstract double salario();

    @Override
    public String toString(){
        return String.format("Colaborador: %s \nDepartamento: %s",
                this.nome, this.departamento);
    }
}
