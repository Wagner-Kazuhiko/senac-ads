package com.kazu.unidade4.constantes;

import java.time.LocalDate;

public class TestaDataHelper {
    public static void main(String[] args) {

        DataHelper helper = new DataHelper();
        LocalDate hoje = LocalDate.now();
        System.out.println(helper.formataData(hoje));
    }
}
