import java.util.Scanner;

// Clase principal
public class U012 {
    public static void main(String[] args) {
        // Se importa Scanner para leer datos desde la consola
        Scanner scanner = new Scanner(System.in);

        // Solicita la cantidad de empleados
        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();

        // Inicializa contadores y acumulador
        int count100a300 = 0; // Contador de empleados con sueldo entre $100 y $300
        int countMas300 = 0;  // Contador de empleados con sueldo mayor a $300 hasta $500
        double totalSueldos = 0; // Acumulador del total de sueldos

        // Bucle para ingresar el sueldo de cada empleado
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            double sueldo = scanner.nextDouble();

            // Verifica el rango del sueldo e incrementa el contador correspondiente
            if (sueldo >= 100 && sueldo <= 300) {
                count100a300++;
            } else if (sueldo > 300 && sueldo <= 500) {
                countMas300++;
            } else {
                // Si el sueldo está fuera del rango permitido, muestra mensaje y repite el ingreso
                System.out.println("Sueldo fuera de rango ($100 - $500).");
                i--; // Decrementa el contador para repetir este empleado
                continue;
            }

            // Suma el sueldo al total
            totalSueldos += sueldo;
        }

        // Muestra los resultados
        System.out.println("Empleados que cobran entre $100 y $300: " + count100a300);
        System.out.println("Empleados que cobran más de $300: " + countMas300);
        System.out.println("Total que gasta la empresa en sueldos: $" + totalSueldos);

        // Cierra el scanner
        scanner.close();
    }
}