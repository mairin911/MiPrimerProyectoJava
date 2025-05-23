import java.util.ArrayList;
import java.util.Scanner;


public class Arrays8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        ArrayList<String> nombres = new ArrayList<>(); // Lista para guardar los nombres de los alumnos
        ArrayList<Integer> edades = new ArrayList<>(); // Lista para guardar las edades de los alumnos

        // Bucle para pedir datos hasta que el usuario escriba '*'
        while (true) {
            System.out.print("Introduce el nombre del alumno (* para terminar): ");
            String nombre = sc.nextLine(); // Lee el nombre del alumno
            if (nombre.equals("*")) { // Si el nombre es '*', termina el bucle
                break;
            }
            System.out.print("Introduce la edad de " + nombre + ": ");
            int edad = Integer.parseInt(sc.nextLine()); // Lee la edad y la convierte a entero
            nombres.add(nombre); // Añade el nombre a la lista
            edades.add(edad); // Añade la edad a la lista
        }

        System.out.println("\nAlumnos mayores de edad:");
        // Recorre las listas y muestra los alumnos mayores o iguales a 18 años
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " (" + edades.get(i) + " años)");
            }
        }

        int maxEdad = -1; // Variable para guardar la mayor edad encontrada
        // Busca la mayor edad en la lista de edades
        for (int edad : edades) {
            if (edad > maxEdad) {
                maxEdad = edad;
            }
        }

        System.out.println("\nAlumnos con mayor edad (" + maxEdad + " años):");
        // Muestra los nombres de los alumnos que tienen la mayor edad
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == maxEdad) {
                System.out.println(nombres.get(i));
            }
        }
        sc.close(); // Cierra el Scanner para liberar recursos
    }
    
}
