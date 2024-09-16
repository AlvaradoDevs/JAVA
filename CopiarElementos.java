import java.util.Scanner;

public class CopiarElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOriginal = {1, 2, 3};

        int[] arrayNuevo = new int[5];
        arrayNuevo[0] = arrayOriginal[0];
        arrayNuevo[1] = arrayOriginal[1];
        arrayNuevo[2] = arrayOriginal[2];

        System.out.print("Ingrese el primer número adicional: ");
        arrayNuevo[3] = scanner.nextInt();

        System.out.print("Ingrese el segundo número adicional: ");
        arrayNuevo[4] = scanner.nextInt();

        System.out.println("El contenido del nuevo array es:");
        System.out.println(arrayNuevo[0]);
        System.out.println(arrayNuevo[1]);
        System.out.println(arrayNuevo[2]);
        System.out.println(arrayNuevo[3]);
        System.out.println(arrayNuevo[4]);

        scanner.close();
    }
}
