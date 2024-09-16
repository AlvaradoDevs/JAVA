package FOR;

import java.util.Random;

public class ContarPares {
    public static void main(String[] args) {
        // Generar un array de 10 elementos de tipo entero
        int[] numeros = new int[10];
        Random rand = new Random();

        // Inicializar cada elemento con un número aleatorio menor a 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100); // Generar número aleatorio menor a 100
        }

        // Imprimir todos los elementos del array en una única línea
        System.out.print("Elementos del array: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println(); // Nueva línea después de imprimir el array

        // Contar los elementos pares
        int contadorPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        // Imprimir el total de elementos pares
        System.out.println("Número total de elementos pares: " + contadorPares);
    }
}

