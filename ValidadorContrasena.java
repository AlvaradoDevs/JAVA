import java.util.Scanner;

public class ValidadorContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (esContrasenaSegura(contrasena)) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } else {
            System.out.println("Contraseña no segura. Debe cumplir con los siguientes criterios:");
            if (contrasena.length() < 8) {
                System.out.println("- Al menos 8 caracteres.");
            }
            if (!tieneMayuscula(contrasena)) {
                System.out.println("- Al menos una letra mayúscula.");
            }
            if (!tieneMinuscula(contrasena)) {
                System.out.println("- Al menos una letra minúscula.");
            }
            if (!tieneNumero(contrasena)) {
                System.out.println("- Al menos un número.");
            }
            if (!tieneCaracterEspecial(contrasena)) {
                System.out.println("- Al menos un carácter especial (!, @, #, $, etc.).");
            }
        }

        scanner.close();
    }

    public static boolean esContrasenaSegura(String contrasena) {
        return contrasena.length() >= 8
            && tieneMayuscula(contrasena)
            && tieneMinuscula(contrasena)
            && tieneNumero(contrasena)
            && tieneCaracterEspecial(contrasena);
    }

    public static boolean tieneMayuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneMinuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneNumero(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneCaracterEspecial(String contrasena) {
        String caracteresEspeciales = "!@#$%^&*()-+";
        for (char c : contrasena.toCharArray()) {
            if (caracteresEspeciales.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
}
