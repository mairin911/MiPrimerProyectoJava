import java.util.Scanner;
public class proyecto_mini {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numeroUno1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numeroDos2 = scanner.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double numeroTres3 = scanner.nextDouble();
        double media = (numeroUno1 + numeroDos2 + numeroTres3) / 3;
        System.out.println("La media de los tres números es: " + media);
        scanner.close();
        
    }
}