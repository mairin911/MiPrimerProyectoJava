public class U05 {
    
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario desde la consola
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Solicita al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt(); // Lee el primer número

        // Solicita al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt(); // Lee el segundo número

        // Compara los dos números ingresados
        if (num1 == num2) {
            // Si los números son iguales, muestra un mensaje indicando que deben ser distintos
            System.out.println("Los números deben ser distintos.");
        } else if (num1 > num2) {
            // Si el primer número es mayor, lo muestra como el mayor
            System.out.println("El mayor es: " + num1);
        } else {
            // Si el segundo número es mayor, lo muestra como el mayor
            System.out.println("El mayor es: " + num2);
        }

        // Cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}
