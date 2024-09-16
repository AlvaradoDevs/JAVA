package Wrappes;

import java.util.Scanner;

public class VerificarLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar una cadena");
        String cadena = sc.nextLine();

        boolean letra = true;
    
        for (int i = 0; i < cadena.length(); i++) {
            boolean caracter = Character.isLetter(cadena.charAt(i));

            if (!caracter) {
                letra = false;
                // System.out.println("error!");
                
            }
        }
        if (letra) {
            System.out.println("todos son letras");    
        }
        else {
            System.out.println("la cadena no contiene solo letras");

            sc.close();
        }
    }
}