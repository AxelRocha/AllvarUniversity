package com.allvartech.allvaruniversity.aula2;

import java.util.List;
import java.util.Arrays;
import java.util.*;

public class Tarefa2Reborn {

    public static void main(String[] args) {

        /*
          1 Dado um vetor de int aleatorio ordenar o vetor de forma crescente
          2 Dado uma lista de Inteiros aleatoria ordenar a lista de forma decrescente
          3 Dado um vetor/lista de inteiros contar quantos numeros primitivos existem no vetor/lista
          4 Dado uma lista de String ordene de forma alfabetica
          5 Crie uma classe com os atributos Nome e Idade; Crie uma Lista de objetos dessa classe e ordene essa lista primeiro
                por nome e depois por idade
          6 Dado uma lista de inteiros aleatorios, identifique a maior sequencia de numero ordenados;
                exemplo 23 5 43 6 8 12 34 12 43 45 3
                    a maior sequencia é a 6 8 12 34
                exemplo 50 45 53 39 44 13 26 34 54 26 69
                    a maior sequencia é 13 26 34 54
         */

//======================================================================================================================

        // declara os vetores e listas e chama os métodos que geram elas

        int[] vetorIntAleatorio = Aula2.arrayAleatorioInt();
        List<Integer> listIntAleatorio = Aula2.listAleatorioInt();
        List<String> listStringAleatorio = Aula2.listAleatorioStrings();

        // 1

        System.out.println("vetorIntAleatorio: " + Arrays.toString(vetorIntAleatorio));

        // bubble sort decrescente

        for (int i = 0; i < vetorIntAleatorio.length - 1; i++)
            for (int j = 0; j < vetorIntAleatorio.length - 1 - i; j++)
                if (vetorIntAleatorio[j] < vetorIntAleatorio[j + 1]) {
                    int aux = vetorIntAleatorio[j];
                    vetorIntAleatorio[j] = vetorIntAleatorio[j + 1];
                    vetorIntAleatorio[j + 1] = aux;
                }

        System.out.println("vetorIntAleatorio: " + Arrays.toString(vetorIntAleatorio));
        System.out.println();

        // 2

        System.out.println("listIntAleatorio: " + listIntAleatorio);

        // método que ordena a lista em ordem decrescente

        Collections.sort(listIntAleatorio, Collections.reverseOrder());

        System.out.println("listIntAleatorio: " + listIntAleatorio);
        System.out.println();

        // 3



        // 4

        System.out.println("listStringAleatorio: " + listStringAleatorio);

        // método que ordena a lista em ordem alfabética, sem diferenciar letras maiúsculas e minúsculas

        Collections.sort(listStringAleatorio, String.CASE_INSENSITIVE_ORDER);

        System.out.println("listStringAleatorio: " + listStringAleatorio);
        System.out.println();

        // 5



        // 6

        // gera a lista novamente, pois ela foi ordenada previamente

        listIntAleatorio = Aula2.listAleatorioInt();
        System.out.println("listIntAleatorio: " + listIntAleatorio);

        List<Integer> maiorSequenciaNumerosOrdenados = new ArrayList<>();

        for (int i = 0; i < listIntAleatorio.size(); i++) {

        }

        System.out.println("maiorSequenciaNumerosOrdenados: " + maiorSequenciaNumerosOrdenados);
    }
}
