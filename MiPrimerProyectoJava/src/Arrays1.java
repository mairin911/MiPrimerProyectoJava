public class Arrays1 {

    public static void main(String[] args) {
        // Declara un arreglo de enteros con 10 elementos
        int[] vector_numeros = new int[10];
        // Crea una instancia de la clase Random para generar números aleatorios
        java.util.Random rand = new java.util.Random();

        // Inicializa el arreglo con valores aleatorios del 1 al 10
        for (int i = 0; i < vector_numeros.length; i++) {
            // Asigna un número aleatorio entre 1 y 10 a cada posición del arreglo
            vector_numeros[i] = rand.nextInt(10) + 1;
        }

        // Imprime los encabezados de la tabla
        System.out.println("Número\tCuadrado\tCubo");
        // Recorre el arreglo para mostrar cada número, su cuadrado y su cubo
        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = vector_numeros[i];           // Obtiene el número actual del arreglo
            int cuadrado = numero * numero;           // Calcula el cuadrado del número
            int cubo = numero * numero * numero;      // Calcula el cubo del número
            // Imprime el número, su cuadrado y su cubo en formato de tabla
            System.out.println(numero + "\t" + cuadrado + "\t\t" + cubo);
        }
    }
}
