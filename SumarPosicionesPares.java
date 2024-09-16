import java.util.Scanner;

public class SumarPosicionesPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Ingrese cinco números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int sumaPares = numeros[0] + numeros[2] + numeros[4];

        System.out.println("La suma de los elementos en posiciones pares es: " + sumaPares);
        
        scanner.close();
    }
}

