import java.util.Scanner;

public class NombreCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Por favor, ingrese su apellido:");
        String apellido = scanner.nextLine();

        String nombreCompleto = nombre.concat(" ").concat(apellido);

        System.out.println("El nombre completo es: " + nombreCompleto);
        
        scanner.close();
    }
}
