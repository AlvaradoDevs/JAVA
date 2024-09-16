import java.util.Scanner;

public class BuscarElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.println("Ingrese tres números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Ingrese un número para buscar en el array: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = (numeros[0] == numeroBuscado) || 
                             (numeros[1] == numeroBuscado) || 
                             (numeros[2] == numeroBuscado);

        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " está presente en el array.");
        } else {
            System.out.println("El número " + numeroBuscado + " no está presente en el array.");
        }

        scanner.close();
    }
}

