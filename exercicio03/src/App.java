import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int fornSenha, senha = 1234;

        System.out.println("Informe a senha: ");
        fornSenha = teclado.nextInt();

        while (fornSenha != senha){ 

            System.out.println("Senha incorreta, tente novamente.");
            System.out.println("Informe a senha: ");
            fornSenha = teclado.nextInt();
            
        }

        System.out.println("Acesso concedido");
        teclado.close();

    }
}
