import java.util.Scanner;

public class CaracterEnPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una palabra:");
        String palabra = scanner.nextLine();

        System.out.println("Por favor, ingrese un carácter:");
        char caracter = scanner.nextLine().charAt(0);

        int posicion = palabra.indexOf(caracter);

        if (posicion != -1) {
            System.out.println("El carácter '" + caracter + "' se encuentra en la palabra en la posición " + posicion + ".");
        } else {
            System.out.println("El carácter '" + caracter + "' no se encuentra en la palabra.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
