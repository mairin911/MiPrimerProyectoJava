public class U01 { // Define la clase principal llamada U011

    public static void main(String[] args) { // Método principal donde inicia la ejecución del programa
        java.util.Scanner scanner = new java.util.Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        System.out.print("Ingrese el primer número: "); // Muestra un mensaje solicitando el primer número
        int num1 = scanner.nextInt(); // Lee el primer número ingresado por el usuario

        System.out.print("Ingrese el segundo número: "); // Muestra un mensaje solicitando el segundo número
        int num2 = scanner.nextInt(); // Lee el segundo número ingresado por el usuario

        if (num1 > num2) { // Verifica si el primer número es mayor que el segundo
            int suma = num1 + num2; // Calcula la suma de los dos números
            int diferencia = num1 - num2; // Calcula la diferencia entre los dos números
            System.out.println("La suma es: " + suma); // Muestra la suma
            System.out.println("La diferencia es: " + diferencia); // Muestra la diferencia
        } else { // Si el primer número no es mayor que el segundo
            int producto = num1 * num2; // Calcula el producto de los dos números
            if (num2 != 0) { // Verifica que el segundo número no sea cero para evitar división por cero
                double division = (double) num1 / num2; // Realiza la división y convierte el resultado a double
                System.out.println("El producto es: " + producto); // Muestra el producto
                System.out.println("La división es: " + division); // Muestra el resultado de la división
            } else { // Si el segundo número es cero
                System.out.println("No se puede dividir por cero."); // Muestra un mensaje de error por división por cero
                System.out.println("El producto es: " + producto); // Muestra el producto aunque la división no sea posible
            }
        }

        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
