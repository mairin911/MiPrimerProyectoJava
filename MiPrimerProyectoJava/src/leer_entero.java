import java.util.Scanner;

public class Leer_entero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
       scanner.close();

        System.out.println("Número entero leído: " + numero);
    }
}