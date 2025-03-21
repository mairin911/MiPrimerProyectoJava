import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese sueldo: ");
        int sueldo = scanner.nextInt();
        scanner.close();

        if (sueldo>3000){
            System.out.println("debe abonar impuestos");
        } else {
            System.out.println("no debe abonar impuestos");
            }
        }
    }