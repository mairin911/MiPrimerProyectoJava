public class U011 {
    
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario por consola
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // Inicializa el contador de alumnos con nota mayor o igual a 7
        int countMayores = 0;
        // Inicializa el contador de alumnos con nota menor a 7
        int countMenores = 0;

        // Bucle para pedir la nota de 10 alumnos
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            int nota = scanner.nextInt(); // Lee la nota ingresada por el usuario
            if (nota >= 7) {
                countMayores++; // Incrementa el contador de notas mayores o iguales a 7
            } else {
                countMenores++; // Incrementa el contador de notas menores a 7
            }
        }

        // Muestra la cantidad de alumnos con nota mayor o igual a 7
        System.out.println("Cantidad de alumnos con nota mayor o igual a 7: " + countMayores);
        // Muestra la cantidad de alumnos con nota menor a 7
        System.out.println("Cantidad de alumnos con nota menor a 7: " + countMenores);
        scanner.close(); // Cierra el objeto Scanner
    }
}
