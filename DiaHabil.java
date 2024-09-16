import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número del 1 al 7 para representar un día de la semana: ");
        int dia = scanner.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Lunes - Día hábil");
                break;
            case 2:
                System.out.println("Martes - Día hábil");
                break;
            case 3:
                System.out.println("Miércoles - Día hábil");
                break;
            case 4:
                System.out.println("Jueves - Día hábil");
                break;
            case 5:
                System.out.println("Viernes - Día hábil");
                break;
            case 6:
                System.out.println("Sábado - Día no hábil");
                break;
            case 7:
                System.out.println("Domingo - Día no hábil");
                break;
            default:
                System.out.println("Número no válido. Por favor, ingresa un número del 1 al 7.");
                break;
        }
        
        scanner.close();
    }
}
