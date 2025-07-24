package com.allvartech.allvaruniversity.oop;

import java.util.Scanner;

public class Calculadora {

    private final Scanner sc = new Scanner(System.in);

    public void executar() {
        System.out.println("Bem-vindo à calculadora!\n");

        while (true) {
            String op = mostrarMenu();

            if (op.equals("X"))
                break;

            calcular(op);
        }

        sc.close();
    }

    private String mostrarMenu() {
        while (true) {
            System.out.println("Selecione a operação desejada:");
            System.out.println("+ Adição");
            System.out.println("- Subtração");
            System.out.println("* Multiplicação");
            System.out.println("/ Divisão");
            System.out.println("^ Exponenciação\n");
            System.out.println("X SAIR\n");

            String entrada = sc.nextLine().trim().toUpperCase();

            if (!entrada.matches("[+\\-*/^X]"))
                System.out.println("Entrada inválida. Tente novamente.\n");
            else
                return entrada;
        }
    }

    private double inputDouble(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (sc.hasNextDouble()) {
                double valor = sc.nextDouble();
                sc.nextLine(); // limpa o buffer
                return valor;
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
                sc.nextLine(); // descarta entrada inválida
            }
        }
    }

    private double[] entrada(String titulo) {
        System.out.println("\n" + titulo + "\n");
        double x = inputDouble("Digite o 1º termo da operação: ");
        double y = inputDouble("Digite o 2º termo da operação: ");
        return new double[]{x, y};
    }

    private void calcular(String operacao) {
        double x, y, z;

        switch (operacao) {
            case "+":
                double[] soma = entrada("SOMA");
                x = soma[0];
                y = soma[1];
                z = x + y;
                break;
            case "-":
                double[] sub = entrada("SUBTRAÇÃO");
                x = sub[0];
                y = sub[1];
                z = x - y;
                break;
            case "*":
                double[] mult = entrada("MULTIPLICAÇÃO");
                x = mult[0];
                y = mult[1];
                z = x * y;
                break;
            case "/":
                double[] div = entrada("DIVISÃO");
                x = div[0];
                y = div[1];
                if (y == 0) {
                    System.out.println("Impossível dividir por 0.\n");
                    return;
                }
                z = x / y;
                break;
            case "^":
                double[] exp = entrada("EXPONENCIAÇÃO");
                x = exp[0];
                y = exp[1];
                z = Math.pow(x, y);
                break;
            default:
                System.out.println("Operação desconhecida.");
                return;
        }

        System.out.printf("%g %s %g = %g\n\n", x, operacao, y, z);
    }
}