import java.util.Scanner;

public class Ejercicio_promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("Por favor, ingrese 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        double promedio = suma / 5.0;
        System.out.println("El promedio de los números ingresados es: " + promedio);

        scanner.close();
    }
}
