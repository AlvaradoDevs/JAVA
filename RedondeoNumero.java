import java.util.Scanner;

public class RedondeoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        long numeroRedondeado = Math.round(numeroDecimal);

        System.out.println("El valor redondeado de " + numeroDecimal + " es: " + numeroRedondeado);
        
        scanner.close();
    }
}
