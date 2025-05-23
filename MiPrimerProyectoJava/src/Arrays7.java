public class Arrays7 {

    public static void main(String[] args) {
        // Crea un objeto Scanner para leer datos desde la entrada estándar (teclado)
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Declara e inicializa tres arreglos de enteros de tamaño 5
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        // Solicita al usuario que ingrese los valores para el primer vector
        System.out.println("Ingrese los valores para vector1:");
        for (int i = 0; i < 5; i++) {
            // Lee un entero y lo almacena en la posición i de vector1
            vector1[i] = sc.nextInt();
        }

        // Solicita al usuario que ingrese los valores para el segundo vector
        System.out.println("Ingrese los valores para vector2:");
        for (int i = 0; i < 5; i++) {
            // Lee un entero y lo almacena en la posición i de vector2
            vector2[i] = sc.nextInt();
        }

        // Suma los elementos correspondientes de vector1 y vector2, y guarda el resultado en vector3
        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        // Muestra el resultado de la suma de los dos vectores
        System.out.println("vector3 = vector1 + vector2:");
        for (int i = 0; i < 5; i++) {
            // Imprime cada elemento de vector3 seguido de un espacio
            System.out.print(vector3[i] + " ");
        }
        System.out.println(); // Salto de línea al final

        // Cierra el objeto Scanner para liberar recursos
        sc.close();
    }
}
