package com.allvartech.allvaruniversity.aula2;

import java.util.List;

public class Tarefa2 {
    /*
    Sintam se a vontade para trocar o nome das variaveis se precisar;
     */
    public static void main(String[] args) {
        int[] vetorIntAleatorio = Aula2.arrayAleatorioInt();
        String[] vetorStringAleatorio = Aula2.arrayAleatorioStrings();
        List<Integer> listIntAleatorio = Aula2.listAleatorioInt();
        List<String> listStringAleatorio = Aula2.listAleatorioStrings();

        // Menor número no array de inteiros (for)
        int menorArrayInt = vetorIntAleatorio[0];
        for (int i = 1; i < vetorIntAleatorio.length; i++) {
            if (vetorIntAleatorio[i] < menorArrayInt) {
                menorArrayInt = vetorIntAleatorio[i];
            }
        }

        System.out.println("Menor valor de array de inteiros " + menorArrayInt);

        // Menor número na lista de inteiros (while)
        int menorListaInt = listIntAleatorio.get(0);
        int i = 1;
        while (i < listIntAleatorio.size()) {
            if (listIntAleatorio.get(i) < menorListaInt) {
                menorListaInt = listIntAleatorio.get(i);
            }
            i++;
        }
        System.out.println("Menor valor da lista de inteiros: " + menorListaInt);

        // Menor string no array de strings (for)
        String menorArrayStr = vetorStringAleatorio[0];
        for (int j = 1; j < vetorStringAleatorio.length; j++) {
            if (vetorStringAleatorio[j].length() < menorArrayStr.length()) {
                menorArrayStr = vetorStringAleatorio[j];
            }
        }
        System.out.println("Menor string do array (por tamanho): " + menorArrayStr);

        // Menor string na lista de strings (while)
        String menorListaStr = listStringAleatorio.get(0);
        int j = 1;
        while (j < listStringAleatorio.size()) {
            if (listStringAleatorio.get(j).length() < menorListaStr.length()) {
                menorListaStr = listStringAleatorio.get(j);
            }
            j++;
        }
        System.out.println("Menor string da lista (por tamanho): " + menorListaStr);
    }
}

