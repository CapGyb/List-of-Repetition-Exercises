
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int nota;
        boolean continuar = true;

        do {
            System.out.println("Digite a nota do aluno: ");
            nota = teclado.nextInt();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                cont++;
            } else {
                System.out.println("Nota inválida!");
            }
            System.out.println("Deseja inserir outra nota? (s/n)");
            continuar = teclado.next().equalsIgnoreCase("s");
        } while (continuar == true);

        teclado.close();

        System.out.println("A media das notas é: " + (double) (soma / cont));

    }
}