import java.util.Scanner;

public class Aula09Exercicio01 {

    /*Faça um programa que peça uma nota, entre zero e dez. Caso o valor informado
    seja inválido, ou seja, não esteja entre zero e dez, mostre uma mensagem informando
    o problema, mas mantenha o programa em execução pedindo novamente a nota até que o usuário
    informe um valor válido. Quando o usuário informar uma nota válida, imprima o valor da nota */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = -1;

        while (num < 0 || num > 10) {
            System.out.println("Digite um número válido: ");
            num = scan.nextInt();
            if (num >= 0 && num <= 10) {
                System.out.println("Você acertou: ");
            } else {
                System.out.println("Você errou: ");
            }
        }
    }
}
