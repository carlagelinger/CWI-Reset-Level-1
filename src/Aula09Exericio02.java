import java.util.Scanner;

public class Aula09Exericio02 {

    /*Faça um programa que leia dois números e imprima todos os valores presentes no intervalo
    entre eles, um abaixo do outro. Caso o segundo número seja menor ou igual ao primeiro, solicite
    um novo número até que o segundo número seja maior que o primeiro. */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = scan.nextInt();

        while (num1 >= num2) {

            System.out.println("Digite o segundo número novamente, maior que o primeiro: ");
            num2 = scan.nextInt(); }

            for (int i = num1 ; i < num2 ; i++)
            {
                System.out.println(i);
            }
    }
}


