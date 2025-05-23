public class Arrays13 { // Define la clase principal llamada Arrays13
    
    public static void main(String[] args) { // Método principal donde inicia la ejecución
        String[] nombre = {"Juan", "Pedro", "Luis", "Ana", "Maria"}; // Arreglo de nombres de conductores
        int[][] kms = { // Matriz que almacena los kilómetros recorridos por cada conductor en 7 días
            {120, 135, 110, 140, 150, 160, 130},
            {100, 115, 120, 110, 105, 100, 120},
            {90, 100, 95, 110, 120, 130, 125},
            {130, 140, 135, 145, 150, 155, 160},
            {110, 120, 115, 125, 130, 135, 140}
        };
        int[] total_kms = new int[nombre.length]; // Arreglo para guardar el total de kilómetros por conductor

        for (int i = 0; i < nombre.length; i++) { // Recorre cada conductor
            int suma = 0; // Inicializa la suma de kilómetros para el conductor actual
            for (int j = 0; j < kms[i].length; j++) { // Recorre los 7 días del conductor actual
                suma += kms[i][j]; // Suma los kilómetros del día actual al total
            }
            total_kms[i] = suma; // Guarda el total de kilómetros en el arreglo correspondiente
        }

        System.out.println("Conductor\tTotal Kms"); // Imprime el encabezado de la tabla
        for (int i = 0; i < nombre.length; i++) { // Recorre cada conductor para mostrar resultados
            System.out.println(nombre[i] + "\t\t" + total_kms[i]); // Imprime el nombre y el total de kilómetros
        }
    }
}
