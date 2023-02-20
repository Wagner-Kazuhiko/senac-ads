package com.kazu.unidade4.aula1.constantes;

import java.time.LocalDate;

public class TestaDataHelper {
    public static void main(String[] args) {

        DataHelper helper = new DataHelper();
        LocalDate hoje = LocalDate.now();
        System.out.println(helper.formataData(hoje));
    }
}
