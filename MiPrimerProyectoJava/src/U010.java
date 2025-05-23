public class U010 {
    
    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer datos desde la entrada estándar (teclado)
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Solicita al usuario que ingrese el sueldo del operario
        System.out.print("Ingrese el sueldo del operario: ");
        double sueldo = scanner.nextDouble(); // Lee el sueldo como número decimal

        // Solicita al usuario que ingrese los años de antigüedad
        System.out.print("Ingrese los años de antigüedad: ");
        int antiguedad = scanner.nextInt(); // Lee la antigüedad como número entero

        // Si el sueldo es menor a 500
        if (sueldo < 500) {
            // Si la antigüedad es mayor o igual a 10 años
            if (antiguedad >= 10) {
                sueldo = sueldo * 1.20; // Aumenta el sueldo en un 20%
            } else {
                sueldo = sueldo * 1.05; // Si no, aumenta el sueldo en un 5%
            }
        }

        // Muestra el sueldo final a pagar, con dos decimales
        System.out.printf("El sueldo a pagar es: %.2f\n", sueldo);
        scanner.close(); // Cierra el scanner para liberar recursos
    }
}
