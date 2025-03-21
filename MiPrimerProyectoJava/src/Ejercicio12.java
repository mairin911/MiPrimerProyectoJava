import java.util.Scanner;

public class Ejercicio12 {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de empleados: ");
    int nEmpleados = sc.nextInt();
    int count100to300 = 0;
    int countMoreThan300 = 0;
    int totalSalary = 0;
    sc.close();

    for (int i = 0; i < nEmpleados; i++) {
        System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
        int salary = sc.nextInt();
        totalSalary += salary;
        if (salary >= 100 && salary <= 300) {
            count100to300++;
        } else if (salary > 300) {
            countMoreThan300++;
        }
    }

    System.out.println("Cantidad de empleados que cobran entre $100 y $300: " + count100to300);
    System.out.println("Cantidad de empleados que cobran más de $300: " + countMoreThan300);
    System.out.println("Importe total que gasta la empresa en sueldos: $" + totalSalary);
        }
}
