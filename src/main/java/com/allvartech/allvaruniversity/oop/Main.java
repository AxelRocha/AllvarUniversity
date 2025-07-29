package com.allvartech.allvaruniversity.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Tarefas:
            Criar branch para cada um
            Criar classes
            Criar, pelo menos 5, atributo nas classes de cada tipo disponivel no java (int, double, char, long, etc)
            Criar getter e setter destes atributos
            Criar metodos que altera esses atributos para valores aleatorios
            Chamar as classes e atritubos na MAIN
            Commitar as tarefas
         */

        Onibus onibus = new Onibus(475.15, 42,true, "Ouro e Prata", 1551321981651981951L);

        double potencia = onibus.getPotencia();
        int assentos = onibus.getAssentos();
        boolean trucado = onibus.isTrucado();
        String companhia = onibus.getCompanhia();
        long numeroDeSerie = onibus.getNumeroDeSerie();

        System.out.println("Potência: "+potencia+" cv");
        System.out.println("Assentos disponíveis: " + assentos);
        System.out.println("Ônibus trucado: " + (trucado ? "sim" : "não"));
        System.out.println("Companhia: " + companhia);
        System.out.println("Número de série: " + numeroDeSerie);
        System.out.println();

        onibus.ligarMotor();
    }
}