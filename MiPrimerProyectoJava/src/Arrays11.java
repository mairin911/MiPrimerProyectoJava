public class Arrays11 { // Define la clase principal llamada Arrays11

    public static void main(String[] args) { // Método principal donde inicia la ejecución
        int[][] diagonal = new int[5][5]; // Declara y crea una matriz bidimensional de 5x5

        for (int i = 0; i < 5; i++) { // Bucle externo para recorrer las filas
            for (int j = 0; j < 5; j++) { // Bucle interno para recorrer las columnas
                if (i == j) { // Si el índice de fila es igual al de columna (diagonal principal)
                    diagonal[i][j] = 1; // Asigna 1 en la posición de la diagonal
                } else { // Si no está en la diagonal principal
                    diagonal[i][j] = 0; // Asigna 0 en las demás posiciones
                }
            }
        }

        for (int i = 0; i < 5; i++) { // Segundo bucle externo para imprimir las filas
            for (int j = 0; j < 5; j++) { // Segundo bucle interno para imprimir las columnas
                System.out.print(diagonal[i][j] + " "); // Imprime el valor de la celda seguido de un espacio
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }
    }
}
