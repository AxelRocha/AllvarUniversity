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

//----------------------------------------------------------------------------------------------------------------------

        // declara os vetores e listas e chama os métodos que geram elas

        int[] vetorIntAleatorio = Aula2.arrayAleatorioInt();
        List<Integer> listIntAleatorio = Aula2.listAleatorioInt();
        List<String> listStringAleatorio = Aula2.listAleatorioStrings();

        // 1

        System.out.println();
        System.out.println("vetorIntAleatorio: " + Arrays.toString(vetorIntAleatorio));

        // bubble sort decrescente

        for (int i = 0; i < vetorIntAleatorio.length - 1; i++) {
            for (int j = 0; j < vetorIntAleatorio.length - 1 - i; j++) {
                if (vetorIntAleatorio[j] < vetorIntAleatorio[j + 1]) {
                    int temp = vetorIntAleatorio[j];
                    vetorIntAleatorio[j] = vetorIntAleatorio[j + 1];
                    vetorIntAleatorio[j + 1] = temp;
                }
            }
        }

        System.out.println("vetorIntAleatorio: " + Arrays.toString(vetorIntAleatorio));

        // 2

        System.out.println();
        System.out.println("listIntAleatorio: " + listIntAleatorio);

        // método que ordena a lista em ordem decrescente

        listIntAleatorio.sort(Collections.reverseOrder());

        System.out.println("listIntAleatorio: " + listIntAleatorio);

        // 3

        // gera a lista novamente, pois ela foi ordenada previamente

        listIntAleatorio = Aula2.listAleatorioInt();

        System.out.println();
        System.out.println("listIntAleatorio: " + listIntAleatorio);

        // gera a lista que vai armazenar os números primos

        List<Integer> numerosPrimos = new ArrayList<>();

        // verifica se cada número da lista é primo e armazena ele na lista de primos

        for (int num : listIntAleatorio) {
            boolean primo = num > 1;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                numerosPrimos.add(num);
            }
        }

        System.out.println("numerosPrimos: " + numerosPrimos);

        // 4

        System.out.println();
        System.out.println("listStringAleatorio: " + listStringAleatorio);

        // método que ordena a lista em ordem alfabética, sem diferenciar letras maiúsculas e minúsculas

        listStringAleatorio.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("listStringAleatorio: " + listStringAleatorio);

        // 5

        // declara a lista de objetos da classe Cadastro

        List<Cadastro> cadastro = new ArrayList<>();

        // adiciona 10 objetos à lista

        cadastro.add(new Cadastro("João", 25));
        cadastro.add(new Cadastro("Ana", 30));
        cadastro.add(new Cadastro("João", 20));
        cadastro.add(new Cadastro("Carlos", 22));
        cadastro.add(new Cadastro("Beatriz", 27));
        cadastro.add(new Cadastro("Ana", 22));
        cadastro.add(new Cadastro("Daniel", 35));
        cadastro.add(new Cadastro("Carlos", 18));
        cadastro.add(new Cadastro("Fernanda", 28));
        cadastro.add(new Cadastro("Beatriz", 24));

        System.out.println();
        for (Cadastro c : cadastro) {
            System.out.println(c.getNome() + " - " + c.getIdade());
        }

        // método que ordena a lista primeiro por nome, sem diferenciar maiúsculas e minúsculas, e depois por idade

        cadastro.sort(Comparator.comparing(Cadastro::getNome, String.CASE_INSENSITIVE_ORDER).thenComparing(Cadastro::getIdade));

        System.out.println();
        for (Cadastro c : cadastro) {
            System.out.println(c.getNome() + " - " + c.getIdade());
        }

        // 6

        System.out.println();
        System.out.println("listIntAleatorio: " + listIntAleatorio);

        // declara as listas que vamos usar na lógica

        List<Integer> maiorSequencia = new ArrayList<>();
        List<Integer> sequenciaTemp = new ArrayList<>();

        // lógica

        sequenciaTemp.add(listIntAleatorio.get(0));
        for (int i = 1; i < listIntAleatorio.size(); i++) {
            if (listIntAleatorio.get(i) > listIntAleatorio.get(i - 1)) {
                sequenciaTemp.add(listIntAleatorio.get(i));
            } else {
                if (sequenciaTemp.size() > maiorSequencia.size()) {
                    maiorSequencia = new ArrayList<>(sequenciaTemp);
                }
                sequenciaTemp.clear();
                sequenciaTemp.add(listIntAleatorio.get(i));
            }
        }
        if (sequenciaTemp.size() > maiorSequencia.size()) {
            maiorSequencia = new ArrayList<>(sequenciaTemp);
        }

        System.out.println("maiorSequencia: " + maiorSequencia);
    }
}
