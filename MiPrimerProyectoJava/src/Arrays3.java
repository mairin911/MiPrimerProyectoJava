public class Arrays3 {

    public static void main(String[] args) {
        // Crea un objeto Scanner para leer datos desde la entrada estándar (teclado)
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Declara un array de 5 elementos para almacenar las notas
        double[] notas = new double[5];

        // Variable para acumular la suma de las notas
        double suma = 0;

        // Inicializa la variable para la nota máxima con el valor más bajo posible
        double max = Double.NEGATIVE_INFINITY;

        // Inicializa la variable para la nota mínima con el valor más alto posible
        double min = Double.POSITIVE_INFINITY;

        // Bucle para pedir las 5 notas al usuario
        for (int i = 0; i < notas.length; i++) {
            double nota;
            // Solicita una nota válida (entre 0 y 10)
            do {
                System.out.print("Introduce la nota " + (i + 1) + " (0-10): ");
                nota = scanner.nextDouble();
            } while (nota < 0 || nota > 10);

            // Guarda la nota en el array
            notas[i] = nota;

            // Suma la nota al acumulador
            suma += nota;

            // Actualiza la nota máxima si es necesario
            if (nota > max) max = nota;

            // Actualiza la nota mínima si es necesario
            if (nota < min) min = nota;
        }

        // Muestra todas las notas introducidas
        System.out.print("Notas introducidas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();

        // Calcula y muestra la nota media con dos decimales
        System.out.printf("Nota media: %.2f\n", suma / notas.length);

        // Muestra la nota más alta
        System.out.println("Nota más alta: " + max);

        // Muestra la nota más baja
        System.out.println("Nota más baja: " + min);

        // Cierra el Scanner para liberar recursos
        scanner.close();
    }
}
