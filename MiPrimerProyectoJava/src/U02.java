public class U02 { // Define la clase principal llamada U012

    public static void main(String[] args) { // Método principal donde inicia la ejecución del programa
        java.util.Scanner scanner = new java.util.Scanner(System.in); // Crea un objeto Scanner para leer datos desde la entrada estándar (teclado)
        System.out.print("Ingrese la primera nota: "); // Muestra un mensaje solicitando la primera nota
        double nota1 = scanner.nextDouble(); // Lee la primera nota ingresada por el usuario y la almacena en nota1
        System.out.print("Ingrese la segunda nota: "); // Muestra un mensaje solicitando la segunda nota
        double nota2 = scanner.nextDouble(); // Lee la segunda nota ingresada por el usuario y la almacena en nota2
        System.out.print("Ingrese la tercera nota: "); // Muestra un mensaje solicitando la tercera nota
        double nota3 = scanner.nextDouble(); // Lee la tercera nota ingresada por el usuario y la almacena en nota3

        double promedio = (nota1 + nota2 + nota3) / 3; // Calcula el promedio de las tres notas

        if (promedio >= 7) { // Verifica si el promedio es mayor o igual a 7
            System.out.println("Promocionado"); // Si la condición es verdadera, muestra "Promocionado"
        }
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
