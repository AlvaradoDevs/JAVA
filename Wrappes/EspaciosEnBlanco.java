package Wrappes;

import java.util.Scanner;

public class EspaciosEnBlanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar una cadena");
        String cadena = sc.nextLine();

        int contador = 0;
    
        for (int i = 0; i < cadena.length(); i++) {
            boolean caracter = Character.isWhitespace(cadena.charAt(i));

            if (caracter == true) {
                contador++;
                // System.out.println("error!");
             
            }    
        }

        System.out.println("El numero de espacios de la cadena es "+contador);

        sc.close();
    }
}