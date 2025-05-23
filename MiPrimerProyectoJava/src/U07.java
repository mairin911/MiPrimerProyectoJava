public class U07 { // Define la clase principal llamada U017

    public static void main(String[] args) { // Método principal donde inicia la ejecución
        java.util.Scanner scanner = new java.util.Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese un número entero positivo de hasta tres cifras: "); // Muestra un mensaje solicitando un número

        int numero = scanner.nextInt(); // Lee el número entero ingresado por el usuario

        if (numero < 0) { // Verifica si el número es negativo
            System.out.println("Error: El número debe ser positivo."); // Muestra un mensaje de error si es negativo
        } else if (numero < 10) { // Verifica si el número tiene 1 cifra
            System.out.println("El número tiene 1 cifra."); // Informa que el número tiene 1 cifra
        } else if (numero < 100) { // Verifica si el número tiene 2 cifras
            System.out.println("El número tiene 2 cifras."); // Informa que el número tiene 2 cifras
        } else if (numero < 1000) { // Verifica si el número tiene 3 cifras
            System.out.println("El número tiene 3 cifras."); // Informa que el número tiene 3 cifras
        } else { // Si el número tiene más de 3 cifras
            System.out.println("Error: El número tiene más de 3 cifras."); // Muestra un mensaje de error
        }
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
