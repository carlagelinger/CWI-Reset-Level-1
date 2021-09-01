import java.util.Scanner;

public class Aula10Exercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] idades = new int[10];
        int maiorIdade = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe a idade do vetor " + i);
            idades[i] = scan.nextInt();
            if (idades[i] >= 18) {
                maiorIdade++;
            }
        }
        for (int idade : idades) {
            System.out.println(idade);
        }
            System.out.println("Maiores de 18 anos " + maiorIdade);
        }

}
