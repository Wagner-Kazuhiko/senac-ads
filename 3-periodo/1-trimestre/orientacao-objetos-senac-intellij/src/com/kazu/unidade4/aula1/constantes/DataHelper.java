package com.kazu.unidade4.aula1.constantes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataHelper {

    public String formataData(LocalDate data){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }
}
