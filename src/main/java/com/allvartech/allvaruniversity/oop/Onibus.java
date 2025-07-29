package com.allvartech.allvaruniversity.oop;

public class Onibus {

    // atributos

    private int assentos;
    private double potencia;
    private boolean trucado;
    private String companhia;
    private long numeroDeSerie;

    // constructor

    public Onibus(double potencia, int assentos, boolean trucado, String companhia, long numeroDeSerie) {
        this.potencia = potencia;
        this.assentos = assentos;
        this.trucado = trucado;
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
    public boolean isTrucado() {
        return trucado;
    }
    public void setTrucado(boolean trucado) {
        this.trucado = trucado;
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
}