package com.kazu.unidade1.aula2;

public class Principal {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        p.setNome("Albert");
        p.setCpf(111222333);
        p.setEmail("albert@email.com");

        System.out.println("O CPF inserido foi: " + p.getCpf());
        System.out.println("O nome inserido foi: " + p.getNome());
        System.out.println("O email inserido foi: " + p.getEmail());

    }
}
