package OPERADORES;
import java.util.Scanner;

public class Scannertest {
    public static void main(String[] args) {
        Scanner practica = new Scanner(System.in);

        System.out.print("Ingresa un nombre completo: ");
        String nombreCompleto = practica.nextLine();
        
        System.out.print("Ingresa tu edad actual: ");
        int edad = practica.nextInt();

        System.out.println(nombreCompleto+" tiene "+edad+" años");

        practica.close();

    }

}
