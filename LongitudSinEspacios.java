import java.util.Scanner;

public class LongitudSinEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una cadena de texto:");
        String cadena = scanner.nextLine();

        String cadenaSinEspacios = cadena.replace(" ", "");

        int longitudSinEspacios = cadenaSinEspacios.length();

        System.out.println("La longitud de la cadena sin contar los espacios en blanco es: " + longitudSinEspacios);
        
        scanner.close();
    }
}

