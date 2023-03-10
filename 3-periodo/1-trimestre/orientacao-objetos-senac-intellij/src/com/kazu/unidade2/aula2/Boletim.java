package com.kazu.unidade2.aula2;

public class Boletim {

    private float nota;
    private int frequencia;
    private String status;

    public Boletim(float n, int f, String s) {
        setBoletim(n,f,s);
    }

    public Boletim (String st) {
        this(10,100,st);
    }

    public Boletim() {
        this(0,0,null);
    }

    public void setBoletim(float n, int f, String st) {
        setNota(n);
        setFrequencia(f);
        setStatus(st);
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void imprimir() {
        System.out.println(getNota() + "\n" + getFrequencia() + "\n" + getStatus() + "\n");
    }

}


