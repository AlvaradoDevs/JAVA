import java.util.Scanner;

public class ReemplazoCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una frase:");
        String frase = scanner.nextLine();

        System.out.println("Por favor, ingrese el carácter que desea reemplazar:");
        char caracter1 = scanner.nextLine().charAt(0);

        System.out.println("Por favor, ingrese el nuevo carácter:");
        char caracter2 = scanner.nextLine().charAt(0);

        String fraseModificada = frase.replace(caracter1, caracter2);

        System.out.println("La frase resultante es: " + fraseModificada);
          
        scanner.close();
    }
}

