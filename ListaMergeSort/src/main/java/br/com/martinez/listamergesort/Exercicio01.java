package br.com.kliemann.listamergesort;

import java.util.Arrays;

public class Exercicio01 {

    public static void main(String args[]) {
        int[] x = {9, 2, 3, 2, 6, 4};
        int[] aux = new int[x.length];

        mergeSort(x, aux, 0, x.length - 1);

        System.out.println(Arrays.toString(x));

    }

    private static void mergeSort(int[] x, int[] aux, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(x, aux, inicio, meio);
            mergeSort(x, aux, meio + 1, fim);
            intercala(x, aux, inicio, meio, fim);
        }
    }

    private static void intercala(int[] x, int[] aux, int inicio, int meio, int fim) {
        for (int k = inicio; k <= fim; k++) {
            aux[k] = x[k];
        }

        int i = inicio;
        int j = meio + 1;

        for (int k = inicio; k <= fim; k++) {
            if (i > meio) {
                x[k] = aux[j++];
            } else if (j > fim) {
                x[k] = aux[i++];
            } else if (aux[i] < aux[j]) {
                x[k] = aux[i++];
            } else {
                x[k] = aux[j++];
            }
        }
    }
}
