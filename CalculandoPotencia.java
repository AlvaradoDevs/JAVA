import java.util.Scanner;

public class CalculandoPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base (número entero): ");
        int base = scanner.nextInt();

        System.out.print("Ingresa el exponente (número entero): ");
        int exponente = scanner.nextInt();

        double resultado = Math.pow(base, exponente);

        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
        
        scanner.close();
    }
}
