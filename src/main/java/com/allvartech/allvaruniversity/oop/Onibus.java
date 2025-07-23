package com.allvartech.allvaruniversity.oop;

public class Onibus {

    // atributos

    private int assentos;
    private double potencia;
    private boolean disponivel;
    private String companhia;
    private long numeroDeSerie;

    // constructor

    public Onibus(double potencia, int assentos, boolean disponivel, String companhia, long numeroDeSerie) {
        this.potencia = potencia;
        this.assentos = assentos;
        this.disponivel = disponivel;
        this.companhia = companhia;
        this.numeroDeSerie = numeroDeSerie;
    }

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

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
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