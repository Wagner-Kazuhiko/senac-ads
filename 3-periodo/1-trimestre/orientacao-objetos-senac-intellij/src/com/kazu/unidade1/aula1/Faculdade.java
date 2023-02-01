package com.kazu.unidade1.aula1;

public class Faculdade {
    public static void main(String[] args) {

        Boletim B1 = new Boletim();
        Boletim B2 = new Boletim();

        B1.inserirNota(10);
        B1.inserirFrequencia(true);
        B1.alterarStatus();

        B2.nota = 9;
        B2.frequencia = 85;
        B2.status = "Aprovado";
    }
}
