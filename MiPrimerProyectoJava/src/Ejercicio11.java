import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGreaterOrEqual7 = 0;
        int countLessThan7 = 0;
        scanner.close();
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            int nota = scanner.nextInt();
            if (nota >= 7) {
                countGreaterOrEqual7++;
            } else {
                countLessThan7++;
            }
        }

        System.out.println("Cantidad de notas mayores o iguales a 7: " + countGreaterOrEqual7);
        System.out.println("Cantidad de notas menores a 7: " + countLessThan7);
    }
}
