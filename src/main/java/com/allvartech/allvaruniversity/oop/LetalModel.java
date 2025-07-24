package com.allvartech.allvaruniversity.oop;

import java.util.Random;

public class LetalModel {


    System.out.println("iniciando batalha de dados mortal do letal model");
    System.out.println("jogando dados...");

    /* for(int j=0;j<1;j++){
        Random aleat = new Random();
        int dadogui = (aleat.nextInt(6) + 1);
        System.out.println("numero do gui: " + dadogui);
    }
    for(int j=0;j<1;j++){
        Random aleat = new Random();
        int dadorafa = (aleat.nextInt(6) + 1);
        System.out.println("numero do rafa: " + dadorafa);
    }
    for(int j=0;j<1;j++){
        Random aleat = new Random();
        int dadorech = (aleat.nextInt(6) + 1);
        System.out.println("numero do rech: " + dadorech);
    }
    for(int j=0;j<1;j++){
        Random aleat = new Random();
        int dadolucao = (aleat.nextInt(6) + 1);
        System.out.println("numero do lucao: " + dadolucao);
    }
    for(int j=0;j<1;j++){
        Random aleat = new Random();
        int dadoaxel = (aleat.nextInt(6) + 1);
        System.out.println("numero do axel: " + dadoaxel);
    }
    for(int j=0;j<1;j++){
        System.out.println("a prenda de hoje é: " );
        Random aleat = new Random();
        int prenda = (aleat.nextInt(5) + 1);
            if (prenda == 1){
     */
    Random aleat = new Random();
    int dadogui = (aleat.nextInt(6) + 1);
    System.out.println("numero do gui: " + dadogui);

    Random aleat1 = new Random();
    int dadorafa = (aleat1.nextInt(6) + 1);
    System.out.println("numero do rafa: " + dadorafa);

    Random aleat2 = new Random();
    int dadorech = (aleat2.nextInt(6) + 1);
    System.out.println("numero do rech: " + dadorech);

    Random aleat3 = new Random();
    int dadolucao = (aleat3.nextInt(6) + 1);
    System.out.println("numero do lucao: " + dadolucao);

    Random aleat4 = new Random();
    int dadoaxel = (aleat4.nextInt(6) + 1);
    System.out.println("numero do axel: " + dadoaxel);

    Random aleat8 = new Random();
    int dadowilliam = (aleat8.nextInt(6) + 1);
    System.out.println("numero do william: " + dadowilliam);

    System.out.println("a prenda de hoje é: " );
    Random aleat5 = new Random();
    int prenda = (aleat5.nextInt(5) + 1);
    if (prenda == 1){
        System.out.println("quem ganhou nos dados vai rebolar lentinho pros cria" );
    }else if (prenda == 2){System.out.println("quem perdeu nos dados vai dormir de conchinha com a Girlaynne");
    }else if (prenda == 3){System.out.println("quem ganhou nos dados vai sair no soco com o mendi");
    }else if (prenda == 4) {System.out.println("sorte grande! quem perdeu nos dados vai trabalhar sabado e domingo");
    } else {System.out.println("quem ganhou nos dados vai pagar a ficha da sinuca hj");}


}
