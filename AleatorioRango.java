import java.util.Scanner;

public class AleatorioRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el límite inferior (número entero): ");
        int limiteInferior = scanner.nextInt();

        System.out.print("Ingresa el límite superior (número entero): ");
        int limiteSuperior = scanner.nextInt();

        if (limiteInferior > limiteSuperior) {
            System.out.println("El límite inferior debe ser menor o igual al límite superior.");
        } else {
            int numeroAleatorio = (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;

            System.out.println("El número aleatorio generado entre " + limiteInferior + " y " + limiteSuperior + " es: " + numeroAleatorio);
        }

        scanner.close();
    }
}
