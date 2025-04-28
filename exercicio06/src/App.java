import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int selet;

        do { 

            System.out.println("Menu: \n1.Adicionar\n2.Remover\n3.Sair");
            selet = teclado.nextInt();

            if (selet == 1) {
                
                System.out.println("Adicionar concluido!");
                System.out.println();

            }else if (selet == 2) {
                
                System.out.println("Remover concluido!");
                System.out.println();

            }
            
        } while (selet != 3);
        
        teclado.close();
        
    }
}