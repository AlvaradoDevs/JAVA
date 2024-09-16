import java.util.Arrays;

public class PromediarElementosv2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Usando streams para encontrar el valor máximo
        int max = Arrays.stream(array)
                        .max()
                        .getAsInt();
        
        System.out.println("El valor máximo es: " + max);
    }
}

