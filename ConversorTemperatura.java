import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura: ");
        String temperaturaStr = sc.nextLine();

        System.out.print("Ingrese la unidad de medida (°C/°F): ");
        String unidad = sc.nextLine().toUpperCase();

        try {
            double temperatura = Double.parseDouble(temperaturaStr);

            if (unidad.equals("C")) {
                double fahrenheit = (temperatura * 9 / 5) + 32;
                System.out.println(temperatura + " grados Celsius equivale a " + fahrenheit + " grados Fahrenheit.");
            } else if (unidad.equals("F")) {
                double celsius = (temperatura - 32) * 5 / 9;
                System.out.println(temperatura + " grados Fahrenheit equivale a " + celsius + " grados Celsius.");
            } else {
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
        }

        sc.close();
    }
}
