package com.allvartech.allvaruniversity.aula2;

import java.util.List;
import java.util.Arrays;

public class Tarefa2 {

    public static void main(String[] args) {

        // declara os vetores e listas e chama os métodos que geram elas

        int[] vetorIntAleatorio = Aula2.arrayAleatorioInt();
        String[] vetorStringAleatorio = Aula2.arrayAleatorioStrings();
        List<Integer> listIntAleatorio = Aula2.listAleatorioInt();
        List<String> listStringAleatorio = Aula2.listAleatorioStrings();

        // printa os vetores e listas geradas

        System.out.println("vetorIntAleatorio: " + Arrays.toString(vetorIntAleatorio));
        System.out.println("vetorStringAleatorio: " + Arrays.toString(vetorStringAleatorio));
        System.out.println("listIntAleatorio: " + listIntAleatorio);
        System.out.println("listStringAleatorio: " + listStringAleatorio);
        System.out.println();

        // resolução da tarefa

        int i;

        int menorVetorIntAleatorio = vetorIntAleatorio[0];
        i = 1;
        while (i < vetorIntAleatorio.length) {
            if (menorVetorIntAleatorio > vetorIntAleatorio[i]) {
                menorVetorIntAleatorio = vetorIntAleatorio[i];
            }
            i++;
        }
        System.out.println("menorVetorIntAleatorio: " + menorVetorIntAleatorio);

        String menorVetorStringAleatorio = vetorStringAleatorio[0];
        for (i = 1; i < vetorStringAleatorio.length; i++) {
            if (menorVetorStringAleatorio.length() > vetorStringAleatorio[i].length()) {
                menorVetorStringAleatorio = vetorStringAleatorio[i];
            }
        }
        System.out.println("menorVetorStringAleatorio: " + menorVetorStringAleatorio);

        int menorListIntAleatorio = listIntAleatorio.get(0);
        for (i = 1; i < listIntAleatorio.size(); i++) {
            if (menorListIntAleatorio > listIntAleatorio.get(i)) {
                menorListIntAleatorio = listIntAleatorio.get(i);
            }
        }
        System.out.println("menorListIntAleatorio: " + menorListIntAleatorio);

        String menorListStringAleatorio = listStringAleatorio.get(0);
        i = 1;
        while (i < listStringAleatorio.size()) {
            if (menorListStringAleatorio.length() > listStringAleatorio.get(i).length()) {
                menorListStringAleatorio = listStringAleatorio.get(i);
            }
            i++;
        }
        System.out.println("menorListStringAleatorio: " + menorListStringAleatorio);

        // resolução do desafio com classe Enum

        System.out.println();
        System.out.println("Usando If-Else:");
        for (DiaSemana diaSemana : DiaSemana.values()) {
            if (diaSemana == DiaSemana.DOM) {
                System.out.println("Domingo.");
            } else if (diaSemana == DiaSemana.SEG) {
                System.out.println("Segunda-feira.");
            } else if (diaSemana == DiaSemana.TER) {
                System.out.println("Terça-feira.");
            } else if (diaSemana == DiaSemana.QUA) {
                System.out.println("Quarta-feira.");
            } else if (diaSemana == DiaSemana.QUI) {
                System.out.println("Quinta-feira.");
            } else if (diaSemana == DiaSemana.SEX) {
                System.out.println("Sexta-feira.");
            } else if (diaSemana == DiaSemana.SAB) {
                System.out.println("Sábado.");
            }
        }

        System.out.println();
        System.out.println("Usando Switch-Case:");
        for (DiaSemana diaSemana : DiaSemana.values()) {
            switch (diaSemana) {
                case DOM:
                    System.out.println("Domingo.");
                    break;
                case SEG:
                    System.out.println("Segunda-feira.");
                    break;
                case TER:
                    System.out.println("Terça-feira.");
                    break;
                case QUA:
                    System.out.println("Quarta-feira.");
                    break;
                case QUI:
                    System.out.println("Quinta-feira.");
                    break;
                case SEX:
                    System.out.println("Sexta-feira.");
                    break;
                case SAB:
                    System.out.println("Sábado.");
                    break;
            }
        }
    }
}
