import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
        // Array de nombres de los meses
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        // Array con la cantidad de días de cada mes (sin considerar años bisiestos)
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que introduzca el número de mes
        System.out.print("Introduce el número de mes (1-12): ");
        // Leer el número de mes introducido por el usuario
        int numMes = sc.nextInt();

        // Verificar si el número de mes es válido (entre 1 y 12)
        if (numMes >= 1 && numMes <= 12) {
            // Mostrar el nombre del mes y la cantidad de días correspondiente
            System.out.println("El mes de " + meses[numMes - 1] + " tiene " + dias[numMes - 1] + " días.");
        } else {
            // Mensaje de error si el número de mes no es válido
            System.out.println("Número de mes no válido.");
        }
        // Cerrar el Scanner
        sc.close();
    }
}
