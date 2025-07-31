package com.allvartech.allvaruniversity.aula2;

public class Cadastro {

    // atributos

    private String nome;
    private int idade;

    // constructor

    public Cadastro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // getters

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
}
