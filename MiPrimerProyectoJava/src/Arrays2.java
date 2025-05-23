public class Arrays2 {

    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario desde la consola
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Declara un arreglo de Strings llamado 'original' con espacio para 5 elementos
        String[] original = new String[5];

        // Declara un arreglo de Strings llamado 'inverso' con espacio para 5 elementos
        String[] inverso = new String[5];

        // Muestra un mensaje solicitando al usuario que introduzca 5 cadenas de texto
        System.out.println("Introduce 5 cadenas de texto:");

        // Bucle para leer 5 líneas de texto y almacenarlas en el arreglo 'original'
        for (int i = 0; i < original.length; i++) {
            original[i] = scanner.nextLine(); // Lee una línea y la guarda en la posición i
        }

        // Bucle para invertir el arreglo 'original' y guardar el resultado en 'inverso'
        for (int i = 0; i < original.length; i++) {
            inverso[i] = original[original.length - 1 - i]; // Copia desde el final hacia el principio
        }

        // Muestra un mensaje indicando que se va a imprimir el vector en orden inverso
        System.out.println("Vector en orden inverso:");

        // Bucle mejorado para imprimir cada elemento del arreglo 'inverso'
        for (String s : inverso) {
            System.out.println(s); // Imprime la cadena actual
        }

        // Cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}
