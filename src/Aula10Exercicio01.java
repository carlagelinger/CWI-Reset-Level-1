/* Crie um programa que receba 5 valores e armazene em um vetor. Crie um
segundo vetor de mesmo tipo e tamanho, contendo os valores do primeiro vetor
multiplicados por 2. Ou seja: segundoVetor[i] = primeiroVetor[i] * 2. No final,
imprima o conteúdo dos dois vetores */

import java.util.Scanner;

public class Aula10Exercicio01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] primeiroVetor = new int[5];
        for (int i = 0; i < primeiroVetor.length; i++) {
            System.out.println("Informe o valor da posição " + i);
            primeiroVetor[i] = scan.nextInt();
        }

        int [] segundoVetor = new int[5];
        for (int i = 0; i < primeiroVetor.length; i++) {
            segundoVetor[i] = primeiroVetor[i] * 2;
        }

        System.out.println("O valor do primeiro vetor é " );
        for (int vetor1 : primeiroVetor) {
            System.out.println(vetor1);
        }
        System.out.println("O valor do segundo vetor é " );
        for (int vetor2 : segundoVetor) {
            System.out.println(vetor2);
        }
    }
}
