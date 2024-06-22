package edu.fagner.exercicios.arrays.exercicio04;

public class Main {
    public static void main(String[] args) {

        /* Maior e Menor Valor
        * Objetivo: Encontrar o maior e o menor valor em um array de inteiros
        *
        * Implemente um método que retorne maior e outro método que retorne o menor
        * valor presente no array;
        *
        * **/

        // inicialização do array
        int[] inteiros = {8,5,64,9,45,77,3,15,12,22};

        int maiorValor = maiorValorArray(inteiros);
        int menorValor = menorValorArray(inteiros);

        //imprimir menssagem maior e menor valores array
        imprimirMensagemMaiorMenor(maiorValor, menorValor);

    }

    //método que retorna o maior valor em um array
    static int maiorValorArray(int[] arr){
        int maiorValor = 0;
        for(int i = 0; i < arr.length; i++){
            if(maiorValor <= arr[i]){
                maiorValor = arr[i];
            }
        }
        return maiorValor;

    }

    //método que retorna o menor valor em um array
    static int menorValorArray(int[] arr){
        int menorValor = maiorValorArray(arr);
        for(int i = 0; i < arr.length; i++){
            if(menorValor >= arr[i]){
                menorValor = arr[i];
            }
        }
        return menorValor;
    }

    static void imprimirMensagemMaiorMenor(int maiorValor, int menorValor){
        System.out.println("O maior valor do array é: " + maiorValor);
        System.out.println("O menor valor do array é: " + menorValor);
    }
}