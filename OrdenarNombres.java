import java.util.Scanner;

public class OrdenarNombres {
    public static void main(String[] args) {
        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un array de cuatro elementos para almacenar los nombres
        String[] nombres = new String[4];

        // Solicitar al usuario que ingrese los cuatro nombres
        System.out.println("Ingrese cuatro nombres:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Ordenar los nombres alfabéticamente utilizando el método de burbuja
        String temp;
        if (nombres[0].compareTo(nombres[1]) > 0) {
            temp = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = temp;
        }
        if (nombres[1].compareTo(nombres[2]) > 0) {
            temp = nombres[1];
            nombres[1] = nombres[2];
            nombres[2] = temp;
        }
        if (nombres[2].compareTo(nombres[3]) > 0) {
            temp = nombres[2];
            nombres[2] = nombres[3];
            nombres[3] = temp;
        }
        if (nombres[0].compareTo(nombres[1]) > 0) {
            temp = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = temp;
        }
        if (nombres[1].compareTo(nombres[2]) > 0) {
            temp = nombres[1];
            nombres[1] = nombres[2];
            nombres[2] = temp;
        }
        if (nombres[0].compareTo(nombres[1]) > 0) {
            temp = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = temp;
        }

        // Imprimir los nombres ordenados en la consola
        System.out.println("Los nombres ordenados alfabéticamente son:");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);

        // Cerrar el escáner
        scanner.close();
    }
}

