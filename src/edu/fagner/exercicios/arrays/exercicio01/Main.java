package edu.fagner.exercicios.arrays.exercicio01;

public class Main {
    public static void main(String[] args) {

        /* Inicialização e impressão de arrays
        *
        * Objetivo: entender a sintaxe básica de declaração e inicialização de arrays em Java.
        *
        * Procedimento: declarar e inicializar um array de inteiros com valores e imprimir cada elemento.
        *
        *
        * **/

        // inicialização do array
        int[] inteiros = {8,5,7,9,10,15,18,22};

        //chamada método de impressão de arrays
        imprimirElementosArray(inteiros);
    }

    // método para imprimir elementos array
    static void imprimirElementosArray(int[] arr){
        for(int index : arr){
            System.out.println(index);
        }

    }

}