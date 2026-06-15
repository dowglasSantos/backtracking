package org.example.exercicio2;

public class Exercicio2 {
    public void troco(int valor, int[] notas) {
        for (int nota : notas) {
            int quantidade = valor / nota;

            if (quantidade > 0) {
                System.out.println(
                        quantidade + " nota(s) de R$ " + nota
                );
            }

            valor = valor % nota;

            System.out.println("Valor: " + valor);
        }
    }
}
