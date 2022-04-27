package br.com.kliemann.listamergesort;

import java.util.Arrays;
import java.util.Random;

public class Exercicio04b {

    //Bubble Sort
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] x = new int[10000];
        for (int i=0; i<x.length; i++) {
                 x[i] = random.nextInt(10000);
                 System.out.println(x[i]);
            }
        
        int y[];
        x = bubble_sort_cres(x);
        System.out.println(Arrays.toString(x));
    }
 
    public static int[] bubble_sort_cres(int[] y) {
        int aux = 0;

        for (int i = 1; i < y.length; i++) {
            for (int j = 0; j < y.length - 1; j++) {
                if (y[j] > y[j + 1]) {
                    aux = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = aux;
                }
            }
        }
        return y;
    }    
}
