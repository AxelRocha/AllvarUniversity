package com.allvartech.allvaruniversity.oop;

public class calcgui {

        //System.out.println("ola");
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        if(args[0].equals("soma")){
            soma(a,b);
        } else if(args[0].equals("multiplicacao")){
            multiplicacao(a,b);
        } else if(args[0].equals("divisao")){
            divisao(a,b);
        } else if(args[0].equals("subtracao")){
            subtracao(a,b);
        } else {
            System.out.println("vai se fude tamo junto");
        }
    }
    static void soma(int a, int b){
        int soma = a + b;
        System.out.println(soma);
    }
    static void multiplicacao(int a, int b){
        int multiplicacao = a * b;
        System.out.println(multiplicacao);
    }
    static void divisao(int a, int b){
        int divisao = a / b;
        System.out.println(divisao);
    }
    static void subtracao(int a, int b){
        int subtracao = a - b;
        System.out.println(subtracao);
    }

