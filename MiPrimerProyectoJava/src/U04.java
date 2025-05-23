public class U04 { // Define la clase principal llamada U014

    public static void main(String[] args) { // Método principal donde inicia la ejecución del programa
        java.util.Scanner scanner = new java.util.Scanner(System.in); // Crea un objeto Scanner para leer datos desde la consola
        System.out.print("Ingrese el sueldo: "); // Muestra un mensaje solicitando al usuario que ingrese el sueldo
        double sueldo = scanner.nextDouble(); // Lee el valor ingresado por el usuario y lo guarda como un número decimal (double)
        if (sueldo > 3000) { // Verifica si el sueldo es mayor a 3000
            System.out.println("Debe abonar impuestos."); // Si la condición es verdadera, muestra un mensaje indicando que debe pagar impuestos
        }
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
