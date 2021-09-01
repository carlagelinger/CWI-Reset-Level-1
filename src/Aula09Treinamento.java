/* import java.util.Scanner;

public class Aula09Treinamento {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = scan.nextInt();

        System.out.println("Entre com um limite: ");
        int max = scan.nextInt();

        for (int i = num; i <= max; i++) {
            System.out.println(i);
            if (i % 7 == 0) {
                System.out.println("O valor de i é " + i);
                break;
            }

        }
    }
} */
import java.util.Scanner;

public class Aula09Treinamento {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = -1;
        while (numero != 10) {
// enquanto a variável não for 10, o trecho de código será repetido
            System.out.println("Digite um número: ");
            numero = in.nextInt();
            if (numero == 10) {
                System.out.println("Você acertou");
            } else {
                System.out.println("Você errou");
            }
        }
    }

}