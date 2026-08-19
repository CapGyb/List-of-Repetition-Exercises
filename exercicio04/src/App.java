public class App {
    public static void main(String[] args) throws Exception {

        int num1 = 0,num2 = 1,aux = 0, i = 0;

        while ( i < 10 ) { 
            
            System.out.println(num1 + num2);
            aux = num1 + num2;
            num1 = num2;
            num2 = aux;

            i++;

        }

    }
}
