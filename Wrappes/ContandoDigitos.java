package Wrappes;

import java.util.Scanner;

public class ContandoDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar un numero");
        int num = sc.nextInt();

        String cadena = Integer.toString(num);
        int contador = 0;
    
        for (int i = 0; i < cadena.length(); i++) {
            boolean caracter = Character.isDigit(cadena.charAt(i));

            if (caracter) {
                contador++;
                // System.out.println("error!");
                
            }
        }
        System.out.println("el numero de digitos es "+ contador);

        sc.close();
    }
}
