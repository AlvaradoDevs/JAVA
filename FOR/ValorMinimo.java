package FOR;

public class ValorMinimo {
    public static void main(String[] args) {
        // Definir un array de enteros
        int[] numeros = {15, 3, 9, 12, 45, 2, 8, 6};

        // Encontrar el valor mínimo en el array
        int valorMinimo = numeros[0]; // Asumir que el primer elemento es el mínimo

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < valorMinimo) {
                valorMinimo = numeros[i];
            }
        }

        // Imprimir el valor mínimo
        System.out.println("El valor mínimo en el array es: " + valorMinimo);
    }
}

