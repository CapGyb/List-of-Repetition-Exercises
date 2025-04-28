import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        double invInicial, montFinal;
        int invAno, juroAnual, op;
        boolean rept = true;
        
        do { 
            
            System.out.println("Valor do investimento inicial: ");
            invInicial = teclado.nextDouble();
            System.out.println("Taxa de juros anual: ");
            juroAnual = teclado.nextInt();
            System.out.println("Periodo de investimento em anos: ");
            invAno = teclado.nextInt();
            System.out.println("Opcao de capitalizacao (1 Simples ou 2 Composta): ");
            op = teclado.nextInt();

            if ( op == 1 ) {

                System.out.println("====================================");
                System.out.printf("Investimento Inicial: R$ %.2f\n", invInicial);
                System.out.println("Taxa de Juros Anual: " + juroAnual + "%");
                System.out.println("Periodo de Investimento: " + invAno + " anos");
                System.out.println("Tipo de Capitalizacao: Simples");
                System.out.println();
                System.out.println("Calculo: ");
                System.out.println("M = " + invInicial + " x ( 1 + ( " + juroAnual + " / 100) x " + invAno + " )");
                montFinal = (Double)invInicial * ( 1 + (juroAnual / 100) * invAno);
                System.out.printf("Motante Final: R$ %.2f \n\n", montFinal );
                System.out.println("====================================\n");
                
            } else if ( op == 2 ){

                System.out.println("====================================");
                System.out.printf("Investimento Inicial: R$ %.2f\n", invInicial);
                System.out.println("Taxa de Juros Anual: " + juroAnual + "%");
                System.out.println("Periodo de Investimento: " + invAno + " anos");
                System.out.println("Tipo de Capitalizacao: Composta");
                System.out.println();
                System.out.println("Calculo: ");
                System.out.println("M = " + invInicial + " x ( 1 + ( " + juroAnual + " / 100)) ^ " + invAno );
                montFinal = (Double)invInicial * (Math.pow (1 + (juroAnual / 100), invAno));
                System.out.printf("Motante Final: R$ %.2f \n\n", montFinal );
                System.out.println("====================================\n");

            }
            
            System.out.println("Deseja realizar um novo calculo? (S/N)");
            rept = teclado.next().equalsIgnoreCase("s");
        } while (rept == true);

        teclado.close();
        
    }
}
