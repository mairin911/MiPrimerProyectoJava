import java.util.Scanner;

public class U08 {
    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer datos desde la entrada estándar (teclado)
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario la cantidad total de preguntas
        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = scanner.nextInt();

        // Solicita al usuario la cantidad de respuestas correctas
        System.out.print("Ingrese la cantidad de preguntas contestadas correctamente: ");
        int correctas = scanner.nextInt();

        // Calcula el porcentaje de respuestas correctas, evitando división por cero
        double porcentaje = (totalPreguntas > 0) ? (correctas * 100.0 / totalPreguntas) : 0;

        // Evalúa el porcentaje y muestra el nivel correspondiente
        if (porcentaje >= 90) {
            System.out.println("Nivel máximo");
        } else if (porcentaje >= 75) {
            System.out.println("Nivel medio");
        } else if (porcentaje >= 50) {
            System.out.println("Nivel regular");
        } else {
            System.out.println("Fuera de nivel");
        }

        // Cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}
