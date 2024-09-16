package FOR;

public class ElementosInverso {
    public static void main(String[] args) {
        // Definir un array de enteros
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Imprimir los elementos en orden inverso
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

