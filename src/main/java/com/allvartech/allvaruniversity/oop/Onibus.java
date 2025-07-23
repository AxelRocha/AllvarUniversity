package com.allvartech.allvaruniversity.oop;

public class Onibus {

    // atributos

    private int assentos;
    private double potencia;
    private char tipo;
    private String companhia;
    private long numeroDeSerie;

    // getters e setters

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public long getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(long numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    // metodos

    public void ligarMotor() {
        System.out.println("Ligando motor...");
        System.out.println("Motor ligado.");
        System.out.println("Motorista disse: \"Todos a bordo!\".");
    }
}