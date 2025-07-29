package com.allvartech.allvaruniversity.aula2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Aula2 {

    /*
    Recap aula 2:
        Operadores logicos AND && e OR ||
        Controle de fluxo:  IF, SWITCH
        Loops
        Arrays
        List

        Também aprendemos que se segurar CTRL e clicar em uma Classe, metodo, variavel e etc
        você vai para a definição dela.
        Vou deixar metodos exemplificando o que vimos em aula e quero que voces utilizem o que foi dito acima
        e depois tentem fazer as seguintes tarefas para proxima aula:

        TAREFA:
        Foi desenvolvido um conjunto de métodos para gerar sequências aleatórias, incluindo:
            -Um array de inteiros
            -Uma lista de inteiros
            -Um array de strings
            -Uma lista de strings
        No total, serão trabalhadas quatro sequências.
            Requisitos:
                Para o array e a lista de inteiros, você deve implementar um código que retorne o menor número na sequência.
                Para o array e a lista de strings, você deve implementar um código que retorne a menor string na sequência
                isto é, que possua tamanho menor.
        Observação:
            Utilize um laço for para o array e um laço while para a lista (ou vice-versa).
     */

    private void exemplosDeAula() {
        exemploOperadoresLogicos();
        exemploIf();
        exemploSwitch();
        exemploLoops();
        exemploArrays();
        exemploList();

        // Metodos para ajudar na tarefa:
        // gerado pelo gpt
        arrayAleatorioInt();
        arrayAleatorioStrings();
        listAleatorioInt();
        listAleatorioStrings();
    }

    private void exemploOperadoresLogicos() {
        boolean verificacaoVerdadeiro = true;
        boolean verificacaoFalsa = false;
        boolean verificacaoExpressao;

        verificacaoExpressao = verificacaoVerdadeiro && verificacaoFalsa;
        System.out.println("verificacaoVerdadeiro: " + verificacaoVerdadeiro);

        verificacaoExpressao = verificacaoVerdadeiro || verificacaoFalsa;
        System.out.println("verificacaoVerdadeiro: " + verificacaoVerdadeiro);
    }

    private void exemploIf() {
        if (true) {

        }

        if (true) {

        } else {

        }

        if (false) {

        } else if (true) {

        } else {

        }

        /* Desafio:
        O que é operador ternário?
        Me explique na proxima aula
         */
        boolean resultado;
        resultado = isValorPar(1) ? true : false;
        System.out.println("resultado: " + resultado);
    }

    private void exemploSwitch() {
        Random random = new Random();

        switch (random.nextInt(10) % 3) {
            case 0:
                System.out.println("Mod foi de: " + 0);
                break;
            case 1:
                System.out.println("Mod foi de: " + 1);
                break;
            case 2:
                System.out.println("Mod foi de: " + 2);
                break;
        }

        String randomString = "guigay";
        switch (randomString) {
            case "guigay":
            case "seurechgay":
            case "rafareels":
                break;
        }

        /*
        Desafio
        Pesquisar e criar uma classe Enum e fazer if-else e switch utilizando ela
         */
    }

    private void exemploLoops() {
        int limite = 10;
        int soma = 0;

        for (int i = 0; i < limite; i++) {
            soma += i; //o que isso faz?
        }
        System.out.println("soma: " + soma);

        while (limite < 10) {
            soma -= limite;
            limite--;
        }
        System.out.println("soma: " + soma);
    }

    /*
    Lembrando que o arrya voce aloca o espaço na memoria referente ao que voce declarou
    Se declarar um array de tamanho 10, vai alocar na memoria 10 vezes o tamanho da
    classe que voce utilizou.
    Se declarar array de int vai ser o alocado o tamanho de int na memoria vezes o tamanho declarado
    Analogamente para Strings e outras classes.
    E ao alocar o espaço na memoria, esse espaço está vazio ou null. Devemos antes dar valor a este espaço
    na memoria antes de utiliza-lo
     */
    private void exemploArrays() {
        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        String[] stringArray = new String[10];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = String.valueOf(i);
        }
    }

    private void exemploList() {
        List<String> lista = new ArrayList<>();

        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("69");

        lista.remove("3");
        lista.remove(3);

        for (String item : lista) {
            System.out.println(item);
        }

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.0);
        doubleList.clear(); // o que isso faz?
        doubleList.removeAll(dummyDoubleList()); // o que isso faz?
        doubleList.addAll(dummyDoubleList()); // o que isso faz?


        List<Long> longList = new ArrayList<>();
        longList.add(1L);
        longList.isEmpty(); // o que isso verifica?
        longList.contains(2L); // o que isso verifica?
    }

    /**
     * Metodo retorna se o parametro informado é par
     * Para isso é utilizado o operador MOD
     * No java MOD é representado por %
     * @param i valor a ser verificado
     * @return true se for par, impar se não
     */
    private boolean isValorPar(int i) {
        return i % 2 == 0;
    }

    /**
     * Metodo só para não dar erro no codigo
     * @return null
     */
    private Collection<Double> dummyDoubleList() {
        return null;
    }

//==================================================== FIM DA AULA ====================================================//


    public static List<String> listAleatorioStrings() {
        List<String> list = new ArrayList<>();
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < 10; i++) {
            int length = random.nextInt(10) + 1;
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < length; j++) {
                int index = random.nextInt(characters.length());
                sb.append(characters.charAt(index));
            }

            list.add(sb.toString());
        }

        return list;
    }

    public static List<Integer> listAleatorioInt() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        return list;
    }

    public static String[] arrayAleatorioStrings() {
        String[] array = new String[10];
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < array.length; i++) {
            int length = random.nextInt(10) + 1;
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < length; j++) {
                int index = random.nextInt(characters.length());
                sb.append(characters.charAt(index));
            }

            array[i] = sb.toString();
        }

        return array;
    }

    public static int[] arrayAleatorioInt() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }
}
