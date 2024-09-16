package FOR;

public class ConcatenarElementos {
    public static void main(String[] args) {
        // Crear un array de cadenas
        String[] palabras = {"Hola", "mundo", "esto", "es", "Java"};

        // Concatenar los elementos en una sola cadena, separados por espacios
        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            resultado.append(palabra).append(" ");
        }

        // Convertir StringBuilder a String y eliminar el último espacio
        String resultadoFinal = resultado.toString().trim();

        // Imprimir el resultado por consola
        System.out.println("La cadena concatenada es: " + resultadoFinal);
    }
}

