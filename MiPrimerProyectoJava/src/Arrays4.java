import java.util.Scanner;

public class Arrays4 {

    public static void main(String[] args) {
        // Declara un array de enteros de tamaño 10.
        int[] vector = new int[10];
        // Crea un objeto Scanner para leer la entrada del usuario.
        Scanner sc = new Scanner(System.in);
        // Variable para contar la cantidad de números introducidos.
        int count = 0;

        // Bucle para leer hasta 10 números o hasta que se introduzca un número negativo.
        for (int i = 0; i < vector.length; i++) {
            // Solicita al usuario que introduzca un número entero.
            System.out.print("Introduce un número entero (negativo para terminar): ");
            // Lee el número introducido por el usuario.
            int num = sc.nextInt();
            // Si el número es negativo, termina la entrada de datos.
            if (num < 0) {
                break;
            }
            // Almacena el número en el array.
            vector[i] = num;
            // Incrementa el contador de números introducidos.
            count++;
        }

        // Muestra los elementos introducidos en el array.
        System.out.println("Elementos introducidos en el vector:");
        // Recorre el array hasta la cantidad de números introducidos y los imprime.
        for (int i = 0; i < count; i++) {
            System.out.print(vector[i] + " ");
        }
        // Imprime una línea en blanco al final.
        System.out.println();
        // Cierra el objeto Scanner.
        sc.close();
    }
}