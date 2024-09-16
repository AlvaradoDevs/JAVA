package INTEGRADORES;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class ManipulandoOraciones {
    private static String oracion = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            mostrarMenu();
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        gestionarOracion(scanner);
                        break;
                    case 2:
                        mostrarCantidadCaracteres();
                        break;
                    case 3:
                        mostrarCantidadPalabras();
                        break;
                    case 4:
                        mostrarPalabrasOrdenadas();
                        break;
                    case 5:
                        mostrarPalabraPorNumero(scanner);
                        break;
                    case 6:
                        buscarPalabra(scanner);
                        break;
                    case 7:
                        modificarPalabra(scanner);
                        break;
                    case 8:
                        agregarContenido(scanner);
                        break;
                    case 9:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida, intentalo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida ingrese un número");
                scanner.nextLine(); // Limpiar el buffer
            }
        } while (opcion != 9);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1. " + (oracion.isEmpty() ? "Crear oración" : "Borrar oración"));
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("6. Buscar palabra dentro de la oración");
        System.out.println("7. Modificar palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void gestionarOracion(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese una nueva oración: ");
            oracion = scanner.nextLine();
        } else {
            System.out.println("Oración borrada.");
            oracion = "";
        }
    }

    private static void mostrarCantidadCaracteres() {
        System.out.println("Cantidad de caracteres en oración: " + oracion.length());
    }

    private static void mostrarCantidadPalabras() {
        if (oracion == null || oracion.trim().isEmpty()) {
            System.out.println("Cantidad de palabras en la oración: 0");
            return;
        }

        int count = 0;
        boolean isInsideWord = false;
        for (char c : oracion.toCharArray()) {
            if (Character.isWhitespace(c)) {
                if (isInsideWord) {
                    count++;
                    isInsideWord = false;
                }
            } else {
                isInsideWord = true;
            }
        }

        if (isInsideWord) {
            count++;
        }

        System.out.println("Cantidad de palabras en la oración: " + count);
    }

    private static void mostrarPalabrasOrdenadas() {
        String[] palabras = oracion.split("\\s+");
        Arrays.sort(palabras);
        System.out.println("Palabras ordenadas alfabéticamente: " + String.join(", ", palabras));
    }

    private static void mostrarPalabraPorNumero(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        String[] palabras = oracion.split("\\s+");
        if (numero < 1 || numero > palabras.length) {
            System.out.println("Número inválido. Intente nuevamente.");
        } else {
            System.out.println("La palabra en la posición " + numero + " es: " + palabras[numero - 1]);
        }
    }

    private static void buscarPalabra(Scanner scanner) {
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine();

        List<String> palabras = Arrays.asList(oracion.split("\\s+"));
        int posicion = palabras.indexOf(palabra);

        if (posicion == -1) {
            System.out.println("Palabra no encontrada.");
        } else {
            System.out.println("Palabra encontrada en la posición: " + (posicion + 1));
            System.out.print("data" + palabras);
        }
    }

    private static void modificarPalabra(Scanner scanner) {
        System.out.print("Ingrese la palabra que desea cambiar: ");
        String palabraAntigua = scanner.nextLine();

        String[] palabras = oracion.split("\\s+");
        int posicion = -1;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabraAntigua)) {
                posicion = i;
                break;
            }
        }

        if (posicion == -1) {
            System.out.println("Palabra no encontrada, intente de nuevo.");
        } else {
            System.out.print("Ingrese la nueva palabra: ");
            String palabraNueva = scanner.nextLine();

            palabras[posicion] = palabraNueva;
            oracion = String.join(" ", palabras);
            System.out.println("Nueva oración: " + oracion);
        }
    }

    private static void agregarContenido(Scanner scanner) {
        System.out.print("Ingrese el contenido a agregar: ");
        String contenido = scanner.nextLine();
        oracion = oracion + " " + contenido;
        System.out.println("Nueva oración: " + oracion);
    }
}
