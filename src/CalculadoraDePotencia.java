import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDePotencia{
    public static void main(String[] args) {
        System.out.println("Iniciando a calculadora de potencia");

        double valor, elevado;

   
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
        System.out.println("Digite o valor da base: ");
        //valor = Double.parseDouble(args [0]);
        valor = scanner.nextDouble();

        System.out.println("Digite o valor do expoente: ");
        //elevado = Double.parseDouble(args [1]);
        elevado = scanner.nextDouble();     
        
        scanner.close();
        //valor = 2;
        double result = Math.pow(valor, elevado);
        System.out.println("O valor de "+valor+" elevado na "+elevado+" é "+result);
    
    }
}