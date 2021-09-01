import java.util.Scanner;

// Faça um programa que leia 5 números e informe o maior número.

public class Aula09Exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println( " Digite o 1º valor: " );
        int valor = scan.nextInt();

        int valorMaior = valor;

        for (int i =  1 ; i <  5 ; i ++ ) {
            System.out.println(" Digite o " + (i + 1 ) + " º valor: " );
            valor = scan.nextInt ();
            if (valor > valorMaior) {
                valorMaior = valor;
            }
        }

        System.out.println(" O maior valor é: "  + valorMaior);
    }
}
