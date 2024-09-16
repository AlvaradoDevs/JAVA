package FOR;

public class InvertirArray {
    public static void main(String[] args) {
        // Definir un array de enteros
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Invertir el array
        int n = numeros.length;
        for (int i = 0; i < n / 2; i++) {
            // Utilizar una variable auxiliar para intercambiar los elementos
            int temp = numeros[i];
            numeros[i] = numeros[n - 1 - i];
            numeros[n - 1 - i] = temp;
        }

        // Imprimir el array invertido
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

