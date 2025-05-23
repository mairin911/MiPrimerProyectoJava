import java.util.Scanner;

public class U03 { // Define la clase pública llamada U013
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario desde la consola
        System.out.print("Ingrese un número positivo de uno o dos dígitos (1..99): "); // Muestra un mensaje solicitando un número al usuario
        int numero = scanner.nextInt(); // Lee el número ingresado por el usuario y lo almacena en la variable 'numero'

        if (numero >= 1 && numero <= 9) { // Verifica si el número tiene un solo dígito (entre 1 y 9)
            System.out.println("El número tiene un dígito."); // Muestra mensaje indicando que el número tiene un dígito
        } else if (numero >= 10 && numero <= 99) { // Verifica si el número tiene dos dígitos (entre 10 y 99)
            System.out.println("El número tiene dos dígitos."); // Muestra mensaje indicando que el número tiene dos dígitos
        } else { // Si el número no está en el rango de 1 a 99
            System.out.println("El número ingresado no es válido."); // Muestra mensaje de error
        }
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}