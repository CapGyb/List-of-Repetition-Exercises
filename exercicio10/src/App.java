
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int num, fatorial = 1;

        System.out.println("Digite um número: ");
        num = teclado.nextInt();

        if (num < 0) {

            System.out.println("Número inválido!");

        } else {

            for (int i = 1; i <= num; i++) {
                fatorial = i * fatorial;
            }
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);

        teclado.close();

    }
}
