package com.allvartech.allvaruniversity.oop;

import java.util.Scanner;

public class Onibus {

    // atributos

    private int assentos;
    private double potencia;
    private boolean disponivel;
    private String companhia;
    private long numeroDeSerie;

    private final Scanner sc = new Scanner(System.in)

    // constructor

    public Onibus(double potencia, int assentos, boolean disponivel, String companhia, long numeroDeSerie) {
        this.potencia = potencia;
        this.assentos = assentos;
        this.disponivel = disponivel;
        this.companhia = companhia;
        this.numeroDeSerie = numeroDeSerie;
    }

    // getters e setters

    public long getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(long numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    // metodos

    public void ligarMotor() {
        System.out.println("Ligando motor...");
        System.out.println("Motor ligado.");
        System.out.println("Motorista disse: \"Todos a bordo!\".");
    }

    public void embarquePassageiros() {
        System.out.println("Digite quantos passageiros irão embarcar:");
        int quant = sc.nextInt();
        if (assentos < quant)
            System.out.println("Não há assentos disponíveis para essa quantidade de passageiros.");
        else {
            System.out.println(quant + " passageiros embarcando.");
            assentos = assentos - quant;
        }
    }

    public void closeScanner() {
        sc.close();
    }
}