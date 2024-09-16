import java.util.Scanner;

public class ContarElementosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];

        System.out.println("Ingrese seis números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int cantidadPares = 0;
        if (numeros[0] % 2 == 0) cantidadPares++;
        if (numeros[1] % 2 == 0) cantidadPares++;
        if (numeros[2] % 2 == 0) cantidadPares++;
        if (numeros[3] % 2 == 0) cantidadPares++;
        if (numeros[4] % 2 == 0) cantidadPares++;
        if (numeros[5] % 2 == 0) cantidadPares++;

        System.out.println("La cantidad de elementos pares es: " + cantidadPares);

        scanner.close();
    }
}
