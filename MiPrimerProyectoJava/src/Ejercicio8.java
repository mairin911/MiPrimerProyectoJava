import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de preguntas correctas: ");
        int preguntasCorrectas = scanner.nextInt();

        double porcentaje = ((double) preguntasCorrectas / totalPreguntas) * 100;

        if (porcentaje >= 90) {
            System.out.println("Nivel máximo");
        } else if (porcentaje >= 75) {
            System.out.println("Nivel medio");
        } else if (porcentaje >= 50) {
            System.out.println("Nivel regular");
        } else {
            System.out.println("Fuera de nivel");
        }

        scanner.close();
    }
}
