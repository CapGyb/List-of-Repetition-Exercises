import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int num = 0, some = 0;

        while(num >= 0 ){

            System.out.println("Informe o numero: ");
            num = teclado.nextInt();

            if(num > 0){

                some = some + num;

            }

        }

        System.out.println("A soma dos valores é " + some);

        teclado.close();

    }
}
