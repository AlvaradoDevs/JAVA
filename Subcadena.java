import java.util.Scanner;

public class Subcadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una frase:");
        String frase = scanner.nextLine();

        System.out.println("Por favor, ingrese el índice inicial:");
        int indiceInicial = scanner.nextInt();

        System.out.println("Por favor, ingrese el índice final:");
        int indiceFinal = scanner.nextInt();

        String subcadena = frase.substring(indiceInicial, indiceFinal);

        System.out.println("La subcadena resultante es: " + subcadena);
        
        scanner.close();
    }
}
