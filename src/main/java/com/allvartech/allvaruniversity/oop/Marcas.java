package com.allvartech.allvaruniversity.oop;

public class Marcas {
   private String nome;
    private String paisOrigem;

   public Marcas(String nome, String paisOrigem) {
       this.nome = nome;
       this.paisOrigem = paisOrigem;


    }

public void exibirinfo() {
       System.out.println("Marca: " + nome + " | País: " + paisOrigem);

    }
}



