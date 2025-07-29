package com.allvartech.allvaruniversity.aula2;

import java.util.List;
import java.util.Arrays;

public class Tarefa2 {

    public static void main(String[] args) {

        int[] vetorIntAleatorio = Aula2.arrayAleatorioInt();
        String[] vetorStringAleatorio = Aula2.arrayAleatorioStrings();
        List<Integer> listIntAleatorio = Aula2.listAleatorioInt();
        List<String> listStringAleatorio = Aula2.listAleatorioStrings();

        System.out.println("vetorIntAleatorio: " + Arrays.toString(vetorIntAleatorio));
        System.out.println("vetorStringAleatorio: " + Arrays.toString(vetorStringAleatorio));
        System.out.println("listIntAleatorio: " + listIntAleatorio);
        System.out.println("listStringAleatorio: " + listStringAleatorio);
        System.out.println();

        int menorVetorIntAleatorio = vetorIntAleatorio[0];
        int i = 1;
        while (i < vetorIntAleatorio.length) {
            if (menorVetorIntAleatorio > vetorIntAleatorio[i])
                menorVetorIntAleatorio = vetorIntAleatorio[i];
            i++;
        }
        System.out.println("menorVetorIntAleatorio: " + menorVetorIntAleatorio);

        String menorVetorStringAleatorio = vetorStringAleatorio[0];
        for (i = 1; i < vetorStringAleatorio.length; i++)
            if (menorVetorStringAleatorio.length() > vetorStringAleatorio[i].length())
                menorVetorStringAleatorio = vetorStringAleatorio[i];
        System.out.println("menorVetorStringAleatorio: " + menorVetorStringAleatorio);

        int menorListIntAleatorio = listIntAleatorio.get(0);
        for (i = 1; i < listIntAleatorio.size(); i++)
            if (menorListIntAleatorio > listIntAleatorio.get(i))
                menorListIntAleatorio = listIntAleatorio.get(i);
        System.out.println("menorListIntAleatorio: " + menorListIntAleatorio);

        String menorListStringAleatorio = listStringAleatorio.get(0);
        i = 1;
        while (i < listStringAleatorio.size()) {
            if (menorListStringAleatorio.length() > listStringAleatorio.get(i).length())
                menorListStringAleatorio = listStringAleatorio.get(i);
            i++;
        }
        System.out.println("menorListStringAleatorio: " + menorListStringAleatorio);
    }
}