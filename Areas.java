import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selecciona una figura geométrica:");
        System.out.println("1: Círculo");
        System.out.println("2: Cuadrado");
        System.out.println("3: Triángulo");
        
        System.out.print("Ingresa un número del 1 al 3 para seleccionar una figura: ");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingresa el radio del círculo: ");
                double radio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + areaCirculo);
                break;
            case 2:
                System.out.print("Ingresa el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                double areaCuadrado = Math.pow(lado, 2);
                System.out.println("El área del cuadrado es: " + areaCuadrado);
                break;
            case 3:
                System.out.print("Ingresa la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingresa la altura del triángulo: ");
                double altura = scanner.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + areaTriangulo);
                break;
            default:
                System.out.println("Opción no válida. Por favor, ingresa un número del 1 al 3.");
                break;
        }
        
        scanner.close();
    }
}

