import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese el precio del producto: ");
        String entrada = scanner.nextLine();

        try {
            
            double precio = Double.parseDouble(entrada);

            if (precio >= 100) {
                double descuento = precio * 0.10;
                double nuevoPrecio = precio - descuento;
                System.out.printf("Se aplica un descuento del 10%%. El nuevo precio es: ", nuevoPrecio);
            } else {
                System.out.printf("No se aplica descuento. El precio es: ", precio);
            }
        } catch (NumberFormatException e) {
            
            System.out.println("El valor ingresado no es un número válido.");
        } finally {
            
            scanner.close();
        }
    }
}

