import java.util.Scanner;

public class CadenaANumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa una cadena que represente un número entero: ");
            String cadena = scanner.nextLine();

            int numero = Integer.parseInt(cadena);
            System.out.println("El número entero es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no puede ser convertida en un número entero.");
        } finally {
            scanner.close();
        }
    }
}
