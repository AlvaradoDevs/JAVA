import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menú de opciones:");
        System.out.println("1: Guardar");
        System.out.println("2: Cargar");
        System.out.println("3: Salir");
        
        System.out.print("Ingresa un número del 1 al 3 para seleccionar una opción: ");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Opción seleccionada: Guardar");
                break;

            case 2:
                System.out.println("Opción seleccionada: Cargar");
                break;

            case 3:
                System.out.println("Opción seleccionada: Salir");
                break;
                
            default:
                System.out.println("Opción no válida. Por favor, ingresa un número del 1 al 3.");
                break;
        }
        
        scanner.close();
    }
}

