import java.util.Scanner;

public class Ejercicio2 {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("ingrese una nota");
     int Nota1 = sc.nextInt();
     System.out.println("ingrese una nota");
     int Nota2 = sc.nextInt();
     System.out.println("ingrese una nota");
     int Nota3 = sc.nextInt();
     sc.close();

     double promedio = (Nota1 + Nota2 + Nota3) / 3.0;
            System.out.println("el promedio es: " + promedio);

     if (promedio>= 7){
        System.out.println("aprobado");
    }
    else {
        System.out.println("reprobado");
 }
    }
}