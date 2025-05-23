import java.util.Scanner;

public class Arrays9 { 
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer datos del teclado
        final int DIAS = 5; // Define una constante para el número de días (5)
        double[][] temperaturas = new double[DIAS][2]; // Crea una matriz para almacenar temperaturas mínimas y máximas

        // Leer temperaturas mínimas y máximas
        for (int i = 0; i < DIAS; i++) { // Bucle para cada día
            System.out.print("Día " + (i + 1) + " - Temperatura mínima: "); // Pide la temperatura mínima del día
            temperaturas[i][0] = sc.nextDouble(); // Lee y guarda la temperatura mínima
            System.out.print("Día " + (i + 1) + " - Temperatura máxima: "); // Pide la temperatura máxima del día
            temperaturas[i][1] = sc.nextDouble(); // Lee y guarda la temperatura máxima
        }

        // Temperatura media de cada día
        System.out.println("\nTemperatura media de cada día:"); // Muestra un encabezado
        for (int i = 0; i < DIAS; i++) { // Bucle para cada día
            double media = (temperaturas[i][0] + temperaturas[i][1]) / 2.0; // Calcula la media del día
            System.out.printf("Día %d: %.2f\n", (i + 1), media); // Muestra la media con dos decimales
        }

        // Buscar la menor temperatura mínima
        double menorMin = temperaturas[0][0]; // Inicializa con la primera temperatura mínima
        for (int i = 1; i < DIAS; i++) { // Bucle desde el segundo día
            if (temperaturas[i][0] < menorMin) { // Si encuentra una temperatura mínima menor
                menorMin = temperaturas[i][0]; // Actualiza el valor de menorMin
            }
        }

        // Mostrar los días con menor temperatura mínima
        System.out.print("\nDías con menor temperatura mínima (" + menorMin + "): "); // Muestra el valor mínimo encontrado
        boolean primero = true; // Bandera para el formato de la salida
        for (int i = 0; i < DIAS; i++) { // Bucle para cada día
            if (temperaturas[i][0] == menorMin) { // Si la temperatura mínima coincide con la menor
                if (!primero) System.out.print(", "); // Si no es el primero, añade coma
                System.out.print(i + 1); // Muestra el número de día (empezando en 1)
                primero = false; // Cambia la bandera después del primer día
            }
        }
        System.out.println(); // Salto de línea

        // Leer temperatura y mostrar días con esa máxima
        System.out.print("\nIntroduce una temperatura máxima a buscar: "); // Pide una temperatura máxima a buscar
        double tempBuscar = sc.nextDouble(); // Lee la temperatura a buscar
        boolean encontrado = false; // Bandera para saber si se encuentra algún día
        System.out.print("Días con temperatura máxima igual a " + tempBuscar + ": "); // Muestra encabezado
        for (int i = 0; i < DIAS; i++) { // Bucle para cada día
            if (temperaturas[i][1] == tempBuscar) { // Si la temperatura máxima coincide
                System.out.print((i + 1) + " "); // Muestra el número de día
                encontrado = true; // Marca que se encontró al menos un día
            }
        }
        if (!encontrado) { // Si no se encontró ningún día
            System.out.print("No existe ningún día con esa temperatura máxima."); // Mensaje de no encontrado
        }
        System.out.println(); // Salto de línea
        sc.close(); // Cierra el Scanner para liberar recursos
    }
}
