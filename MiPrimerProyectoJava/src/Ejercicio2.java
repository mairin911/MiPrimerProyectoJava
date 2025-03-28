import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passedCount = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Estudiante " + i + ":");
            System.out.println("Ingrese la primera nota:");
            int Nota1 = sc.nextInt();
            System.out.println("Ingrese la segunda nota:");
            int Nota2 = sc.nextInt();
            System.out.println("Ingrese la tercera nota:");
            int Nota3 = sc.nextInt();
        sc.close();
            double promedio = (Nota1 + Nota2 + Nota3) / 3.0;
            System.out.println("El promedio es: " + promedio);
        
            if (promedio >= 7) {
                System.out.println("Aprobado");
                passedCount++;
            } else {
                System.out.println("Reprobado");
            }
        }
        System.out.println("Cantidad de estudiantes que aprobaron: " + passedCount);
    }
}