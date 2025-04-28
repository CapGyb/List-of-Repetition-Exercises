
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int n;

        do { 

            System.out.println("Informe o numero entre 1 a 100: ");
            n = teclado.nextInt();


        } while ( n > 1 && n > 100);

        System.out.println(n);

        teclado.close();

    }
}
