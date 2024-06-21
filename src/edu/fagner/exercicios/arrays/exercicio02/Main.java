package edu.fagner.exercicios.arrays.exercicio02;

public class Main {
    public static void main(String[] args) {

        /* 2. Soma dos elementos
        *
        * Objetivo: Calcular a soma de todos os elementos em um array
        *
        * Procedimento: Crie um método que receba um array de inteiros como argumento e
        * retorne a soma de seus elementos.
        *
        * **/

        int[] inteiros = {10,20,30,40,50};
        somarElementosArray(inteiros);


    }
    // método que soma todos os elementos do array
    static void somarElementosArray(int[] arr){
        int resultado = 0;
        for(int i = 0; i < arr.length; i++){
            resultado += arr[i];
        }
        imprimirSomaElementosArray(resultado);
    }

    //método para imprimir resultado da soma
    static void imprimirSomaElementosArray(int resultado){
        System.out.println("Resultado: " + resultado);
    }
}