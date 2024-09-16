package FOR;

public class CalcularPromedio {
    public static void main(String[] args) {
        // Generar un array de 20 elementos de tipo float
        float[] numeros = {1.2f, 2.3f, 3.4f, 4.5f, 5.6f, 6.7f, 7.8f, 8.9f, 9.0f, 10.1f, 
                           11.2f, 12.3f, 13.4f, 14.5f, 15.6f, 16.7f, 17.8f, 18.9f, 19.0f, 20.1f};

        // Sumar todos los elementos del array
        float suma = 0;
        for (float numero : numeros) {
            suma += numero;
        }

        // Calcular el promedio
        float promedio = suma / numeros.length;

        // Mostrar por consola el resultado de la suma y el promedio de los elementos
        System.out.println("La suma de los elementos del array es: " + suma);
        System.out.println("El promedio de los elementos del array es: " + promedio);
    }
}

