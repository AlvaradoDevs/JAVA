import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Por favor, ingrese un número: ");
        String entrada = scanner.nextLine();

        try {
            // Intentar convertir la entrada a un número entero
            int numero = Integer.parseInt(entrada);

            // Determinar la divisibilidad por 5, por 3, por ambos o por ninguno
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("El número es divisible por 3 y por 5.");
            } else if (numero % 3 == 0) {
                System.out.println("El número es divisible por 3.");
            } else if (numero % 5 == 0) {
                System.out.println("El número es divisible por 5.");
            } else {
                System.out.println("El número no es divisible ni por 3 ni por 5.");
            }
        } catch (NumberFormatException e) {
            // Capturar la excepción si la entrada no es un número válido
            System.out.println("El valor ingresado no es un número válido.");
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}


