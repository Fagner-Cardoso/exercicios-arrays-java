package edu.fagner.exercicios.arrays.exercicio03;

public class Main {
    public static void main(String[] args) {

        /* Média dos Elementos
        *
        * Objetivo: calcular a média dos elementos em um array de inteiros.
        *
        * Procedimento: crie um método que receba um array de inteiros como argumento e
        * retorne a média de seus elementos;
        *
        * **/

        // inicialização do array
        int[] inteiros = {8,5,7,9,10,15,18,22};

        double valorMedia = calcularMediaElementosArray(inteiros);


        imprimirTituloArray(inteiros);
        System.out.println("Média: " + valorMedia);
    }

    //método que calcula média dos elementos do array
    static double calcularMediaElementosArray(int[] arr){
        int soma = 0;
        for(int i = 0; i < arr.length; i++){
            soma += arr[i];
        }
        double media = ((double)soma / arr.length);

        return media;
    }

    // método que imprime uma mensagem na tela com os elementos do array
    static void imprimirTituloArray(int[] arr){
            String mensagem  = "";
        for(int inteiros : arr){
            mensagem +=  inteiros + ",";
        }

        System.out.println("Elementos array: " + mensagem);
    }

}