package Wrappes;

import java.util.Scanner;

public class CadenaANumero {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Ingrese una cadena de texto de un numero entero");
     String cadena = sc.nextLine();

     try {
        int num = Integer.valueOf(cadena);
        System.out.println("La cadena de texto es "+num);

     } catch (Exception e) {
        System.out.println("El valor ingresado no es un numero entero");
     }
     sc.close();
    }
    
}

