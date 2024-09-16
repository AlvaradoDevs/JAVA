package Wrappes;

import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Ingrese una cadena de texto de un numero entero");
     String cadena1 = sc.nextLine();

     System.out.println("Ingrese una cadena de texto de un numero decimal");
     String cadena2 = sc.nextLine();

     try {
        int num1 = Integer.valueOf(cadena1);
        //System.out.println("La cadena de texto es "+num1);

        double num2 = Double.valueOf(cadena2);
        //System.out.println("La cadena de texto es "+num2);

        double suma = num1 + num2;
        System.out.println("El valor de la suma es "+ suma);

     } catch (Exception e) {
        System.out.println("El valor ingresado no es un numero entero");

        sc.close();
     }
    }
    
}
