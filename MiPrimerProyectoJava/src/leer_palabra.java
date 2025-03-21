import java.util.Scanner;

public class Leer_palabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.next();
        scanner.close();
        System.out.println("Palabra leída: " + palabra);
    }
}