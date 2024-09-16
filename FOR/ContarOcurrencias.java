package FOR;

import java.util.Scanner;

public class ContarOcurrencias {
    public static void main(String[] args) {
        // Crear un array de 50 elementos de tipo carácter, inicializado con una frase
        char[] frase = "aprendiendo_java_en_java".toCharArray();

        // Asegurarse de que el array tenga exactamente 50 elementos
        if (frase.length < 50) {
            char[] nuevaFrase = new char[50];
            System.arraycopy(frase, 0, nuevaFrase, 0, frase.length);
            for (int i = frase.length; i < 50; i++) {
                nuevaFrase[i] = ' '; // Rellenar con espacios si es necesario
            }
            frase = nuevaFrase;
        }

        // Solicitar al usuario un carácter objetivo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un carácter objetivo: ");
        char caracterObjetivo = scanner.next().charAt(0);

        // Contar cuántas veces aparece el carácter objetivo en el array
        int contador = 0;
        for (char c : frase) {
            if (c == caracterObjetivo) {
                contador++;
            }
        }

        // Imprimir el resultado por consola
        if (contador > 0) {
            System.out.println("El carácter \"" + caracterObjetivo + "\" aparece " + contador + " veces.");
        } else {
            System.out.println("El carácter \"" + caracterObjetivo + "\" no aparece en la frase.");
        }

        scanner.close();
    }
}

