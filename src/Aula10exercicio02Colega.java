import java.util.Scanner;

public class Aula10exercicio02Colega {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int [] arrayIdades =  new  int [ 10 ];
        int maiorDeIdade =  0 ;

        for ( int i =  0 ; i < arrayIdades.length; i++ ) {
            System.out.println("Digite a "  + (i +  1 ) +  " º idade: ");
            arrayIdades [i] = scan . nextInt ();
            if (arrayIdades [i] >= 18 ) {
                maiorDeIdade ++ ;
            }
        }
        for ( int idade : arrayIdades) {
            System.out.println(idade);
        }
        System.out.println("Maiores de 18: "  + maiorDeIdade);
    }
}
