package org.example.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public void gerarSubconjuntos(int[] conjunto, int n) {
        backtracking(conjunto, n, 0, new ArrayList<>());
    }

    private void backtracking(int[] conjunto, int n, int inicio, List<Integer> atual) {

        // Caso base
        if (atual.size() == n) {
            System.out.println(atual);
            return;
        }

        // Tenta cada elemento restante
        for (int i = inicio; i < conjunto.length; i++) {

            // Faz a escolha
            atual.add(conjunto[i]);

            // Continua
            backtracking(conjunto, n, i + 1, atual);

            // Desfaz a escolha (BACKTRACK)
            atual.remove(atual.size() - 1);
        }
    }
}
