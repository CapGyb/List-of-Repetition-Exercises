import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in); 

        int []vetor = new int[10];
        int soma = 0;

        for(int i = 0; i < 10; i++){

            System.out.println("Informe um numero para posicao " + i + ": ");
            vetor[i] = teclado.nextInt();

        }
        teclado.close();

        for(int i = 0; i < 10; i++){

            soma += vetor[i];

        }

        System.out.println("\nA soma total do vetor é " + soma + "!");

    }
}