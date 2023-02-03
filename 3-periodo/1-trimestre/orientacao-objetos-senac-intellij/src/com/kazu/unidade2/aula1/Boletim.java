package com.kazu.unidade2.aula1;

public class Boletim {

    double AM;
    double AC;
    double AS;
    double MS;

    double PM;
    double MM;

    public double calcular_media(double AM, double AC, double AS) {

        double media = AM * 0.3 + AC * 0.2 + AS * 0.5;
        return media;
    }

    public double calcular_media(double PM, double AS) {

        double media = PM * 0.4 + AS * 0.6;
        return media;
    }

}
