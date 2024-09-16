package Wrappes;

import java.util.Scanner;

public class VerificacionCadena { 
    public static void main(String[] args) { //psvm
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Ingrese una cadena de texto");//sout
        String cadena = sc.nextLine();

        try {
            Double num = Double.valueOf(cadena);
            System.out.println("El numero es "+num );
        } catch (Exception e) {
            System.out.println("Numero no valido");

            sc.close();
        }
   
    }
}