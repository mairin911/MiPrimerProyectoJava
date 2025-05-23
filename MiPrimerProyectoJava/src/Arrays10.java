public class Arrays10 { 
    public static void main(String[] args) { // Método principal donde inicia la ejecución
        int[][] matriz = new int[5][5]; // Declara y crea una matriz de enteros de 5x5
        java.util.Scanner sc = new java.util.Scanner(System.in); // Crea un objeto Scanner para leer datos desde el teclado

        // Cargar la matriz con valores numéricos enteros
        for (int i = 0; i < 5; i++) { // Recorre las filas de la matriz
            for (int j = 0; j < 5; j++) { // Recorre las columnas de la matriz
                System.out.print("Ingrese el valor para matriz[" + i + "][" + j + "]: "); // Solicita al usuario un valor para la posición actual
                matriz[i][j] = sc.nextInt(); // Lee el valor ingresado y lo almacena en la matriz
            }
        }

        // Sumar y mostrar la suma de cada fila
        for (int i = 0; i < 5; i++) { // Recorre cada fila de la matriz
            int sumaFila = 0; // Inicializa la suma de la fila en cero
            for (int j = 0; j < 5; j++) { // Recorre cada columna de la fila actual
                sumaFila += matriz[i][j]; // Suma el valor de la posición actual a la suma de la fila
            }
            System.out.println("Suma de la fila " + i + ": " + sumaFila); // Muestra la suma total de la fila actual
        }

        // Sumar y mostrar la suma de cada columna
        for (int j = 0; j < 5; j++) { // Recorre cada columna de la matriz
            int sumaColumna = 0; // Inicializa la suma de la columna en cero
            for (int i = 0; i < 5; i++) { // Recorre cada fila de la columna actual
                sumaColumna += matriz[i][j]; // Suma el valor de la posición actual a la suma de la columna
            }
            System.out.println("Suma de la columna " + j + ": " + sumaColumna); // Muestra la suma total de la columna actual
        }
        sc.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
