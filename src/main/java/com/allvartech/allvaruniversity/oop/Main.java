package com.allvartech.allvaruniversity.oop;

public class Main {

    public static void main(String[] args) {

        /*
        Tarefas:
            Criar branch para cada um
            Criar classes
            Criar, pelo menos 5, atributo nas classes de cada tipo disponivel no java (int, double, char, long, etc)
            Criar getter e setter destes atributos
            Criar metodos que altera esses atributos para valores aleatorios
            Chamar as classes e atritubos na MAIN
            Commitar as tarefas
         */

//======================================================================================================================

        // cria um objeto da classe Onibus e passa os parâmetros iniciais

        Onibus onibus = new Onibus(
            475.15,
            42,
            true,
            "Ouro e Prata",
            1551321981651981951L
        );

        // chama os métodos da classe Onibus

        onibus.printarAtributos();
        onibus.ligarMotor();
    }
}
