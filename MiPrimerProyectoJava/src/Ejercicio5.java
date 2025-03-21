import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println( "ingrese primer numero: ");
     int numUno = sc.nextInt();
     System.out.println( "ingrese segundo numero: ");
     int numDos = sc.nextInt();
        sc.close();

        if (numUno > numDos){
            System.out.println("el primer numero es mayor que el segundo");
        } else if (numUno < numDos){
            System.out.println("el primer numero es menor que el segundo");
        } 
}
}
