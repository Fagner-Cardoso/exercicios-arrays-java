package edu.fagner.exercicios.arrays.exercicio05;

public class Main {
    public static void main(String[] args) {

        /* Contagem de Pares e Ìmpares
        *
        * Contar quantos números pares e ímpares existem em um array de inteiros.
        *
        * Procedimento: Escreva um método que conte e imprima a quantidade de números pares e
        * ímpares em um array.
        *
        *
        * **/

        // inicialização do array
        int[] inteiros = {8,5,7,9,10,15,18,22,37,42,54,65,92};

        contarNumerosParesImpares(inteiros);


    }

    static void contarNumerosParesImpares(int[] arr){
        int contadorPar = 0;
        int contadorImpar =0;

        for(int i : arr){
            if(i % 2 == 0){
                contadorPar++;
            }
            else{
                contadorImpar++;
            }
        }
        System.out.println("Quantidade de pares: " + contadorPar);
        System.out.println("Quantidade de ímpares: " + contadorImpar);
    }
}