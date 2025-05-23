public class U015 { // Define la clase pública llamada U0115

    public static void main(String[] args) { // Método principal, punto de entrada del programa
        java.util.Scanner scanner = new java.util.Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        System.out.print("Ingrese el primer nombre: "); // Muestra un mensaje solicitando el primer nombre
        String nombre1 = scanner.nextLine(); // Lee la primera línea ingresada por el usuario y la guarda en nombre1

        System.out.print("Ingrese el segundo nombre: "); // Muestra un mensaje solicitando el segundo nombre
        String nombre2 = scanner.nextLine(); // Lee la segunda línea ingresada por el usuario y la guarda en nombre2

        // Compara los nombres ignorando mayúsculas/minúsculas para determinar el orden alfabético
        if (nombre1.compareToIgnoreCase(nombre2) < 0) {
            System.out.println("Orden alfabético:"); // Muestra el encabezado del orden
            System.out.println(nombre1); // Imprime el primer nombre (alfabéticamente primero)
            System.out.println(nombre2); // Imprime el segundo nombre
        } else {
            System.out.println("Orden alfabético:"); // Muestra el encabezado del orden
            System.out.println(nombre2); // Imprime el segundo nombre (alfabéticamente primero)
            System.out.println(nombre1); // Imprime el primer nombre
        }

        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
