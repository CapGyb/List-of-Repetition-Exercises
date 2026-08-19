
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 20);
        int tentativas = 0;
        int numero;

        System.out.println("Adivinhe o número entre 1 e 20: ");
        do {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
            tentativas++;

            if (numero < randomNumber) {
                System.out.println("O número é maior que " + numero);
            } else if (numero > randomNumber) {
                System.out.println("O número é menor que " + numero);
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (numero != randomNumber);

        teclado.close();
    }
}
