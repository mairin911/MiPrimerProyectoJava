import java.util.Scanner;

public class Leer_decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número decimal: ");
        double decimal = scanner.nextDouble();
       scanner.close();

        System.out.println("Número decimal leído: " + decimal);
    }
}