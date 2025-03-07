import java.util.Scanner;

public class practico_combinado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        byte edad = scanner.nextByte();
        System.out.print("Ingrese altura : ");
        float altura = scanner.nextFloat();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años y mides " + altura + " metros.");
    }
}