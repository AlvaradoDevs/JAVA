import java.util.Scanner;

public class AreaPerimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selecciona una figura geométrica:");
        System.out.println("1: Círculo");
        System.out.println("2: Rectángulo");
        
        System.out.print("Ingresa un número para seleccionar una figura: ");
        int figura = scanner.nextInt();
        
        switch (figura) {
            case 1:
                System.out.print("Ingresa el valor del radio del círculo: ");
                double radio = scanner.nextDouble();
                
                System.out.println("Selecciona la operación:");
                System.out.println("1: Área");
                System.out.println("2: Perímetro");
                
                System.out.print("Ingresa un número para seleccionar la operación: ");
                int operacionCirculo = scanner.nextInt();
                
                switch (operacionCirculo) {
                    case 1:
                        double areaCirculo = Math.PI * Math.pow(radio, 2);
                        System.out.println("El área del círculo es: " + areaCirculo);
                        break;
                    case 2:
                        double perimetroCirculo = 2 * Math.PI * radio;
                        System.out.println("El perímetro del círculo es: " + perimetroCirculo);
                        break;
                    default:
                        System.out.println("Operación no válida.");
                        break;
                }
                break;
            case 2:
                System.out.print("Ingresa el valor de la base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingresa el valor de la altura del rectángulo: ");
                double altura = scanner.nextDouble();
                
                System.out.println("Selecciona la operación:");
                System.out.println("1: Área");
                System.out.println("2: Perímetro");
                
                System.out.print("Ingresa un número para seleccionar la operación: ");
                int operacionRectangulo = scanner.nextInt();
                
                switch (operacionRectangulo) {
                    case 1:
                        double areaRectangulo = base * altura;
                        System.out.println("El área del rectángulo es: " + areaRectangulo);
                        break;
                    case 2:
                        double perimetroRectangulo = 2 * (base + altura);
                        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);
                        break;
                    default:
                        System.out.println("Operación no válida.");
                        break;
                }
                break;
            default:
                System.out.println("Figura no válida. Por favor, ingresa 1 o 2.");
                break;
        }
        
        scanner.close();
    }
}

