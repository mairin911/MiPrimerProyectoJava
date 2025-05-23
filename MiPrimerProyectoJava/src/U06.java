public class U06 { // Declaración de la clase principal

    public static void main(String[] args) { // Método principal, punto de entrada del programa
        java.util.Scanner scanner = new java.util.Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese un número entero: "); // Solicita al usuario que ingrese un número
        int numero = scanner.nextInt(); // Lee el número entero ingresado por el usuario

        // Estructura condicional para determinar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo."); // Si el número es mayor que cero
        } else if (numero < 0) {
            System.out.println("El número es negativo."); // Si el número es menor que cero
        } else {
            System.out.println("El número es nulo (cero)."); // Si el número es igual a cero
        }
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
