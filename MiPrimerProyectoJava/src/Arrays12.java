public class Arrays12 { // Define la clase principal llamada Arrays12

    public static void main(String[] args) { // Método principal donde inicia la ejecución
        int filas = 5; // Declara e inicializa el número de filas de la matriz
        int columnas = 15; // Declara e inicializa el número de columnas de la matriz
        int[][] marco = new int[filas][columnas]; // Crea una matriz bidimensional de enteros con las dimensiones especificadas

        // Bucle para recorrer cada fila
        for (int i = 0; i < filas; i++) {
            // Bucle para recorrer cada columna
            for (int j = 0; j < columnas; j++) {
                // Si está en el borde (primera/última fila o columna)
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    marco[i][j] = 1; // Asigna 1 a las posiciones del borde
                } else {
                    marco[i][j] = 0; // Asigna 0 a las posiciones internas
                }
            }
        }

        // Bucle para imprimir la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(marco[i][j]); // Imprime el valor de cada elemento sin salto de línea
            }
            System.out.println(); // Salta a la siguiente línea después de imprimir una fila
        }
    }
}
