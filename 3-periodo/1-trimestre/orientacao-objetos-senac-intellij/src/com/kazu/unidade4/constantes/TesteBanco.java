package com.kazu.unidade4.constantes;

public class TesteBanco {
    public static void main(String[] args) {

        Conta c1 = new Conta("Andrey", 300.0);
        Conta c2 = new Conta("Masiero", 200.0);

        System.out.printf("Conta número %d pertence a %s\n", c1.getNumero(), c1.getCliente());
        System.out.printf("Conta número %d pertence a %s\n", c2.getNumero(), c2.getCliente());


    }
}
