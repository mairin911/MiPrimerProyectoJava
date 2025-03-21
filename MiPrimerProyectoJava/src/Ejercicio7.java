import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println( "ingrese numero: ");
    int numPositivo = sc.nextInt();
    sc.close();

    if (numPositivo>0 && numPositivo<9){
        System.out.println("el numero tiene una cifra");
    } else if (numPositivo>10 && numPositivo<99){
        System.out.println("el numero tiene dos cifras");
    } else if (numPositivo>100 && numPositivo<999){
        System.out.println("el numero tiene tres cifras");
    } else {
        System.out.println("Error");
    }
    }
}
