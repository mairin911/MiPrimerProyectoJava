import java.util.Scanner;

public class Ejercicio10 {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println( "ingrese sueldo: ");
    int sueldo = sc.nextInt();
    System.out.println( "ingrese años de antiguedad: ");
    int antiguedad = sc.nextInt();
    sc.close();

    if (sueldo<500 && antiguedad>=10){
        System.out.println("sueldo final: " + (sueldo + (sueldo * 0.2)));
    } else if (sueldo<500 && antiguedad<10){
        System.out.println("sueldo final: " + (sueldo + (sueldo * 0.05)));
    } else if (sueldo>=500){
        System.out.println("sueldo final: " + sueldo);
    }
}
}