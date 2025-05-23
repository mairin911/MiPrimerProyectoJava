import java.util.Arrays;
import java.util.Random;

public class Arrays5 {

    public static void main(String[] args) {
        int size = 10; // Define el tamaño del arreglo (vector)
        int[] numeros = new int[size]; // Crea un arreglo de enteros con el tamaño especificado
        Random rand = new Random(); // Crea un objeto Random para generar números aleatorios

        // Inicializa el arreglo con valores aleatorios entre 0 y 99
        for (int i = 0; i < size; i++) {
            numeros[i] = rand.nextInt(100); // Asigna un número aleatorio al elemento i
        }

        System.out.println("Vector original:"); // Muestra un mensaje indicando el vector original
        System.out.println(Arrays.toString(numeros)); // Imprime el arreglo original

        // Ordena el arreglo de menor a mayor
        Arrays.sort(numeros);

        System.out.println("Vector ordenado de menor a mayor:"); // Mensaje para el vector ordenado
        System.out.println(Arrays.toString(numeros)); // Imprime el arreglo ordenado
    }
}