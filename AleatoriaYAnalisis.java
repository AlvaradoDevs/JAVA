import java.util.Scanner;

public class AleatoriaYAnalisis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entre 1 y 30: ");
        int numeroLimite = scanner.nextInt();

        if (numeroLimite < 1 || numeroLimite > 30) {
            System.out.println("El número ingresado no está en el rango de 1 a 30.");
        } else {
            int numeroAleatorio = (int) (Math.random() * numeroLimite) + 1;

            double raizCuadrada = Math.sqrt(numeroAleatorio);

            boolean esPrimo = esNumeroPrimo(numeroAleatorio);

            if (esPrimo) {
                System.out.println("El número " + numeroAleatorio + " es primo.");
            } else {
                System.out.println("El número " + numeroAleatorio + " no es primo.");
            }

            System.out.println("El número aleatorio generado es: " + numeroAleatorio);
            System.out.println("La raíz cuadrada de " + numeroAleatorio + " es: " + raizCuadrada);
        }

        scanner.close();
    }

    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

